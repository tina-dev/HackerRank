package net.tina.HackerRank.CodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class TwoSumAnotherWay {
    public static void main(String [] args) {
        int [] numbers = new int[] {3, 5, 7, 8};
        int target = 8;
        int [] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int [] getTwoSum(int [] numbers, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for(int i = 0; i<numbers.length; i++) {
            int complement = target - numbers[i];
            if(visitedNumbers.containsKey(complement)) {
                return new int[] {visitedNumbers.get(complement), i};
            }
            visitedNumbers.put(numbers[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }

}
