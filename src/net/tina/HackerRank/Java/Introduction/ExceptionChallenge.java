package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class ExceptionChallenge {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        try{
            int i = Integer.parseInt(S);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
        finally {
            System.out.println(S);
        }
    }
}
