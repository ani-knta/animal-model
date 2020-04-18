package com.sample.app;

import com.sample.app.Rooster.Sex;

public class Solution {

    public static void main(String[] args) {
    	//Q1
    	Bird bird=new Bird();
    	bird.walk();
    	bird.fly();
    	bird.sing();
    	//Q2
    	Duck duck=new Duck();
    	duck.sing();
    	duck.swim();
    	Chicken chicken=new Chicken();
    	chicken.sing();
    	//chicken.fly();
    	//Q3
    	Rooster rooster=new Rooster();
    	rooster.setSex(Sex.MALE);
    	rooster.sing();
    	//Q4
    	Parrot parrotWithDog=new Parrot(new Dog());
    	parrotWithDog.sing();
    	Parrot parrotwithCat=new Parrot(new Cat());
    	parrotwithCat.sing();
    	Parrot parrotWithRooster=new Parrot(new Rooster());
    	parrotWithRooster.sing();
    	//QB1-3
    	Fish fish= new Shark();
    	fish.swim();
    	//fish.sing();
    	//fish.walk();    	
    	Shark shark=new Shark();
    	System.out.println(shark.makeJokes());
    	System.out.println(shark.getColor());
    	System.out.println(shark.getSize());

    	Clownfish clownFish=new Clownfish();
    	System.out.println(clownFish.makeJokes());
    	System.out.println(clownFish.getColor());
    	System.out.println(clownFish.getSize());
    }
}