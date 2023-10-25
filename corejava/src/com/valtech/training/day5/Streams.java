package com.valtech.training.day5;

import java.util.*;
import java.util.stream.Collectors;
public class Streams {
	
	private void traditional(){
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> sqrt = new ArrayList<>();
		for(int i : nums) {
			sqrt.add(i*i);
		}
		System.out.println(nums);
		System.out.println(sqrt);
		System.out.println("");
	}
	public static void main(String[] args) {
		Streams s = new Streams();
		s.traditional();
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> sqrt = nums.stream().map(i->i*i).collect(Collectors.toList());
		List<Double> sqrts = nums.stream().map(i->Math.sqrt(i)).collect(Collectors.toList());
		List<Integer> odd = nums.stream().filter(i -> (i % 2) == 1).collect(Collectors.toList());
		System.out.println(sqrt);
		System.out.println(sqrts);
		System.out.println(odd);
	}

}
