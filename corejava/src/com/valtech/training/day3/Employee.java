package com.valtech.training.day3;

import java.util.*;

class Employee {

	private int seniority;
	private int experience;
	private String name;
	private int age;
	private double salary;

	public Employee(int seniority, int experience, String name, int age, double salary) {

		this.seniority = seniority;
		this.experience = experience;
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public int getSeniority() {

		return seniority;

	}

	public int getExperience() {

		return experience;

	}

	public String getName() {

		return name;

	}

	public int getAge() {

		return age;

	}

	public double getSalary() {

		return salary;

	}

	@Override
	public String toString() {

		return "Employee(" +
				"seniority=" + seniority +
				", experience=" + experience +
				", name=" + name +
				", age=" + age +
				", salary=" + salary +
				')';

	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(2, 5, "Puneeth", 30, 60000));
		employees.add(new Employee(1, 3, "Dhanush", 25, 55000));
		employees.add(new Employee(3, 8, "Sandeep", 35, 70000));

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {

				if (emp1.getSeniority() != emp2.getSeniority()) {
					
					return emp1.getSeniority() - emp2.getSeniority();

				} 
				else if (emp1.getExperience() != emp2.getExperience()) {

					return emp1.getExperience() - emp2.getExperience();

				}
				else {

					return emp1.getName().compareTo(emp2.getName());

				}

			}

		});

		for (Employee employee : employees) {
			
			System.out.println(employee);

		}

	}

}