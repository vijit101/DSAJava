package ArraysCode;

public class arrayEquilibriumIndx {
    public static void main(String[] args) {
        int[] arr = {2,3,10,-10,4,2,9}; 
		int x = arrayEquilibriumIndex(arr);
        System.out.print(x);
		// int i=0;
		// while(i<arr.length) {
		// 	System.out.print(arr[i]);
		// 	i++;
		// }
    }

    public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        int eqlIndx = -1;
        if(arr.length ==0 || arr.length ==1){
            return 0;
        }
        // check if first index is pt of eql
        // int i=1;
        // int sum =0;
        // while(i<arr.length){
        //     sum += arr[i];
        //     i++;
        // }
        // if(sum ==0){

        // }

        
        int startIndx = 0;
        int endIndx = arr.length-1;
        int sumLeft = arr[startIndx];
        int sumRight = arr[endIndx];

        while(startIndx<endIndx){
            if(sumLeft<sumRight){
                startIndx++;
                sumLeft+=arr[startIndx];
                eqlIndx = -1;
            }
            else if(sumRight<sumLeft){
                endIndx--;
                sumRight += arr[endIndx];
                eqlIndx = -1;
            }
            else{
                startIndx++;
                sumLeft+=arr[startIndx];
                endIndx--;
                sumRight += arr[endIndx];
                eqlIndx = startIndx;
            }
        }
        return eqlIndx;
	}


    public static int arrayEquilibriumIndex2(int[] arr) {
        // Return -1 if the array is empty
        if (arr.length == 0) {
            return -1;
        }
    
        int leftSum = 0;  // Tracks the sum of elements to the left
        int rightSum = 0; // Tracks the sum of elements to the right
    
        // Initialize rightSum by summing all elements except the first
        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }
    
        // Traverse the array and compare leftSum with rightSum
        for (int i = 0; i < arr.length; i++) {
            // If leftSum equals rightSum, return the current index
            if (leftSum == rightSum) {
                return i;
            }
    
            // Update leftSum and rightSum as we move to the next index
            if (i + 1 < arr.length) {
                leftSum += arr[i];         // Add the current element to leftSum
                rightSum -= arr[i + 1];    // Remove the next element from rightSum
            }
        }
    
        // If no equilibrium index is found, return -1
        return -1;
    }

}
