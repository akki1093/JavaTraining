package com.akki.login;

import java.util.Scanner;

public class CO_J2 
{
	String dayName;
	static String[] days= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	public String getDayName() {
		return dayName;  }
	public void setDayName(String dayName) {
		this.dayName = dayName;  }

	public String getNextDay(String day)
	{
		for (int i = 0; i < days.length; i++) 
		{
			if(day.equals(days[i]))
			{
				if(days[i].equals("SAT"))
				{
					return days[0];
				}
				else 
					return days[i+1];
			}
		}
		return null;
	}
	
	public String getPrevDay(String day)
	{
		for (int i = days.length-1;i>=0; i--) 
		{
			if(day.equals(days[i]))
			{
				if(days[i].equals("MON"))
				{
					return days[0];
				}
				else 
					return days[i-1];
			}
		}
		return null;
	}
	
	public String addToCurrentDay(int noOfDays)
	{
		int j=0;
		for(int i=0;i<days.length-1;i++)
		{
			if(this.dayName.equals(days[i]))
			{
				int index=days[i].indexOf(i);
			/*	if(noOfDays<0)
				{
					return days[i+noOfDays];
				}*/
				if(i+noOfDays<6)
				{
					return days[i+noOfDays];
				}
				else if(i+noOfDays>=6)
				{
					j=i+noOfDays-6;
					return days[j];
				}
			}
		}
		return null;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Week day: ");
		String day=in.nextLine();
		CO_J2 obj1 = new CO_J2();
		for (int i = 0; i < days.length; i++) 
		{
				if(day.toUpperCase().contains(days[i]))
				{
					obj1.setDayName(days[i]);
					break;
				}
				else
					obj1.setDayName(null);
		}
		System.out.println("Day Saved as: "+obj1.getDayName());
		System.out.println("Next day of: "+obj1.dayName+" is "+obj1.getNextDay(obj1.dayName));
		System.out.println("Previous day of: "+obj1.dayName+" is "+obj1.getPrevDay(obj1.dayName));
		System.out.println("Adding 5  days to "+obj1.dayName+" will be "+obj1.addToCurrentDay(5));
	}

}

