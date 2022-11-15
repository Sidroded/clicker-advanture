package com.sidoded.game.logic;
import java.io.IOException;

public class Clicker {
    public static void main(String[] args) {
        try {
            Games games = new Games();
            games.startGame();
            games.game();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
