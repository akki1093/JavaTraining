package com.akki.login;
import java.util.Scanner;

public class ValidateLogin {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String name=in.nextLine();
		System.out.println("Enter Password: ");
		String pswd = in.nextLine();
		System.out.println("Validating credentials... ");
		if(name.equals("akki") && pswd.equals("techouts"))
		{
			System.out.println("Welcome to Techouts your");
		}
		else {
			System.out.println("Either Username/ password is incorrect.");
		}
	}

}
