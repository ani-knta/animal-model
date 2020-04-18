package com.sample.app;
public abstract class Fish extends Animal {

    protected enum Size {
        SMALL, LARGE
    }

    protected enum Color {
        GRAY, ORANGE
    }

    private Size size;
    private Color color;

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish can't walk");
    }

    @Override
    public void sing() {
        throw new UnsupportedOperationException("Fish can't sing");
    }

    Boolean makeJokes() {
        return false;
    }

    public void swim() {
        System.out.println("Fish is swimming");
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
