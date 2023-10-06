package Strings;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number/
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5};
        int res = SecondLargestNumber(nums);
        //nums = reverse(nums);
        //System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }

    public static int  SecondLargestNumber(int[] nums) {
        int max1 = nums[0];
        int max2 = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2){
                  max2 = nums[i];
            }
        }
        return max2;
    }

    public static int findDigits(int[] digits) {
        int n = digits.length;
        int rem;
        int sum = 0;
        for(int i = 0;i<n;i++){
            rem = digits[i]/1;
            sum = sum * 10 + rem;
            System.out.println("sum "+sum);
        }
        return sum;
    }
    static int[] reverse(int[]  nums){
        for(int i = nums.length-1;i>=0;i--){
            System.out.println(nums[i]);
        }
        return nums;
    }
}
