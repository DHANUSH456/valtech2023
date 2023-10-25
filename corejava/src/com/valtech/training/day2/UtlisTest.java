package com.valtech.training.day2;
import com.valtech.training.day1.Point;

import java.util.*;

public class UtlisTest {
	
	public static void testStack(Stack<Point> points) {
	
		points.push(new Point(2,3));
		points.push(new Point(2,4));
		points.push(new Point(2,3));
		points.push(new Point(2,5));
		System.out.println("Size ="+points.size());
		System.out.println(points.pop());
		System.out.println("Size ="+points.size());
		System.out.println(points.peek());
		System.out.println("Size ="+points.size());
		
	}
	
	public static void testMap(Map<String,Point> points) {
	
	points.put("2,3", new Point(2,3));
	points.put("2,3", new Point(2,3));
	points.put("3,2", new Point(3,2));
	points.put("2,4", new Point(2,4));
	points.put("4,2", new Point(2,4));
	System.out.println(points.size());
	System.out.println(points);
	}
	
	
	public static void testList(List<Point> points) {
		
		Point p = new Point(2,3);
		Point p1 = new Point(2,3);
		Set<Point> points1 = new HashSet<>();
		points1.add(p);
		points1.add(p1);
		points1.add(p);
		points1.add(new Point(3,2));
		points1.add(new Point(4,2));
		
		System.out.println("Size ="+points1.size());
		System.out.println(points);
		
	}
	
	public static void testSet(Set<Point> points) {
		
		Point p = new Point(2,3);
		Point p1 = new Point(2,3);
		Set<Point> points1 = new HashSet<>();
		points1.add(p);
		points1.add(p1);
		points1.add(p);
		points1.add(new Point(3,2));
		System.out.println("Size ="+points1.size());
		
	}
	
	public static void main(String[] args) {
		
//		testSet(new HashSet<>());
//		testSet(new TreeSet<>());
//		testList(new ArrayList<>());
//		testList(new LinkedList<>());
//		testMap(new HashMap<>());
		testStack(new Stack<>());
		
	}

}
