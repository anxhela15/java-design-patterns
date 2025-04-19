package com.buildergame;

public final class Character {
    private final String name;
    private final int health;
    private final int strength;
    private final int agility;

    private Character(Builder builder) {
        this.name = builder.name;
        this.health = builder.health;
        this.strength = builder.strength;
        this.agility = builder.agility;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }

    public static class Builder {
        private String name;
        private int health = 100;     // default health
        private int strength = 10;    // default strength
        private int agility = 10;     // default agility

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder health(int health) {
            this.health = health;
            return this;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder agility(int agility) {
            this.agility = agility;
            return this;
        }

        public Character build() {
            if (name == null || name.isEmpty()) {
                throw new IllegalStateException("Name cannot be null or empty");
            }
            return new Character(this);
        }
    }
}
