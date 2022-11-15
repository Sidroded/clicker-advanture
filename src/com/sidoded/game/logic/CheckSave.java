package com.sidoded.game.logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
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
        if (Files.exists(saves, new LinkOption[0])) {
            for(Iterator var4 = list.iterator(); var4.hasNext(); copyLine = line) {
                line = (String)var4.next();
            }
        } else {
            Files.createFile(saves);
        }

        return copyLine;
    }
}
