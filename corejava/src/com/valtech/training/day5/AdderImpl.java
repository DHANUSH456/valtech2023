package com.valtech.training.day5;

public class AdderImpl implements Adder{
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Adder s = new AdderImpl();
		System.out.println(s.add(3, 5));
		Adder s1 = new Adder() {
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println(s1.add(8, 9));
		Adder s2 = (i,j) -> {return i+j;};
		System.out.println(s2.add(5, 6));
		
	}
}
