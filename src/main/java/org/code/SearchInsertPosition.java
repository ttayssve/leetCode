package org.code;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println(searchInsert(nums, target1));

        int target2 = 2;
        System.out.println(searchInsert(nums, target2));

        int target3 = 7;
        System.out.println(searchInsert(nums, target3));

        int target4 = 0;
        System.out.println(searchInsert(nums, target4));

        int[] nums1 = {1};
        int target5 = 0;
        System.out.println(searchInsert(nums1, target5));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (target > nums[i]) {
                index = i + 1;
            }
        }
        return index;
    }
}
