package com.valtech.training.day1;

import java.io.*;

import com.valtech.training.day2.*;

public class Point implements Comparable<Point>, PointArithemetic,Serializable{

	private static final long serialVersionUID = 1L;
	public static final Point ORIGIN = new Point();

	static {

		//ORIGIN.x = 1000;
		//ORIGIN.y =2000;
		System.out.println(ORIGIN);

	}

	protected int x;
	protected transient int y;

	public Point() {
		
		System.out.println("Point Method");

	}

	public Point(int x,int y) {

		System.out.println(" IN ctrl of Point");
		//super();
		this.x = x;
		this.y = y;

	}
	
public double diffPoint (Point a,Point b) {
		
		double x=a.x-b.x;
		double y=a.y-b.y;
		return Math.sqrt(x*x+y*y);

	}

	public Point addPoints(Point a, Point b, Point c) {
		
		c.x=a.x+b.x;
		c.y=a.y+b.y;
		return c;
		
	}

	public Point subPoints(Point a, Point b, Point c) {
		
		c.x=a.x-b.x;
		c.y=a.y-b.y;
		return c;
	
	}

	public double distPoints(Point a, Point b) {

		double result=diffPoint(a,b);
		return result;
		
	}
	@Override
	public int compareTo(Point o) {

		return (x - o.x) == 0? (y - o.y) : (x - o.x);
	}
	

		public boolean equals(Object ob) {

			Point p = (Point) ob;
			return p.x == x && p.y ==y;
			
		}

		@Override
		public int hashCode() {

			return toString().hashCode();	

			}

		@Override
		public String toString() {

			return "X="+x+"Y="+y+"Distance"+distance();

		}

		public double distance(Point other) {

			System.out.println("Distance with anoter Point");
			return distance(other.x,other.y);

		}

		public double distance(int x,int y) {

			int diffx = this.x - x;
			int diffy = this.y - y;
			return Math.sqrt(diffx*diffx + diffy*diffy);

		}

		public double distance() {

			System.out.println("Distance in Point");
			int diffx = x - ORIGIN.x;
			int diffy = y -  ORIGIN.y;
			return Math.sqrt(diffx*diffx + diffy*diffy);

		}

		public static void main(String[] args) {

			Point p = new Point();
			p.x = 25;
			p.y = 20;
			System.out.println(p);
			Point p2 = new Point(20,30);
			Point p3 = new Point(10,20);
			Point p4 = new Point();
			PointArithemetic p5=  new Point();
			p5.addPoints(p2, p3, p4);
			System.out.println("("+p4.x+","+p4.y+")");
			p5.subPoints(p2, p3, p4);
			System.out.println("("+p4.x+","+p4.y+")");
			double answer=p5.distPoints(p2, p3);
			System.out.println(answer);

	}

}