//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
package dsa;

/**
 *
 * @author kunal
 */
public class RotatedSortedArray {

    public static void main(String[] args) {
        RotatedSortedArray o = new RotatedSortedArray();
//        int nums[] = {8, 9, 10, 5, 6, 7};
//        int nums[] = {3,1,2};
//        int nums[] = {1,2,3,4};
          int nums[] = {5,1,2,3,4};
        System.out.println(o.findMin(nums));
    }

   public int findMin(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int first = nums[0];
        int mid = (nums.length / 2);
        int last = nums[nums.length - 1];
        int val = mid;
        if (first < last) {
            System.out.println("base:");
            return first;
        }
        else if (nums[0] > nums[mid]) {
            System.out.println("mid is :" + nums[mid]);
            for (int i = mid; i > 0; i--) {
                if (nums[i] >= nums[0]) {
                    val = i+1;
                    System.out.println("mid is smaller :");
                    System.out.println("val:" + val);
                    return nums[val];
                }
            }
        }
        else if (nums[0] < nums[mid]) {
            System.out.println("mid is :" + nums[mid]);
            for (int j = mid; j < nums.length; j++) {
                if (nums[j] < nums[0]) {
                    val = j;
                    System.out.println("mid is greater :");
                    System.out.println("val:" + val);
                    return nums[val];
                }
            }
        }
        else if (first == nums[mid]){
            return Math.min(first,last);
        }

        return nums[val];
    }

}
