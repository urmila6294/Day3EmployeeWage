package com.bridgelabz;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// Constants
		   int fulltime = 1;
		// Computation
		   double empCheck = Math.floor(Math.random() * 10) % 2;
		   if (empCheck == fulltime)
		      System.out.println("Employee is Present");
		   else
		      System.out.println("Employee is Absent");
		   
		

	}

}
