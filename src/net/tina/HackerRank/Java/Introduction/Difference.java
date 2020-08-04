package net.tina.HackerRank.Java.Introduction;

import java.util.Scanner;

public class Difference {
    private int [] elements;
    private int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public  void computeDifference() {
        int min = 100;
        int max = 1;
        for(int i = 0; i<elements.length; i++) {
            if(elements[i] > max) {
                max = elements[i];
            }
            if(elements[i] < min) {
                min = elements[i];
            }
        }
        maximumDifference = max - min;
    }

    public static void main(String[] args) {
        System.out.println("Enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }


}
