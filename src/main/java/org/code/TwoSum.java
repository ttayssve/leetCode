package org.code;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(nums, target1)));

        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums, target2)));

        int target3 = 18;
        System.out.println(Arrays.toString(twoSum(nums, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (i != j && target - (nums[i] + nums[j]) == 0) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
