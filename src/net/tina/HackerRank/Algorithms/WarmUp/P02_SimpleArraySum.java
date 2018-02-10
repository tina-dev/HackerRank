package net.tina.HackerRank.Algorithms.WarmUp;

import java.util.Scanner;

public class P02_SimpleArraySum
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
        for(int i = 0;i<number;i++)
        {
            sum+=scanner.nextInt();
        }
        System.out.println(sum);
	}
}