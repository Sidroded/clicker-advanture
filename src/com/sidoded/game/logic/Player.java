package com.sidoded.game.logic;

public class Player {
    private String name;
    private int lvl = 1;
    private long score = 0L;
    private String language;

    public Player() {
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getScore() {
        return this.score;
    }
}

