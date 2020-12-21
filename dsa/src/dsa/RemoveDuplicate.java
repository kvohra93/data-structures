/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kunal
 */
public class RemoveDuplicate {

    public static void main(String[] args) {

        RemoveDuplicate o = new RemoveDuplicate();
//    int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {0, 1, 1, 2, 2, 3};
        System.out.println(o.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                
            }
        }

        
        return i + 1;
    }

}
