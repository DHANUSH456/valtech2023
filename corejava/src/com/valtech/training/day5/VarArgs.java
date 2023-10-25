package com.valtech.training.day5;

public class VarArgs {

	public int add(int a, int ... b) {
		int result = a;
		for(int b1 : b) {
			result+=b1;
		}
		return result;
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println(va.add(1,2));
		System.out.println(va.add(1,2,3));
		System.out.println(va.add(1,2,3,4));
		System.out.println(va.add(1,2,3,4,5));
		System.out.println(va.add(1,2,3,4,5,6));
		System.out.println(va.add(1,2,3,4,5,6,7));
		System.out.println(va.add(1,2,3,4,5,6,7,8));
		System.out.println(va.add(1,2,3,4,5,6,7,8,9));
	}
}
