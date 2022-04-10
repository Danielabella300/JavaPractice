package com.ibm.Practice.leetCode;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class maxSubArray {
    public static void main(String[] args) {
        maxSubArray obj = new maxSubArray();

        int[] numArray = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] numArray2 = { -2 ,1};

        obj.maxSubArray(numArray2);

    }

    public int maxSubArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        int sumMax = Integer.MIN_VALUE;
        if (left > right) {
            return sumMax = Integer.MIN_VALUE;
        }
        while (left <= right) {
            int tempMax = 0;
            for (int i = left; i <= right; i++) {
                tempMax += nums[i];
            }
            if (tempMax >= sumMax) {
                sumMax = tempMax;
                left++;
            } else {
                right--;
            }
        }
        System.out.println(sumMax);
        return sumMax;
    }
}
