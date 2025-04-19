package com.buildergame;

public class Game {
    public static void main(String[] args) {
        Character hero = new Character.Builder()
            .name("Artemis")
            .health(150)
            .strength(20)
            .agility(25)
            .build();

        System.out.println("Player Created: " + hero.getName()
            + " [HP: " + hero.getHealth()
            + ", STR: " + hero.getStrength()
            + ", AGI: " + hero.getAgility() + "]");
    }
}
