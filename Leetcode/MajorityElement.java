package Leetcode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {6,6,6,7,7};
        System.out.println(majorityElement(arr));
    }

    public static  int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int prevcount = 0;
        if(nums.length == 1){
            return nums[0];
        }

        for (int i =0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1] && i==nums.length-2){
                prevcount = count;
                count = (i+2) - prevcount;       // here i+2 as i am ending it at second last elem
                count = count>prevcount?count:prevcount;
            }
            if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                prevcount = count;
                count = (i+1) - prevcount;
                count = count>prevcount?count:prevcount;
                
            }
        }
        return nums[count-1];
    }


    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums); // O(N log N)
        return nums[nums.length / 2]; // Majority element will always be in the middle.
    }
}
