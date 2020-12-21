
package dsa;

import java.util.Arrays;

/**
 *
 * @author kunal
 */
public class MaxProductSubarray {

    
    public static void main(String[] args) {
      int[] nums = {-3,-2,-1,0,-1,1,2};
      // prod = -3 , 6, -6, 0 , -1 , 1 , 35
      //max prod =  -3, 6 , 6 , 6 , 6 , 6, 35
        System.out.println(MaxProductSubarray.maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int prod = 1;
        int res = 0;
        int maxP = Integer.MIN_VALUE;
        int minP = Integer.MIN_VALUE;
      
        for (int i =0; i<nums.length; i++){
            prod *= nums[i];
            int temp_max = Math.max(prod,Math.max(nums[i]*minP, nums[i]));
            minP = Math.min(nums[i],Math.min(maxP*nums[i],minP));
            
           
            maxP = temp_max;
            res =Math.max(res,maxP);
            
           
        }
             

    return maxP;
    }}
    
 
