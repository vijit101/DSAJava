package DSAForever;
public class Day1Prefixsum{
    public static void main(String[] args) {
        
    }

    public static int[] runningSum(int[] nums) {
        int arraylen = nums.length;
        if(arraylen == 0){
            return null;
        }
        if(arraylen ==1){
            return nums;
        }
        int[] ans = new int[arraylen];
        int res = nums[0];
        ans[0] = res; 
        for (int i = 1; i < arraylen; i++) {
            res += nums[i];
            ans[i] = res;
        }
        return ans;
    }
}