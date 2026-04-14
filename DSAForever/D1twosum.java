package DSAForever;

import java.util.HashMap;

public class D1twosum {
    public static void main(String[] args) {
        
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] Answer = new int[2];
        int length = nums.length;
        
        if(nums == null || length == 1){
            return Answer;
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = i+1; j < length; j++) {
                if(nums[i]+nums[j] == target){
                    Answer[0] = i;
                    Answer[1] = j;
                    break;
                }
            }
        }

        return Answer;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] Answer = new int[2];
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < length; i++) {
            int pairAnswer = target - nums[i];
            if(map.containsKey(pairAnswer) && map.get(pairAnswer)!=i){
                Answer[0] = i;
                Answer[1] = map.get(pairAnswer);
                break;
            }
        }
        return Answer;
    }

}
