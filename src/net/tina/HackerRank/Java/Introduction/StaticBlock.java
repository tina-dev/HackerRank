package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class StaticBlock
{
	static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static
    {
        if(B <=0 || H<=0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String [] args)
    {
    	if(flag)
    	{
    		int area = B * H;
    		System.out.println(area);
    	}
    }
}