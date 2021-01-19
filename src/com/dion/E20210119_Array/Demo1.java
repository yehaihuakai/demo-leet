package com.dion.E20210119_Array;

import java.util.Arrays;

/**
 * @description: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * @author: dion
 * @date: 2021/01/10
 **/
public class Demo1 {

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = demo1.twoSum(nums, target);
        System.out.println("----------  ----------");
        System.out.println(Arrays.toString(result));
        System.out.println("----------  ----------");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

}
