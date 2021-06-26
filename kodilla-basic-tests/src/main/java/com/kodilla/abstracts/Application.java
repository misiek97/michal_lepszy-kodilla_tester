package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

        Dog dog = new Dog(5);
        dog.giveVoice();

        Duck duck = new Duck(3);
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
