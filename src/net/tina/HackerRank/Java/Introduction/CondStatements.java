package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class CondStatements
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if((n % 2 == 1) || ((n % 2 == 0) && (n >=6 && n <= 20)))
		{
			System.out.println("Weird");
		}
		else 
		{
			System.out.println("Not Weird");
		}
	}
}
