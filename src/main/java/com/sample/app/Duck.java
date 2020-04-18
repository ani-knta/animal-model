package com.sample.app;

public class Duck extends Bird {

    @Override
    void sing() {
        System.out.println("Quack, quack");
    }

    void swim() {
        System.out.println("Duck is swimming");
    }
}
