// 1 loop hash map
package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kunal
 */
public class TwoSums3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
     
         int [] nums = {3,1,4,2};
         int target = 6;
         TwoSums3 obj = new TwoSums3();
         //obj.twoSum(nums,target);
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }
    public int[] twoSum(int[] nums, int target){
        Map <Integer, Integer> hm = new HashMap<>();
        for (int i =0; i<(nums.length) ; i++){
            if (hm.containsKey(target - nums[i])){
               return new int[] {hm.get(target - nums[i]), i};
             }
            else hm.put(nums[i],i);
                 
 
            
        }
        System.out.println(hm); 
       throw new IllegalArgumentException("No matching values found");
    }

}
