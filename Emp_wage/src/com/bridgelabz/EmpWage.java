package com.bridgelabz;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// Constants
		   int FULLTIME = 1;
		   int WAGEPERHR = 20;
		   int FULLDAY = 8;
		   
		// Computation
		   double empCheck = Math.floor(Math.random() * 10) % 2;
		   if (empCheck == FULLTIME)
		   {
		      System.out.println("Employee is Present");
		   	  int DAILYEMPWAGE = WAGEPERHR * FULLDAY;
		   	  System.out.println("Daily employee wage is : " + DAILYEMPWAGE);
		   }
		   else
		   {
		      System.out.println("Employee is Absent");
		      System.out.println("Daily employee wage is : zero");
		   }
		      
		   
		

	}

}
