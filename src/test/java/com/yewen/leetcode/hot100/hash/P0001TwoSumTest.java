package com.yewen.leetcode.hot100.hash;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class P0001TwoSumTest {

    private final P0001TwoSum solution = new P0001TwoSum();

    @Test
    void findsTwoNumbersInTypicalInput() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void supportsDuplicateValues() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void rejectsInputWithoutSolution() {
        assertThrows(IllegalArgumentException.class, () -> solution.twoSum(new int[]{1, 2, 3}, 10));
    }
}

