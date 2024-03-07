package org.tfoc;

import java.util.Arrays;
import java.util.Objects;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static Integer search(
            Integer[] nums,
            Integer target) {

        boolean isFound = false;
        int arraySize = nums.length;
        while(!isFound && arraySize >= 1){

            int halfNumberPos = nums.length / 2;
            if(Objects.equals(nums[halfNumberPos], target)){

                isFound = true;
            }else if(nums[halfNumberPos] > target){

                nums = Arrays.copyOfRange(nums, 0, halfNumberPos);
            }else if (nums[halfNumberPos] < target){

                nums = Arrays.copyOfRange(nums, halfNumberPos, nums.length);
            }
            arraySize = halfNumberPos;
        }

        return isFound ? target : -1;
    }

}
