package org.code;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1}; // 1
        System.out.println(singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2}; // 4
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
    }
}
