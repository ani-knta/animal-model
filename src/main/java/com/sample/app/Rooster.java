package com.sample.app;

import java.util.HashMap;

public class Rooster extends Bird {
	protected enum Sex {
		FEMALE, MALE
	};
	private Sex sex;
	public  HashMap<String, String> converter;
	
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
	
}
