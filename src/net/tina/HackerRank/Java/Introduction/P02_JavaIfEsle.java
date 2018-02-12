package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class P02_JavaIfEsle 
{
	public static void main(String [] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number:");
         int n=sc.nextInt();            
         String ans="";
         if(n%2==1)
         {
           ans = "Weird";
         }
         else
         {
            ans = "Not Weird";  
         }
         System.out.println(ans);
	}
}
