//https://leetcode.com/problems/two-sum/
package dsa;

import java.util.HashSet;

/**
 *
 * @author kunal
 */
public class TwoSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] nums = {2,7,11,15};
         int target = 9;
         TwoSums obj = new TwoSums();
         int res[] = obj.twoSum(nums,target);
         for(int i:res)
            System.out.print(i+","); 
    }

    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (hs.contains(target-i)) {
                int res[]= new int[2];
                res[0]=i;
                res[1]=target-i;
                return res;
            } else {
                hs.add(i);
            }
        }
        return null;
    }

}
