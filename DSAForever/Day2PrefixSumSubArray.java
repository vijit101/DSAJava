package DSAForever;

public class Day2PrefixSumSubArray {
    public static void main(String[] args) {
        
    }

    public int subarraySum(int[] nums, int k) {
        int arlen = nums.length;
        if(arlen == 0){
            return 0;
        }
        int ans = 0 ;
        int res = 0;
        for (int i = 0; i < arlen; i++) {
            for (int j = i; j < arlen; j++) {
                res = res + nums[j];
                if(res == k){
                    ans++;
                }
            }   
            res = 0;
        }
        return ans;

    }

    
}


