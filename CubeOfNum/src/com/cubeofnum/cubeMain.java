package com.cubeofnum;

import java.util.Scanner;

public class cubeMain {
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a num : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		cubeMain cub = new cubeMain();
		int result = cub.cube(n);
		System.out.println("The cube of " + n + " is " + result);
		

	}

}
