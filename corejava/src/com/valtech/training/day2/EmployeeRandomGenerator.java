package com.valtech.training.day2;

import java.util.*;

public class EmployeeRandomGenerator {

	public static void main(String[] args) {
		Random random = new Random();
		Set<Employee1> employees = new HashSet<>();

		while (employees.size() < 1) {
			String name = generateRandomName(random);
			int age = random.nextInt(41) + 20;
			int experience = age - 20;
			String level = assignLevel(experience);

			Employee1 employee = new Employee1(name, age, experience, level);
			employees.add(employee);
		}

		for (Employee1 employee : employees) {
			System.out.println("Name: " + employee.getName());
			System.out.println("Age: " + employee.getAge());
			System.out.println("Experience: " + employee.getExperience() + " years");
			System.out.println("Level: " + employee.getLevel());
			System.out.println();
		}
	}

	private static String generateRandomName(Random random) {
        int nameLength = random.nextInt(8) + 3;
        char[] nameChars = new char[nameLength];
        nameChars[0] = (char) (random.nextInt(26) + 'A');
        
        for (int i = 1; i < nameLength; i++) {
        	
            nameChars[i] = (char) (random.nextInt(26) + 'a');
        
        }
        return new String(nameChars);
    }

	private static String assignLevel(int experience) {
		if(experience < 5) {
			return "Junior";
		}
		else if(experience > 5 && experience < 10) {
			return "Intermediate";
		}
		else {
			return "Senior";
		}

	}
}