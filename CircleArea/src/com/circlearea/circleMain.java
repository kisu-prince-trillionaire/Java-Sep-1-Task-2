package com.circlearea;

import java.util.Scanner;

public class circleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double r = sc.nextDouble();
		
		calcCircleArea calc = new calcCircleArea(r);
		double carea = calc.areaC(r);
		System.out.println(carea);

	}

}
