package com.radojko.fibonacci;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class fibonacciTestCase {

	@Test
	public void test0() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(1, fib.finbonacci(0));
	}	
	
	@Test
	public void test1() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(1, fib.finbonacci(1));
	}	
	
	@Test
	public void test3() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(3, fib.finbonacci(3));
	}
	
	@Test
	public void test9() {
		Fibonacci fib = new Fibonacci();
		Assert.assertEquals(55, fib.finbonacci(9));
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void testNegative() {
		Fibonacci fib = new Fibonacci();
		fib.finbonacci(-5);
	}	

}
