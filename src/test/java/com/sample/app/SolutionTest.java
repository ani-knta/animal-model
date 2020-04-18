package com.sample.app;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.app.Animal;
import com.sample.app.Bird;
import com.sample.app.Butterfly;
import com.sample.app.Cat;
import com.sample.app.Chicken;
import com.sample.app.Clownfish;
import com.sample.app.Dog;
import com.sample.app.Dolphin;
import com.sample.app.Duck;
import com.sample.app.Parrot;
import com.sample.app.Rooster;
import com.sample.app.Shark;
import com.sample.app.Solution;

public class SolutionTest {
	private List<String> list;
	private Solution solution;
	private Animal[] animals;
	
	@Before
	public void init()
	{	System.out.println("startup");
		solution=new Solution();
		animals= new Animal[]{
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
	
	@Test
	public void test_countFly_without_animals_empty() {
		animals=new Animal[]{};
		assertEquals(0,solution.countFly(animals));
	}
	@Test(expected = RuntimeException.class)
	public void test_countFly_without_animals_nullCheck() {
		animals=null;
		solution.countFly(animals);
	}
	@Test
	public void test_countFly_with_animals() {
		assertEquals(5,solution.countFly(animals));
	}
	@Test
	public void test_countWalk_without_animals_empty() {
		animals=new Animal[]{};
		assertEquals(0,solution.countWalk(animals));
	}
	@Test(expected = RuntimeException.class)
	public void test_counWalk_without_animals_nullCheck() {
		animals=null;
		solution.countWalk(animals);
	}
	@Test
	public void test_countWalk_with_animals() {
		assertEquals(9,solution.countWalk(animals));
	}
	
	@Test
	public void test_countSing_without_animals_empty() {
		animals=new Animal[]{};
		assertEquals(0,solution.countSing(animals));
	}
	@Test(expected = RuntimeException.class)
	public void test_countSing_without_animals_nullCheck() {
		animals=null;
		solution.countSing(animals);
	}
	@Test
	public void test_countSing_with_animals() {
		assertEquals(7,solution.countSing(animals));
	}
	@Test
	public void test_countSwim_without_animals_empty() {
		animals=new Animal[]{};
		assertEquals(0,solution.countSwim(animals));
	}
	@Test(expected = RuntimeException.class)
	public void test_countSwim_without_animals_nullCheck() {
		animals=null;
		solution.countSwim(animals);
	}
	@Test
	public void test_countSwim_with_animals() {
		assertEquals(4,solution.countSwim(animals));
	}
	
	@After
	public void finalize() {
		System.out.println("finalize");		
	}

}
