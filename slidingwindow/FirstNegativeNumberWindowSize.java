package slidingwindow;

import java.util.ArrayList;

public class FirstNegativeNumberWindowSize {
    public static void main(String[] args) {
        int[] arry = {12,-1,-7,8,-15,30,16,28};
        firstNegativeBest(arry,3);
    }

    public static void firstNegativebad(int[] nums,int k){
        int i = 0, j = 0;
        boolean negnum = false;
        while(j<nums.length){
            int valAtj = nums[j];
            int windowSize = (j-i)+1;
        
            if(valAtj<0 && negnum == false){
                System.out.print(valAtj);
                negnum = true; 
            }
            if(windowSize < k){
                j++;
            }
            if(windowSize==k){
                if(negnum == false){
                    System.out.print(0);
                }
                negnum = false;
                i++;
                j++;
            }

        }
    }

    public static void firstnegAnsbad(int[] nums,int k){
        int i= 0, j = 0 ;
        boolean negnm = false ;
        while (j<nums.length) { 
            int windowSize = (j-i)+1;
            if(windowSize<k){
                int valAtj = nums[j];
                if(valAtj <0 && negnm == false ){
                    System.out.println(valAtj);
                    negnm = true;
                }

                j++;

            }
            if(windowSize == k){
                int valati = nums[i];
                if( valati< 0){
                    System.out.print(valati);
                }else{
                    System.out.print(0);
                }
                i++;
                j++;
            }
        }
        
    }

    public static void firstnegAns3(int[] nums,int k){
        int i= 0, j = 0 ;
        ArrayList<Integer> negativeNums = new ArrayList<>();
        while (j<nums.length) { 
            int windowSize = (j-i)+1;
            int valAtj = nums[j];
            if(valAtj < 0){
                negativeNums.add(valAtj);
            }
            if(windowSize<k){
                j++;
            }
            if(windowSize == k){
                if(negativeNums.isEmpty()){
                    System.out.print(0); 
                }else{
                    if(nums[i] == negativeNums.get(0)){
                        System.out.print(negativeNums.remove(0)); 
                    }else{
                        System.out.print(negativeNums.get(0)); 
                    }
                    
                }
                
                i++;
                j++;
            }
        }
        
    }


    public static void firstNegativeBest(int[] nums, int k) {
        int i = 0, j = 0;
        int firstNegIndex = -1; // Stores index of first negative number in the window

        while (j < nums.length) {
            // If current number is negative and we haven't found a first negative yet
            if (nums[j] < 0 && firstNegIndex < i) {
                firstNegIndex = j; // Update to the new first negative number
            }

            // Step 2: When window reaches size k
            if ((j - i + 1) == k) {
                // Print the first negative if it's still inside the window
                if (firstNegIndex >= i) {
                    System.out.print(nums[firstNegIndex] + " ");
                } else {
                    System.out.print(0 + " ");
                }

                // Step 3: Slide window
                i++;
                j++;

                // If first negative is moving out of window, reset it
                if (firstNegIndex < i) {
                    firstNegIndex = -1;
                }
            } 
            else {
                j++;
            }
        }
    }

}
