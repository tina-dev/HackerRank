package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class P_05_Sorting
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] a = new int [n];
		for(int a_i = 0; a_i<n; a_i++)
		{
			a[a_i] = scanner.nextInt();
		}
		int totalOfSwaps = 0;
		for(int i = n -1; i>0; i--)
		{
			int numberOfSwaps = 0;
			for(int j = 0; j<i; j++)
			{
				if(a[j] >a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					numberOfSwaps ++;
					totalOfSwaps++;
				}
			}
			if(numberOfSwaps == 0)
			{
				break;
			}
		}
		System.out.println("Array is sorted in "+totalOfSwaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[n-1]);
	}
}
