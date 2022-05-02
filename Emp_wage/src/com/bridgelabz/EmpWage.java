package com.bridgelabz;

import java.util.Scanner;


public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// Constants
		   int FULLTIME = 1;
		   int WAGEPERHR = 20;
		   int FULLDAY = 8;
		   int PARTTIME = 0;
		   int HALFDAY = 4;
		   
		 // Computation
		   double empCheck = Math.floor(Math.random() * 10) % 2;
		   if (empCheck == FULLTIME)
		   {
		      System.out.println("Employee is Present");
		   	  int DAILYEMPWAGE = WAGEPERHR * FULLDAY;
		   	  System.out.println("Daily employee wage is : " + DAILYEMPWAGE);
		   }
		   else if (empCheck == PARTTIME)
		   {
			   System.out.println("Employee is Present");
			   int PARTTIMEWAGE = WAGEPERHR * HALFDAY;
			   System.out.println("Daily employee part time wage is : " + PARTTIMEWAGE);
		   }
		   else
		   {
		      System.out.println("Employee is Absent");
		      System.out.println("Daily employee wage is : zero");
		   }
		      
		   Scanner read = new Scanner(System.in);
	       System.out.print("Enter any number between 0 and 2: ");
	       int num = read.nextInt();
	       switch (num)
	        {
	        	case 1: System.out.println("Employee is Present");
	       				int DAILYEMPWAGE = WAGEPERHR * FULLDAY;
	       				System.out.println("Employee Daily Wage is " +  DAILYEMPWAGE);
	       				break;
	        	case 2: System.out.println("Employee is  Part time Present");
	        	 		int PARTTIMEWAGE = WAGEPERHR * HALFDAY;
	        	 		System.out.println("Daily employee part time wage is : " + PARTTIMEWAGE);
	        	 		break;
	        	default : System.out.println("Employee is absent");
	        			  System.out.println("Employee Daily Wage is Zero");

	   }
		   
		   

	}

}
