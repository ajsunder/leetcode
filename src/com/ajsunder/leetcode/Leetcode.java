package com.ajsunder.leetcode;

import java.util.Arrays;

public class Leetcode {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = {2, 7, 11, 15, 28, 29};

        Solution twoSum = new Solution();
        System.out.println(Arrays.toString(twoSum.twoSumBest(intArray, 9)));

    }
}
