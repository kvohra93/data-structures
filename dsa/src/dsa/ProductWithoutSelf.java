/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kunal
 */
public class ProductWithoutSelf {

    public static void main(String[] args) {
        ProductWithoutSelf o = new ProductWithoutSelf();
        int[] nums = {1, 3, 5, 2};          
        System.out.println(Arrays.toString(o.productExceptSelf(nums)));     
                                                            //1,1,3,15
                                                            //30,10 ,2,1
                                                            //30,10, 6,15
    }

    public int[] productExceptSelf(int[] nums) {
        int[] left = new int [nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[right.length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        for (int i = right.length-2; i >=0; i--) {
            right[i]=right[i+1]*nums[i+1];
        }
        int res[] = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            res[i] =left[i] * right[i];
        }
        return res;

    }

}
