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
    	
    }
}