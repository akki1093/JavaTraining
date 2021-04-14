package com.akki.login;

import java.util.Iterator;

/*
 * 1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-26

The following String based output must be returned:
1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30  */

public class COJ_09 
{
	static String num2="1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-26";
	public static void main(String[] args)
	{
			System.out.print("Given input is: "+num2);
			System.out.println(" ");
			String[] temp=new String[60];
			String[] temp2=num2.split(",");
			for (int j=0;j<temp2.length;j++) 
			{
				System.out.println(temp2[j]);	
			}
	}
}
