package com.akki.login;

import java.util.Scanner;

public class COJ07Time 
{
	private int hh;
	private int mm;
	private int ss;
	
	public COJ07Time() {}
	public COJ07Time(int hh, int mm, int ss)
	{
		super();
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	public void show()
	{
		System.out.println(hh+":"+mm+":"+ss);
	}
	
	public static COJ07Time add(COJ07Time obj1, COJ07Time obj2 )
	{
		int calcuatedTimeHours = (obj1.hh+obj2.hh);
		int calcuatedTimeMinutes = (obj1.mm+obj2.mm);
		int calcuatedTimeSeconds = (obj1.ss+obj2.ss);
		if(calcuatedTimeSeconds >60)
		{
			calcuatedTimeSeconds=calcuatedTimeSeconds-60;
			calcuatedTimeMinutes+=1;
		}
		if(calcuatedTimeMinutes>60)
		{
			calcuatedTimeMinutes=calcuatedTimeMinutes-60;
			calcuatedTimeHours+=1;
		}
		System.out.println(calcuatedTimeHours+":"+calcuatedTimeMinutes+":"+calcuatedTimeSeconds);
		return new COJ07Time(calcuatedTimeHours, calcuatedTimeMinutes, calcuatedTimeSeconds);
	}
	
	public static void main(String[] args) 
	{
				Scanner in = new Scanner(System.in);
				System.out.println("Enter Hours(0-23): ");
				int hh=in.nextInt();
				System.out.println("Enter Minutes(0-59): ");
				int mm=in.nextInt();
				System.out.println("Enter Seconds(0-59): ");
				int ss=in.nextInt();
				System.out.println("Enter time for second object");
				System.out.println("Enter Hours(0-23): ");
				int hh1=in.nextInt();
				System.out.println("Enter Minutes(0-59): ");
				int mm1=in.nextInt();
				System.out.println("Enter Seconds(0-59): ");
				int ss1=in.nextInt();
			if((hh>23|| mm>60||ss>60) || (hh1>23|| mm1>60||ss1>60) )
			{
				System.out.println("Either Hours, Minutes, Seconds are greater than 60.");
			}
			else
			{
				COJ07Time c1 = new COJ07Time(hh,mm,ss);
				COJ07Time c2 = new COJ07Time(hh1,mm1,ss1);
				c1.show();
				c2.show();
				COJ07Time addedTime =c1.add(c1, c2);
			}
	}
}
