package com.ajsunder.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Set key values
        int n = s.length(), ans = 0;

        Map<Character, Integer> map = new HashMap<>();

        // current index of character
        // try to extend the range [i, j]


        // interate across entire String through map
        for (int j = 0, i = 0; j < n; j++) {
            System.out.println(map.containsKey(s.charAt(j)));
            // Iterate over the map to see if that character already exists as a key
            if (map.containsKey(s.charAt(j))) {
                System.out.println("s.charAt(j): " + s.charAt(j));
                System.out.println("map.get(s.charAt(j): " + map.get(s.charAt(j)));
                System.out.println("Math.max(map.get(s.charAt(j)), i): " + Math.max(map.get(s.charAt(j)), i));
                i = Math.max(map.get(s.charAt(j)), i);
            }
            System.out.println("before: " + ans);
            ans = Math.max(ans, j - i + 1);
            System.out.println("after: " + ans);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
