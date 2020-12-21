/*
 * 
 */
package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kunal
 */
public class TwoSums1 {
    public static void main(String [] args){
         int [] nums = {3,4,2,12};
         int target = 6;
         TwoSums1 obj = new TwoSums1();
         //obj.twoSum(nums,target);
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }
    public int[] twoSum(int[] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<= nums.length-1 ; i++){
            map.put(nums[i], i);
        }
        for (int j = 0; j<nums.length-1; j++){
            int diff = target - nums[j];
            if (map.containsKey(diff)&& map.get(diff)!=j){ //
                return new int[] {j, map.get(diff)};
            }
        
        }
        
        
        throw new IllegalArgumentException("No matching solution!");
    }
}
