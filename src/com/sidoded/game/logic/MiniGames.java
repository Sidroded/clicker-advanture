package com.sidoded.game.logic;
import java.util.Scanner;

public class MiniGames {
    public MiniGames() {
    }

    public static long choseMiniGame(long score, String language) {
        Scanner scanner = new Scanner(System.in);
        Massage.miniGameStartMassage(language);

        while(!scanner.hasNextInt()) {
            Massage.putYourNum(language);
            scanner.nextLine();
        }

        int key = scanner.nextInt();
        switch (key) {
            case 1:
                return MineSweeper.startGame(score, language);
            default:
                Massage.unCorrectCell(language);
                return score;
        }
    }

    public static long bet(long playerScore, String language) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу ставку. Приумножте ее в случае победы, или потеряйте в случае поражения.");
        System.out.println("Ваш счет " + playerScore + ".");

        while(!scanner.hasNextLong()) {
            Massage.putYourNum(language);
            scanner.nextLine();
        }

        long key = scanner.nextLong();
        if (playerScore >= key) {
            System.out.printf("Ваша ставака %s, принята.", key);
            return key;
        } else {
            System.out.println("Увы вам не хватает.");
            return -1L;
        }
    }
}

