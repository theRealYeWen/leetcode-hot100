package com.yewen.leetcode.hot100.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1: Two Sum.
 *
 * <p>Time complexity: O(n). Space complexity: O(n).</p>
 */
public class P0001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indices.containsKey(complement)) {
                return new int[]{indices.get(complement), i};
            }
            indices.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

