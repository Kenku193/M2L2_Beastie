package org.example;

import java.util.LinkedList;
import java.util.List;

public class Example1{
    public static void main(String[] args) {


        Dog belkaDog = new Dog("Белка");
        Cat koshkaCat = new Cat("Кошка");

        belkaDog.talk();
        koshkaCat.talk();

        Animal an = new Animal("Животное") {
            @Override
            void talk() {
                System.out.println("Какое-то животное что-то говорит!");
            }
        };

        an.talk();


    }
}

abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void talk();
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void talk() {
        System.out.println("Гав-гав!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void talk() {
        System.out.println("Мяу!");
    }
}