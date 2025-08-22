package DSAForever;

import java.util.HashMap;

public class Day5TwoSumHash {
    public static void main(String[] args) {
        
    }

    public static int[] twoSumIterative(int[] nums, int target) {
        int[] ans = new int[2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    ans[k] = i;
                    ans[k+1] = j;
                    k+=2;
                }
            }
        }
        return  ans;
    }

    public static int[] twoSum(int[] nums, int target) {
        // hashmap implementation 
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int numsLen = nums.length;
        for (int i = 0; i < numsLen ; i++) { 
            map.put(nums[i], i);
        }

        for (int i = 0; i < numsLen ; i++) {
            Integer keyToCheck = target-nums[i];
            if(map.containsKey(keyToCheck)){
                int keyatPos = map.get(keyToCheck);// if say [3,2,4] t = 6 then answer cant be [0,0] do not use 3 twice 
                if(keyatPos != i){
                    ans[0] = i;
                    ans[1] = map.get(keyToCheck);
                    return ans;
                }             
            }
        }
        return  ans;
    }

}
