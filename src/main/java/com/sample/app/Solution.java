package com.sample.app;

import com.sample.app.Rooster.Sex;

public class Solution {

    public static void main(String[] args) {
    	//testAnimals(); // To test from Q [A-D]
    	//[E] To find the Count of Animals 
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
    	
    }
    public int countFly(Animal[] animals) {
        int count = 0;
        if(null==animals) {
        	throw new RuntimeException("No animals added.");
        }
        for (Animal animal : animals) {
            try {
                animal.fly();
                count++;
            } catch (UnsupportedOperationException ex) {
                // Do nothing
            }
        }
        return count;
    }
    public int countWalk(Animal[] animals) {
        int count = 0;
        if(null==animals) {
        	throw new RuntimeException("No animals added.");
        }
        for (Animal animal : animals) {
            try {
                animal.walk();
                count++;
            } catch (UnsupportedOperationException ex) {
                // Do nothing
            }
        }
        return count;
    }
    public int countSing(Animal[] animals) {
    	if(null==animals) {
        	throw new RuntimeException("No animals added.");
        }
    	int count = 0;
        for (Animal animal : animals) {
            try {
                animal.sing();
                count++;
            } catch (UnsupportedOperationException ex) {
                // Do nothing
            }
        }
        return count;
    }
    public int countSwim(Animal[] animals) {
        int count = 0;
        if(null==animals) {
        	throw new RuntimeException("No animals added.");
        }
        for (Animal animal : animals) {
            try {
                animal.swim();
                count++;
            } catch (UnsupportedOperationException ex) {
                // Do nothing
            }
        }
        return count;
    }
    
    public static void testAnimals() {
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
    	//QD1-2
    	Butterfly butterfly=new Butterfly();
    	butterfly.fly();
    	//butterfly.sing();
    	Butterfly caterpillar=new Butterfly(true);
    	caterpillar.walk();
    	//caterpillar.fly();
    }
}