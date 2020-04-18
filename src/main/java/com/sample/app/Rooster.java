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
    
    public HashMap<String, String> getConverter() {
		return converter;
	}

	public void setConverter(HashMap<String, String> converter) {
		converter.put("MyLang", "Ko-Ko-Ro-Koooo");
		converter.put("Danish", "ky-ky-li-ky");
		converter.put("Dutch", "ku-ke-le-ku");
		converter.put("Finnish", "ku-kko-kie-kuu");
		this.converter = converter;
	}

	public String singInLanguage(String key) {
    	String song ="Cock-a-doodle-doo";
    	if(null == converter) {
    		throw new RuntimeException("Converter is empty");
    	}
    	if(!converter.isEmpty()) {
    		for ( String keyStr : converter.keySet() ) {
    			if(keyStr.equals(key)) {
    				song=converter.get(keyStr);
    			}
    			System.out.println(song);
    		}
    	}
		return song;
    }
	
}
