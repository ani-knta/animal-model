package com.sample.app;

public class Chicken extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Chicken cannot fly");
    }

    @Override
    public void sing() {
        System.out.println("Cluck, Cluck");
    }
}
