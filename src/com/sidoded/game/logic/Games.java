package com.sidoded.game.logic;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Scanner;

public class Games {
    boolean gameOn = true;
    Path savePath = Path.of("d://Test//saves.txt");
    Player player = new Player();
    Scanner scanner;
    SaveGame saveGame;
    CheckSave checkSave;
    Shop shop;

    public Games() {
        this.scanner = new Scanner(System.in);
        this.saveGame = new SaveGame();
        this.checkSave = new CheckSave();
        this.shop = new Shop();
    }

    public void startGame() throws IOException {
        Registration registration = new Registration();
        if (!Files.exists(this.savePath, new LinkOption[0])) {
            this.player.setLanguage(LanguageChoice.getLanguage());
            Massage.startMassage(this.player.getLanguage());
            this.player.setName(registration.registration(this.player.getLanguage()));
        } else {
            String[] infoArray = this.checkSave.checkSave().split("-");
            this.player.setName(infoArray[0]);
            this.player.setLvl(Integer.parseInt(infoArray[1]));
            this.player.setScore(Long.parseLong(infoArray[2]));
            this.player.setLanguage(infoArray[3]);
            Massage.startMassage(this.player.getLanguage());
            System.out.println();
            Massage.returnPlayer(this.player.getName(), this.player.getLvl(), this.player.getScore(), this.player.getLanguage());
        }

    }

    public void game() throws IOException {
        while(this.gameOn) {
            this.player.setScore(this.player.getScore() + (long)this.player.getLvl());
            System.out.println(this.player.getScore());
            switch (this.scanner.nextLine()) {
                case "shop":
                    this.player.setLvl(this.shop.shop(this.player.getLvl(), this.player.getScore(), this.player.getLanguage()));
                    break;
                case "save":
                    this.saveGame.saveGame(this.player.getName(), this.player.getLvl(), this.player.getScore(), this.player.getLanguage());
                    break;
                case "minigame":
                    this.player.setScore(MiniGames.choseMiniGame(this.player.getScore(), this.player.getLanguage()));
            }
        }

    }
}