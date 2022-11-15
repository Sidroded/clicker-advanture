package com.sidoded.game.logic;

public class Massage {
    public Massage() {
    }

    public static void startMassage(String language) {
        if (language.equals("ENG")) {
            System.out.println("*Welcome text*");
            System.out.println("The time will come when I will finish it.");
            System.out.println();
        } else if (language.equals("RU")) {
            System.out.println("*Текст приветствия*");
        }

    }

    public static void registrationMassage(String language) {
        if (language.equals("ENG")) {
            System.out.println("*Registration massage*");
            System.out.println("I promise I will write this text.");
            System.out.println();
        } else if (language.equals("RU")) {
            System.out.println("*Текст регистрации*");
        }

    }

    public static void savedMassage(String language) {
        if (language.equals("ENG")) {
            System.out.println("Game saved");

            try {
                Thread.sleep(500L);
            } catch (InterruptedException var2) {
                System.out.println("Something wrong");
            }

            System.out.println();
            System.out.println("Or not. Who knows?");
        } else if (language.equals("RU")) {
            System.out.println("*Игра сохранена*");
        }

    }

    public static void shopMassage(String language) {
        if (language.equals("ENG")) {
            System.out.println("Welcome to our shop!");
            System.out.println("Just select the number you want, just like in a soda machine.");
            System.out.println();
            System.out.println("(1) +2 strength for only 200 cats-coins");
            System.out.println("(2) +15 strength for 1000 cats-coins");
            System.out.println("(3) +100 strength for 5000 cats-coins");
        } else if (language.equals("RU")) {
            System.out.println("Добро пожаловать в нашу лавку.");
            System.out.println("Просто выбери нужную цифру как в автомате с газировкой.");
            System.out.println();
            System.out.println("(1) + 2 к силе всего за 200 котэ-coins");
            System.out.println("(2) +15 к силе за 1000 котэ-coins");
            System.out.println("(3) +100 к силе за 5000 котэ-coins");
        }

    }

    public static void firstShopMassage(String language) {
        if (language.equals("ENG")) {
            System.out.println("Here you can become stronger!");
            System.out.println("Buy upgrades using your coins.");
            System.out.println();
        } else if (language.equals("RU")) {
            System.out.println("Здесь ты можешь улучшить свою мощь.");
            System.out.println("Покупай улучшения, играй в азартные игры,");
            System.out.println("Все или ничего!");
            System.out.println();
        }

    }

    public static void returnPlayer(String name, int lvl, long score, String language) {
        if (language.equals("ENG")) {
            System.out.println("Welcome " + name);
            System.out.println("Your power " + lvl);
            System.out.println("Your coins " + score);
        } else if (language.equals("RU")) {
            System.out.println("С возвращением " + name);
            System.out.println("Ваша сила - " + lvl);
            System.out.println("Ваш счет - " + score);
        }

    }

    public static void miniGameStartMassage(String language) {
        if (language.equals("ENG")) {
            System.out.println("Добро пожаловать в меню мини игр.");
            System.out.println("Выбери игру для старта.");
            System.out.println();
            System.out.println("(1) - Минер, игра на чистое везение. Не попади на мину 3 раза,");
            System.out.println("и трехкратно умнож свою ставку!");
        } else if (language.equals("RU")) {
            System.out.println("Добро пожаловать в меню мини игр.");
            System.out.println("Выбери игру для старта.");
            System.out.println();
            System.out.println("(1) - Минер, игра на чистое везение. Не попади на мину 3 раза,");
            System.out.println("и трехкратно умнож свою ставку!");
        }

    }

    public static void putYourNum(String language) {
        if (language.equals("ENG")) {
            System.out.println("Chose number");
        } else if (language.equals("RU")) {
            System.out.println("Введите число.");
        }

    }

    public static void unCorrectCell(String language) {
        if (language.equals("ENG")) {
            System.out.println("Unfortunately, there is no such cell.");
        } else if (language.equals("RU")) {
            System.out.println("Такой ячейки увы нет.");
        }

    }
}