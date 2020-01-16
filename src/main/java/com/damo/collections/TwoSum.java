package main.java.com.damo.collections;

import java.util.HashMap;

public class TwoSum {
    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //Example:
    //
    //Given nums = [2, 7, 11, 15], target = 9,
    //
    //Because nums[0] + nums[1] = 2 + 7 = 9,
    //return [0, 1].

    public static int[] sumTwo(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            final Integer value = map.get(nums[i]);
            if(value != null) {
                return new int[] { value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int[] result = sumTwo(nums, 26);
        System.out.println(result[0] + " " + result[1]);
    }
}
