package com.dion.E20210119_Array;

/**
 * @description: 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * @author: dion
 * @date: 2021/01/19
 **/
public class Demo268 {

    public static void main(String[] args) {
        Demo268 demo268 = new Demo268();
        int[] nums = {9, 6, 4, 7, 3, 5, 8, 0, 1};
        int result = demo268.missingNumber(nums);
        System.out.println("----------  ----------");
        System.out.println(result);
        System.out.println("----------  ----------");
    }

    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += i + 1 - nums[i];
        }
        return result;
    }

   /* public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        int[] n = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            n[nums[i]] = 1;
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 1) {
                return i;
            }
        }
        return 0;
    }*/
}
