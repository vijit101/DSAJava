package ArraysCode;

import java.util.Arrays;

public class duparray {
    public static void main(String[] args) {
        int[] ary = {0,7,2,5,4,7,1,3,6};//012345677
    }
    public static int findDuplicate(int[] arr) {
		//Your code goes here
        if(arr.length ==1){
            return arr[0];
        }
        Arrays.sort(arr);
        for(int i =0 ;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
	}
}
