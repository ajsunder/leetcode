package com.ajsunder.leetcode;

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Example:
// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

public class Solution {

    int[] solution = new int[2];

    public int[] twoSum(int[] nums, int target) {


        System.out.println("target = " + target);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }
}
