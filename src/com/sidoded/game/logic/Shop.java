package com.sidoded.game.logic;
import java.util.Scanner;

public class Shop {
    private boolean firstAccess = true;

    public Shop() {
    }

    public int shop(int lvl, long score, String language) {
        Scanner scanner = new Scanner(System.in);
        if (this.firstAccess) {
            Massage.firstShopMassage(language);
            this.firstAccess = false;
        }

        Massage.shopMassage(language);

        while(!scanner.hasNextInt()) {
            Massage.putYourNum(language);
            scanner.nextLine();
        }

        int key = scanner.nextInt();
        if (language.equals("RU")) {
            switch (key) {
                case 1:
                    if (score >= 200L) {
                        System.out.println("Ваш клик усилен на 2!");
                        return lvl + 2;
                    }

                    this.defaultAnswer(language);
                    return lvl;
                case 2:
                    if (score >= 1000L) {
                        System.out.println("Ваша мощь увеличена на 15");
                        return lvl + 15;
                    }

                    this.defaultAnswer(language);
                    return lvl;
                case 3:
                    if (score >= 5000L) {
                        System.out.println("Вас не остановить! Один удар на 100 больше!");
                        return lvl + 100;
                    }

                    this.defaultAnswer(language);
                    return lvl;
                default:
                    System.out.println("Такой ячейки увы нет.");
            }
        } else if (language.equals("ENG")) {
            switch (key) {
                case 1:
                    if (score >= 200L) {
                        System.out.println("Your click is increased by 2!");
                        return lvl + 2;
                    }

                    this.defaultAnswer(language);
                    return lvl;
                case 2:
                    if (score >= 1000L) {
                        System.out.println("Your strength is increased by 15.");
                        return lvl + 15;
                    }

                    this.defaultAnswer(language);
                    return lvl;
                case 3:
                    if (score >= 5000L) {
                        System.out.println("You can't be stopped! One hit for 100 more!");
                        return lvl + 100;
                    }

                    this.defaultAnswer(language);
                    return lvl;
                default:
                    System.out.println("Unfortunately, there is no such cell.");
            }
        }

        return lvl;
    }

    private void defaultAnswer(String language) {
        if (language.equals("RU")) {
            System.out.println("Не хватает валюты друг.");
        } else if (language.equals("ENG")) {
            System.out.println("Not enough currency friend.");
        }

    }
}
