package com.study.alone.leet;

/**
 * @Author: hetilong
 * @Date: 2022/2/6 11:14
 */
public class Alone704Search {
    public static void main(String[] args) {

        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums,9));

    }

    public static int search(int[] nums,int target){
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return -1;
    }
}
