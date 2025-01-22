package ArraysCode;

// public class Vector2{
//     public int x;
//     public int y;

//     public Vector2(int a,int b) {
//         x = a;
//         y = b;
//     }
// }


public class pairSum {
    public static void main(String[] args) {
        int[] arr = {1,3,6,11,12,17}; 
		rotate(arr, 4);
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]);
			i++;
		}
    }

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		int count = 0;
		for(int i=0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == num){
					count++;
				}
			}
		}
		return count;
	}

	public static void rotate(int[] arr, int d) {
    	//Your code goes here
		int i=0;
		if(d==0){
			return;
		}
		int[] arr1 = new int[d];
		int[] arr2 = new int[arr.length -d];
		while(i<d){
			arr1[i] = arr[i];
			i++;
		}
		i=d;
		int arrindx= 0;
		while(i<arr.length){
			arr2[arrindx] = arr[i];
			arrindx++;
			i++;
		}
		i=0;
		while(i<arr2.length){
			arr[i] = arr2[i];
			i++;
		}
		i=0;
		while(i<arr1.length){
			arr[i+arr2.length] = arr1[i];
			i++;
		}

        
    }

}
