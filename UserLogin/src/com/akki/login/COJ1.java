package com.akki.login;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class COJ1 
{	
	public static double calculateAge(int year, int month)
	{
		LocalDate date = LocalDate.now();
		LocalDate bornday = LocalDate.of(year, month,2);
		Period time = Period.between(bornday, date);
		int currentAge=time.getYears();
		int currentMonth=time.getMonths();
		float x=0.25f;
		if(currentMonth<=3)
		{
			float age=currentAge;
			age+=(x*3);
			System.out.println("Moths "+currentMonth);
			System.out.println("Your age is: "+age);
			return age;
		}
		else if(currentMonth<=6)
		{
			float age=currentAge;
			age+=(x*6);
			System.out.println("Moths "+currentMonth);
			System.out.println("Your age is: "+currentAge);
			return age;
		}
		else
		{
			float age=currentAge;
			age+=(x*9);
			System.out.println("Moths "+currentMonth);
			System.out.println("Your age is: "+currentAge);
			return age;
		}
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter birth year");
		int year=in.nextInt();
		System.out.println("Enter birth month: ");
		int month=in.nextInt();			
		double age=calculateAge(year, month);
		System.out.println(age);
	}

}
