package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class StringEx
{
    public static void main(String [] args)
    {
        String myString = "Hacker";
        char[] myCharArray = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++){
           /* if(myString.charAt(i) % 2 == 0)
            {
                System.out.print(myCharArray[i]);
            }*/
            /*else
            {
                System.out.println(myCharArray[i]);
            }*/
            // Print each sequential character on the same line
        }
        // Print a newline
        System.out.println();

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.nextLine();
        System.out.println("You entered : " + s);
        for(int i = 0; i<s.length(); i++)
        {
            char [] myChar = s.toCharArray();
            if(s.charAt(i) % 2 == 0)
            {
                System.out.println(myChar(i));
            }
            else
            {
                System.out.println(myChar(i));
            }
        }*/
    }
}