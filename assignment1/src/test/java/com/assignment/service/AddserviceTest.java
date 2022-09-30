package com.assignment.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddserviceTest {

	@Test
	public void test1() {
        Addservice ad= new Addservice();
		
		int expected=12;
		 int actual=ad.add(10,2);
		 assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
        Addservice ad= new Addservice();
		
		int expected=25;
		 int actual=ad.sub(30,5);
		 assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
        Addservice ad= new Addservice();
		
		int expected=120;
		 int actual=ad.mul(10,12);
		 assertEquals(expected,actual);
	}
	
	@Test
	public void test4() {
        Addservice ad= new Addservice();
		
		int expected=12;
		 int actual=ad.div(60,5);
		 assertEquals(expected,actual);
	}

}
