package com.sidoded.game.logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class CheckSave {
    public CheckSave() {
    }

    public String checkSave() throws IOException {
        Path saves = Path.of("d://Test//saves.txt");
        String copyLine = null;
        List<String> list = Files.readAllLines(saves);
        String line;
        if (Files.exists(saves)) {
            for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); copyLine = line) {
                line = (String)iterator.next();
            }
        } else {
            Files.createFile(saves);
        }

        return copyLine;
    }
}
