package com.sample.app;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.app.NativeRooster;
import com.sample.app.Rooster;

public class NativeRoosterTest {
	private NativeRooster nativeRooster;
	private Rooster rooster;
	private HashMap<String, String> converter;

	@Before
	public void init() {		
		converter = new HashMap<String, String>();
		converter.put("MyLang", "Ko-Ko-Ro-Koooo");
		converter.put("Danish", "ky-ky-li-ky");
		converter.put("Dutch", "ku-ke-le-ku");
		converter.put("Finnish", "ku-kko-kie-kuu");
		nativeRooster = new NativeRooster(rooster);
	}
	
	@Test
	public void test_nativeRooster_no_secondLanguage(){
		nativeRooster.converter=converter;
		assertEquals("Cock-a-doodle-doo",nativeRooster.singInLanguage(""));
		
	}
	@Test(expected = RuntimeException.class)
	public void test_nativeRooster_secondLanguage_nullcheck(){
		nativeRooster.converter=null;
		assertEquals("Ko-Ko-Ro-Koooo",nativeRooster.singInLanguage(""));
		
	}
	@Test
	public void test_nativeRooster_secondLanguage_myLang(){
		nativeRooster.converter=converter;
		assertEquals("Ko-Ko-Ro-Koooo",nativeRooster.singInLanguage("MyLang"));
		
	}
	@Test
	public void test_nativeRooster_secondLanguage_danishLang(){
		nativeRooster.converter=converter;
		assertEquals("ky-ky-li-ky",nativeRooster.singInLanguage("Danish"));
		
	}
	@Test
	public void test_nativeRooster_secondLanguage_dutchLang(){
		nativeRooster.converter=converter;
		assertEquals("ku-ke-le-ku",nativeRooster.singInLanguage("Dutch"));
		
	}
	@Test
	public void test_nativeRooster_secondLanguage_finnishLang(){
		nativeRooster.converter=converter;
		assertEquals("ku-kko-kie-kuu",nativeRooster.singInLanguage("Finnish"));
		
	}
	@After
	public void finalize() {
		System.out.println("Completed");
	}

}
