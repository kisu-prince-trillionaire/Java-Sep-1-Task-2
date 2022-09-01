package com.employee;

public class Employee {
	double eid;
	String name;
	double salary;
	static String company = "BSIPL";
	private static int count;
	
	public Employee() {
		System.out.println("Default Employee Constructor");
		setcount(getcount() + 1);
	}

	public Employee(double eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		setcount(getcount() + 1);
	}
	
	public void salary() {
		if(salary>50000.0) {
			System.out.println("My name is " + name + " with wmp id " + eid);
			System.out.println("my company name is " + Employee.company);
		}
		else
			System.out.println("Your salary is less than 50 thousand");

	}

	public static int getcount() {
		return count;
	}

	public static void setcount(int count) {
		Employee.count = count;
	}
	
	

}
