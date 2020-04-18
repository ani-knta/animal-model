package com.sample.app;

public class Butterfly extends Bird {

    private boolean isCaterpillar;

    public Butterfly() {
        this.isCaterpillar = false;
    }

    public Butterfly(boolean isCaterpillar) {
        this.isCaterpillar = isCaterpillar;
    }

    @Override
    void walk() {
        if (isCaterpillar) {
            System.out.println("Caterpillar is crawling");
        } else {
            super.walk();
        }
    }

    @Override
    void fly() {
        if (isCaterpillar) {
            throw new UnsupportedOperationException("Caterpillar can't fly");
        } else {
            super.fly();
        }
    }

    @Override
    public void sing() {
        throw new UnsupportedOperationException("Butterfly can't sing");
    }
}
