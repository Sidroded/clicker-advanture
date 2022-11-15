package com.sidoded.game.logic;

import java.util.Scanner;

public class Registration {
    public Registration() {
    }

    public String registration(String language) {
        Scanner sc = new Scanner(System.in);
        String name = "Exception";
        Massage.registrationMassage(language);
        if (language.equals("ENG")) {
            do {
                System.out.println("Enter your name.");
                name = sc.nextLine();
                System.out.printf("Your name: %s?", name);
                System.out.println();
            } while(!sc.nextLine().equalsIgnoreCase("Yes"));
        } else if (language.equals("RU")) {
            do {
                System.out.println("Введите ваше имя.");
                name = sc.nextLine();
                System.out.printf("Ваше имя: %s?", name);
                System.out.println();
            } while(!sc.nextLine().equalsIgnoreCase("Да"));
        }

        return name;
    }
}

