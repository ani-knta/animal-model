package com.sample.app;

public abstract class Animal {

    void walk() {
        System.out.println("I am walking");
    }

    void fly() {
        throw new UnsupportedOperationException("Animal can't fly");
    }

    void sing() {
        throw new UnsupportedOperationException("Animal can't sing");
    }
}
