package com.radojko.fibonacci;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class fibonacciTestCase {

	@Test
	public void test0() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(0, fib.finbonacci(0));
	}	
	
	@Test
	public void test1() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(1, fib.finbonacci(1));
	}
	
	@Test
	public void test2() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(1, fib.finbonacci(2));
	}	
	
	@Test
	public void test3() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(2, fib.finbonacci(3));
	}
	
	@Test
	public void test9() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(34, fib.finbonacci(9));
	}
	
	@Test
	public void test20() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(6765, fib.finbonacci(20));
	}	
	
	@Test
	public void test46() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(1836311903, fib.finbonacci(46));
	}			
	
	@Test(expected=IllegalArgumentException.class)
	public void testNegative() {
		Fibonacci fib = new Fibonacci();
		fib.finbonacci(-5);
	}	

}
