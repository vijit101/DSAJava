package Leetcode;

public class Twosum {
    public static void main(String[] args) {
        
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums == null){
            return new int[]{};
        }
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                int cal = nums[i]+nums[j];
                if(cal == target){
                    int[] ans = new int[2];
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return new int[]{};
    }

}
