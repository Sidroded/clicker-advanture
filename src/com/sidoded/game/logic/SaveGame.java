package com.sidoded.game.logic;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class SaveGame {
    public SaveGame() {
    }

    public void saveGame(String name, int lvl, long score, String language) throws IOException {
        String namePath = "d://Test//saves.txt";
        Path path = Path.of(namePath);
        if (!Files.exists(path, new LinkOption[0])) {
            Files.createFile(path);
        }

        Files.writeString(path, name + "-" + lvl + "-" + score + "-" + language);
        Massage.savedMassage(language);
    }
}
