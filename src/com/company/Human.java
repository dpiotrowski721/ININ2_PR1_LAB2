package com.company;

import java.time.LocalDate;

public class Human {

    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    Car car;


    Human(String firstName, String lastName, Integer age, Double salary, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("New data sent to accounting system.");
            System.out.println("You need to pick up the annex to the contract from Mrs. Hania from accounting.");
            System.out.println("ZUS and US know about change your salary. You can't hide :).");


            this.salary = salary;

        }
        else
        {
            System.out.println("Error. Salary can't be negative");
        }
    }

    Double getSalary() {
        System.out.println("Salary on day: " + LocalDate.now() + " equals: " + this.salary + " zł");
        return this.salary;
    }

}
