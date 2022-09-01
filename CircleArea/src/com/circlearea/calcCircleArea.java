package com.circlearea;

public class calcCircleArea {
	static double pi = 3.14;
	double r;
	
	public calcCircleArea() {
		System.out.println("Please provide us the radius !");
	}
	
	public calcCircleArea(int r) {
		this.r = r;
	}
	
	public calcCircleArea(double r) {
		this.r = r;
	}
	
	public calcCircleArea(float r) {
		this.r = r;
	}
	
	public double areaC(double r) {
		return pi*r*r;
	}
}
