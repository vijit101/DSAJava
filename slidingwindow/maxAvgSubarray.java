package slidingwindow;

public class maxAvgSubarray {
    public static void main(String[] args) {
        int[] arry = {1,12,-5,-6,50,3};
        double x = findMaxAverage(arry, 4);
        System.out.print(x);
    }

    public static double findMaxAverage(int[] nums, int k) {
        if(k==0){
            return 0;
        }
        double mxAvg = Double.NEGATIVE_INFINITY, newAvg = 0;
        int i = 0 , j = 0 , ws = 0;
        long sum = 0;
        while (j<nums.length) {
            sum += nums[j];
            ws = (j-i)+1;
            if(ws<k){ 
                j++;
            }
            else if(ws == k){
                try {
                    newAvg = (double)sum/k;
                } catch (Exception e) {
                    System.out.print(e);
                }
                
                mxAvg = mxAvg>newAvg?mxAvg:newAvg;
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return mxAvg;
    }

    public static double findMaxAverageOpt(int[] nums, int k) {
        if (k == 0) return 0; 
        
        double maxAvg = Double.NEGATIVE_INFINITY;
        int i = 0, sum = 0;
    
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
    
            if (j - i + 1 == k) {  // Window reached size k
                maxAvg = Math.max(maxAvg, (double) sum / k);
                sum -= nums[i]; // Slide the window
                i++;
            }
        }
        return maxAvg;
    }

}
