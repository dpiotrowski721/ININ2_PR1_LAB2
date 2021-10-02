package com.company;

public class Main {

    public static void main(String[] args) {

        Integer x = 3;

        Animal dog = new Animal("Pies");
        Animal cat = new Animal("Kot");
        Animal horse = new Animal("Koń");

        dog.species = "canis";
        dog.name = "Pies";
        dog.age = 2;
        dog.weight = 2d;
        dog.alive = true;

        System.out.println(dog.name);

        cat.name = "Kot";
        cat.species = "felis";

        System.out.println("Kot żyje? " + cat.alive);

        System.out.println("Waga kota: " + cat.weight);
        System.out.println("Waga psa: " + dog.weight);
        System.out.println("Waga konia: " + horse.weight);

        cat.introduceYourself();


        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " + dog.getHumanAge() + " years old");


       /* Car car = new Car();
        car.color = "red";
        car.model = "Astra";
        car.producer = "Opel";
        car.value = 2000.0; */


        Human me = new Human("Adrian", "Puchacki", 20, 5000d, dog);

        System.out.println("I have a " + me.pet.species);
        System.out.println("I all it " + me.pet.name);
        //System.out.println("I have " + me.car.producer + " " + me.car.model + ". My car has " + me.car.color + " color");


        System.out.println("------------------------------------------");

        dog.feed();

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();


        dog.feed();
        dog.takeForAWalk();


        System.out.println("------------------------------------------");

        me.setSalary(20000d);
        System.out.println(me.getSalary());


        System.out.println("------------------------------------------");

        Car car1 = new Car();
        car1.value = 2000000d;
        car1.producer = "Opel";
        car1.model = "Astra";
        car1.color = "Red";


        me.setCar(car1);

        if (me.getCar() != null) {
            System.out.println(me.getCar().model);
        } else {
            System.out.println("Sorry, You don't have a car!");
        }

        try {
            System.out.println(me.getCar().model);
        } catch (Exception e) {
            System.out.println("Sorry, You don't have a car!");
        }

    }
}
