package com.sidoded.game.logic;

import java.util.Scanner;

public class LanguageChoice {
    public LanguageChoice() {
    }

    public static String getLanguage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice your language");

        while(true) {
            System.out.println("English (E) / Russian (R)");
            String keyboard = scanner.nextLine();
            if (keyboard.equalsIgnoreCase("E")) {
                System.out.println("You chose english!");
                System.out.println();
                return "ENG";
            }

            if (keyboard.equalsIgnoreCase("R")) {
                System.out.println("Вы выбрали русский!");
                System.out.println();
                return "RU";
            }

            System.out.println();
        }
    }
}
