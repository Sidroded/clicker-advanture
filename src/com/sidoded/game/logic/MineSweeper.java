package com.sidoded.game.logic;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MineSweeper {
    public MineSweeper() {
    }

    public static long startGame(long score, String language) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayMines = new int[3];
        boolean lose = false;
        ArrayList<Integer> playerChoice = new ArrayList();
        int countChoices = 0;
        long bet = MiniGames.bet(score, language);
        if (bet < 0L) {
            return score;
        } else {
            do {
                for(int i = 0; arrayMines.length > i; ++i) {
                    arrayMines[i] = (int)(Math.random() * 10.0) + 1;
                }

                IntStream var10000 = Arrays.stream(arrayMines);
                PrintStream var10001 = System.out;
                Objects.requireNonNull(var10001);
                var10000.forEach(var10001::println);
            } while(arrayMines[0] == arrayMines[1] || arrayMines[0] == arrayMines[2] || arrayMines[1] == arrayMines[2]);

            while(true) {
                while(true) {
                    while(true) {
                        while(!lose) {
                            if (scanner.hasNextInt()) {
                                int key = scanner.nextInt();
                                if (key <= 10 && key >= 1) {
                                    if (playerChoice.contains(key)) {
                                        System.out.println("Не повторяйся!");
                                    } else {
                                        int[] var15 = arrayMines;
                                        int var12 = arrayMines.length;

                                        for(int var13 = 0; var13 < var12; ++var13) {
                                            int arrayMine = var15[var13];
                                            if (arrayMine == key) {
                                                lose = true;
                                                System.out.println("Бум");
                                                break;
                                            }
                                        }

                                        if (countChoices == 2 && !lose) {
                                            System.out.println("Поздравляю с победой");
                                            return bet * 3L;
                                        }

                                        if (!lose) {
                                            playerChoice.add(key);
                                            ++countChoices;
                                            System.out.println("Пронесло");
                                        }
                                    }
                                } else {
                                    System.out.println("От 1 до 10");
                                }
                            } else {
                                System.out.println("Введите число");
                                scanner.nextLine();
                            }
                        }

                        return 0L;
                    }
                }
            }
        }
    }
}
