package slidingwindow;

public class maxSumSubarr {
    


    public static void main(String[] args) {
        int[] arry = {2, 1, 5, 1, 3, 2};
        int x = sumSubArr(arry, 3);
        System.out.print(x);
    }

    public static int sumSubArr(int[] nums , int k){
        int Maxsum = 0;
        int prevsum = 0;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            Maxsum += nums[right];
            int windowSize = (right-left)+1;
            if(windowSize < k){
                
                right++;
                
            }
            else if(windowSize ==k){
                // Maxsum = Maxsum>prevsum?Maxsum:prevsum;
                // prevsum = Maxsum;
                // Maxsum = prevsum - nums[left];
                // left++;  
                
            }
            
        }

        return Maxsum;
    }

    public static int sumSubArr1(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        int left = 0;
    
        // Form the first window of size K
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;
    
        // Start sliding the window
        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right]; // Add new element
            windowSum -= nums[left];  // Remove old element
            left++;                   // Move left pointer forward
    
            maxSum = Math.max(maxSum, windowSum);
        }
    
        return maxSum;
    }
}
