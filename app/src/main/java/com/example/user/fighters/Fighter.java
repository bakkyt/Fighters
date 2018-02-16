package com.example.user.fighters;

/**
 * Created by User on 16.02.2018.
 */

public class Fighter {
    int health;
    int attact;
    int defance;
    String name;

    public Fighter(int attact, int defance, int health, String name) {
        this.attact = attact;
        this.defance = defance;
        this.health = health;
        this.name = name;
    }

    public int getAttact() {
        return attact;
    }

    public int getHealth() {
        return health;
    }

    public int getDefance() {
        return defance;
    }

    public void setAttact(int attact) {
        this.attact = attact;
    }

    public Fighter(){
        health = 100;
        attact = 10;
        defance = 5;
        name = "Fighter";
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefance(int defance) {
        this.defance = defance;
    }
}
