package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class JavaStdin2 
{
	public static void main(String [] args)
	{
		System.out.println("Enter an integer: ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println("enter a double: ");
		double d = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter a string: ");
		
		String s = scanner.nextLine();
		
		System.out.println("Integer: " + i);
		System.out.println("Double : " + d);
		System.out.println("String : " + s);
		
	}
}
