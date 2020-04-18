package com.sample.app;

public class Clownfish extends Fish {

    public Clownfish() {
        setSize(Size.SMALL);
        setColor(Color.ORANGE);
    }

    @Override
    Boolean makeJokes() {
        return true;
    }
}
