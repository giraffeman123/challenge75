package com.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println( search(nums, target) );
    }

    public static int search(int[] nums, int target) {                        
        return binarySearch(nums, target, 0, nums.length-1);
    }    

    public static int binarySearch(int[] nums, int target, int l, int r) {                
        if(l <= r && l <= nums.length){
            int middle = l + (r - l) /2;
            if(target == nums[middle])
                return middle;
            
            if(target > nums[middle]){
                return binarySearch(nums, target, middle+1, r);
            }else{
                return binarySearch(nums, target, l, middle-1);
            }
                        
        }
        return -1;
    }        
}
