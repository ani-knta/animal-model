package com.sample.app;

public class Parrot extends Bird {

    private Animal animal;

    Parrot(Animal animal) {
        this.animal = animal;
    }

    @Override
    void sing() {
        animal.sing();
    }
}
