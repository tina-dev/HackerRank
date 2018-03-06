package net.tina.HackerRank.Algorithms.Implementation;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		System.out.println("enter number a");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println("enter number b");
        int b;
        b = scanner.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }

    static int solveMeFirst(int a, int b)
    {
        return a+b;
   }
}
