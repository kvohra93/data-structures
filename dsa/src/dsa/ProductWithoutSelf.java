/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kunal
 */
public class ProductWithoutSelf {

    public static void main(String[] args) {
        ProductWithoutSelf o = new ProductWithoutSelf();
        int[] nums = {1, 3, 5, 2};           // 1,1,3,15 
        System.out.println(o.productExceptSelf(nums));        //30,10 ,2,1
        // 30,10, 6,15
    }

    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        prod[1] = 1;
        for (int i = 1; i < nums.length; i++) {
            prod[i] = nums[i - 1] * prod[i - 1];
        }
        for (int j = nums.length - 2; j >= 0; j++) {
            prod[j] *= nums[j - 1];

        }
        return prod;

    }

}
