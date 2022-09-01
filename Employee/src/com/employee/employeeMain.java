package com.employee;

import java.util.Scanner;

public class employeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your Emp Id : ");
		double eid = sc.nextDouble();
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee();
		emp.salary();
		System.out.println("------------------------------------------");
		Employee emp1 = new Employee(eid,name,salary);
		emp1.salary();
		System.out.println("------------------------------------------");
		Employee emp2 = new Employee(788,"krishna", 9800000);
		emp2.salary();
		System.out.println("------------------------------------------");
		Employee emp3 = new Employee(886,"bablu", 15000);
		emp3.salary();
		System.out.println("------------------------------------------");
		Employee emp4 = new Employee(777,"lala", 515000);
		emp4.salary();
		System.out.println("------------------------------------------");
		Employee emp5 = new Employee(966,"raja", 987654);
		emp5.salary();
		
		System.out.println("------------------------------------------");
		System.out.println("The total no of object created is " + Employee.getcount());

	}

}
