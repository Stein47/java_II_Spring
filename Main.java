package com.cis143.m06.student.lab;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		
		main.add2Numbers();
		
		// add numbers
		main.iterateThroughAnInetegerList(Arrays.asList(1,2,3,4, 50, 100), (a,b) -> a + b);
		
		//multiply some numbers
		main.iterateThroughAnInetegerList(Arrays.asList(1,2,3,4, 50, 100), (a,b) -> a * b);
		
		// something weird
		main.iterateThroughAnInetegerList(Arrays.asList(1,2,3,4, 50, 100), (a,b) -> (a + a) * (b + b) / 3);
		
		// something fun
		main.iterateThroughAnInetegerList(Arrays.asList(4, 6, 44, 32, 42, 17), (a,b) -> (a * 5) * (b - 6) / 17);	
		
		//my own version
		main.iterateThroughAnInetegerList(Arrays.asList(4, 13, 42, 69, 420, 666), (a,b) -> (a*a/b) * (b*b/a) + (a*b));
	}
	
	
	
	private void add2Numbers() {
		DoSomethingInterestingWith2Numbers doSomethingInterestingWith2Numbers = (a,b) -> a + b;
		Integer result = doSomethingInterestingWith2Numbers.doit(1,3);
		System.out.println("Result 1: " + result);
	}
	
	public void iterateThroughAnInetegerList(final List<Integer> integers, DoSomethingInterestingWith2Numbers doSomethingInterestingWith2Numbers) {
		for (int i = 0; i < integers.size(); i++) {
			Integer num = integers.get(i);
			System.out.println("Iterating Integers [index: " + num + ", value: " + doSomethingInterestingWith2Numbers.doit(num,num) + "]");
		}
	}
	
	@FunctionalInterface
	public interface DoSomethingInterestingWith2Numbers{
		Integer doit(Integer a, Integer b);
	}

}
