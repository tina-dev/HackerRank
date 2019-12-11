package net.tina.HackerRank.Java.Introduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> dict = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            in.nextLine();
            dict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dict.containsKey(s))
            {
                System.out.println(s + "=" + dict.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
