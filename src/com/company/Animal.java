package com.company;

public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.alive = true;


        if (this.species.equals("Pies")) {
            this.weight = 12d;
        } else if (this.species.equals("Kot")) {
            this.weight = 5d;
        } else {
            this.weight = 2d;
        }
    }


    void introduceYourself() {
        System.out.println("I'm " + this.name);

    }


    void doYouLike(String foodType) {
        if (this.species.equals("felis") && foodType.equals("mouse")) {
            System.out.println("Yes, I like " + foodType);
        } else {
            System.out.println("No. You idiot!");
        }
    }

    Integer getHumanAge() {
        if (this.species.equals("canis")) {
            return this.age * 7;
        } else if (this.species.equals("felis")) {
            return this.age * 10;
        } else {
            return this.age;
        }
    }


    void feed() {
        if (this.alive.equals(true)) {
            this.weight++;

            System.out.println("You fed your pet. Your pet weight increases.");

        } else {
            System.out.println("You can't feed your pet. It's dead.");
        }
    }

    void takeForAWalk() {
        if (this.weight != 0 && this.alive.equals(true)) {
            this.weight--;

            System.out.println("You took pet for a walk. Your pet weight decreases.");

            if (this.weight <= 0 ) {
                System.out.println("Your pet is dead.");
                this.alive = false;
            }

        } else {
            System.out.println("You can't go a walk with your pet. It's dead.");
        }

    }


}

