//https://leetcode.com/problems/two-sum/
package dsa;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author kunal
 */
public class TwoSums { //bruteforce

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] nums = {2,7,11,15};
         int target = 9;
         TwoSums obj = new TwoSums();
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
//         for(int i:res)
//            System.out.print(i+","); 
    }

    public int[] twoSum(int[] nums, int target) {
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i : nums) {
//            if (hs.contains(target-i)) {
//                int res[]= new int[2];
//                res[0]=i;
//                res[1]=target-i;
//                return res;
//            } else {
//                hs.add(i);
//            }
//        }
//        return null;
//    }
int[] res = new int[2];
int i =0,
        j;
    for (i = 0;i<=nums.length-1; i++){
        for (j = i+1;j <=nums.length-1;j++){
            if (nums[i] + nums[j]== target){
                res[0] = i;
                res[1] = j;
                return res;
               }
            else continue;
        }

}
 return null;
}
}