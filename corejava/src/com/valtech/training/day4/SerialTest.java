package com.valtech.training.day4;

import com.valtech.training.day1.*;

import java.io.*;

public class SerialTest {
	
	public static void main(String[] args) throws Exception {
		
		Point p = new Point(2,3);
		Point3D p2 = new Point3D(2,3,4);
		System.out.println(p);
		System.out.println(p2);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Objects")));
		oos.writeObject(p);
		oos.writeObject(p2);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Objects")));
		Point p1 = (Point) ois.readObject();
		System.out.println(p1);
		System.out.println(p == p1);
		
		Point3D p3 = (Point3D) ois.readObject();
		System.out.println(p3);
		System.out.println(p2 == p3);

	}

}
