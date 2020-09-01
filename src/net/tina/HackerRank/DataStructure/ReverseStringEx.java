package net.tina.HackerRank.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringEx {
    public static void main(String [] args) {
        String a = "Test";
        System.out.println(ReverseString(a));
        System.out.println(ReverseString2(a));

    }
    //method 1
    public static String ReverseString(String name) {
        StringBuilder builder = new StringBuilder();
        for(int i = name.length()-1; i >= 0; i --) {
            builder.append(name.charAt(i));
        }
        return builder.toString();
    }

    //method2
    public static String ReverseString2(String name) {
        String temp = "";
        for(int i = name.length()-1; i >=0; i--) {
            temp += name.charAt(i);
        }
        return temp;
    }
}
