package net.tina.HackerRank.DataStructure;

import java.util.HashSet;
import java.util.Set;

public class RecurringNumber {
    public static void main(String [] args) {
        int [] number = new int[] {1, 2, 1, 4, 5, 6};
        System.out.println(RecurringMethod2(number));

    }

    //Method1 O(n^2)
    public static Integer RecurringMethod(int [] a) {
        for(int i = 0; i<a.length; i++) {
            for(int j = i + 1; j<a.length; j++) {
                if(a[i] == a[j]) {
                    return a[i];
                }
            }
        }
        return null;
    }

    //Method2 O(n)
    private static Integer RecurringMethod2(int [] a) {
        Set<Integer> set = new HashSet<>();
        for(int element: a) {
            if(set.contains(element)) {
                return element;
            }
            else {
                set.add(element);
            }
        }
        return null;
    }
}
