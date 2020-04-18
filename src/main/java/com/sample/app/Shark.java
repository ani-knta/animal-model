package com.sample.app;
public class Shark extends Fish {

    private Fish food;

    public Shark() {
        setSize(Size.LARGE);
        setColor(Color.GRAY);
    }

    public Fish getFood() {
		return food;
	}

	public void setFood(Fish food) {
		this.food = food;
	}

	void eat(Fish food) {
        this.food = food;
    }
}
