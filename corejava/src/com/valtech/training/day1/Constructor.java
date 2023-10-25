package com.valtech.training.day1;

public class Constructor {
	
	public static final Constructor  ORIGIN = new Constructor();

	protected int x;
	protected int y;

	public double distance() {

		System.out.println("Distance in Point");
		int diffx = x - ORIGIN.x;
		int diffy = y - ORIGIN.y;
		return Math.sqrt(diffx*diffx + diffy*diffy);

	}

	public static void main(String[] args) {

		Constructor c = new Constructor();
		c.x = 10;
		c.y = 20;
		System.out.println(c.distance());
		
		ORIGIN.x = 10;
		System.out.println(c.distance());
		
		Constructor c1 = new Constructor();
		System.out.println(c1.distance());
	
	}

}