package Leetcode;

public class subarrsumeqlK {
    public static void main(String[] args) {
        int[] arr = {28,54,7,-70,22,65,-6};
        System.out.println(subarraySum(arr, 100));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0,mxSubArrSize = 0;
        // if(k==0 || nums.length == 0){
        //     return 0;
        // }
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if(sum == k){
                if(mxSubArrSize <= 1){
                    mxSubArrSize =1;
                    //continue;
                }
            }
            for (int j = i+1; j < nums.length; j++) {
                sum = sum + nums[j];
                if(sum == k){
                    int winsize = (j-i)+1;
                    mxSubArrSize = winsize>mxSubArrSize?winsize:mxSubArrSize;
                }
            }
        }
        return mxSubArrSize;
    }

    public static int subarraySum2(int[] nums, int k) {
        int sum = 0,count = 0;
        // if(k==0 || nums.length == 0){
        //     return 0;
        // }
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if(sum == k){
               {
                count ++;
                continue;
               }
            }
            for (int j = i+1; j < nums.length; j++) {
                sum = sum + nums[j];
                if(sum > k){
                    break;
                }else if(sum == k){
                    count++;
                    //break;
                }
            }
        }
        return count;
    }
}
