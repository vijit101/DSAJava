package DSAForever;

import java.util.HashMap;

public class practise {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int n =  subarraySum(nums, 2);

    }

    public static int subarraySumNormal(int[] nums, int k) {
        int arylen = nums.length;
        int ans = 0 ;
        int result = 0;
        if(arylen == 0){
            return 0;
        }
        for (int i = 0; i < arylen; i++) {
            result = nums[i];
            if(result==k){
                ans +=1;
            }
            for (int j = i+1; j < arylen; j++) {
                result += nums[j];
                if(result==k){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int subarraySum(int[] nums, int k) {
        int arylen = nums.length;
        int ans = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, ans);
        if(arylen == 0){
            return 0;
        }
        for (int i = 0; i < arylen; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for (int i = 0; i < arylen; i++) {
            if(map.containsKey(k-nums[i])){
                ans ++;
            }
        }
        return ans;
    }
}
