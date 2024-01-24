package com.example;

import java.util.Hashtable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        int[] nums = {2,7,11,15}; 
        int target = 9;
        int[] result = twoSumOptimal(nums, target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    public static int[] twoSum(int[] nums, int target) {        
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++)
            for(int j = i + 1; j <= nums.length - 1; j++){
                int currentSum = nums[i] + nums[j];
                if(currentSum == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }

        return result;   
    }    

    public static int[] twoSumOptimal(int[] nums, int target) {  

        int[] result = new int[2];
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for(int i = 0; i < nums.length; i++){

            int currentSubstraction = target - nums[i];
            if(hashtable.get(currentSubstraction) != null){
                result[0] = hashtable.get(currentSubstraction);
                result[1] = i;
                break;
            }                
            else {
                hashtable.put(nums[i], i);
            }

        }
            
        return result;   
    }        
}
