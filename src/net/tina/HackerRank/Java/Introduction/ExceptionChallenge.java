package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class ExceptionChallenge {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        try{
            System.out.println(Integer.parseInt(S));

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

    }
}
