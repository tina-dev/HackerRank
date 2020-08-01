package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;
import java.util.Stack;

public class BinaryNumbers {
    public static void main(String [] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(n != 0) {
            int remainder = n%2;
            stack.push(remainder);
            n = n/2;
        }
        while(!(stack.isEmpty() )) {
            System.out.print(stack.pop());
        }
    }
}
