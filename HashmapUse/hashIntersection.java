package HashmapUse;

import java.util.ArrayList;
import java.util.HashMap;

public class hashIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7,7,7};
        int[] arr2 = {7,7,7,7};
        printIntersection(arr1,arr2);
    }

    public static void printIntersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
		for (int idx = 0; idx < arr1.length; idx++) {
            
            if(map.containsKey(arr1[idx]))
            {
                Integer val = map.get(arr1[idx]);
                map.put(arr1[idx], ++val);
            }else{
                map.put(arr1[idx], 0);
            }
        }

        for (int idx = 0; idx < arr2.length; idx++) {
            if(map.containsKey(arr2[idx])&& map.get(arr2[idx])>=0)
            { 
                Integer val = map.get(arr2[idx]);
                map.put(arr2[idx], --val);
                System.out.println(arr2[idx]);
            }
        }

	}

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        // Store nums1 elements in map (only keys matter, values are not used)
        for (int idx = 0; idx < nums1.length; idx++) {
            map.put(nums1[idx], 1);  // Changed value to '1' (though it's unused)
        }

        // Check if nums2 elements exist in map, if yes, store in map2
        for (int idx = 0; idx < nums2.length; idx++) {
            if (map.containsKey(nums2[idx])) {
                map2.put(nums2[idx], 1);  // Value doesn't matter, just storing unique keys
            }
        }

        // Convert map2 keys to an int[]
        Integer[] arr = map2.keySet().toArray(new Integer[0]); // Proper conversion
        int[] arr1 = new int[arr.length];

        for (int idx = 0; idx < arr.length; idx++) {
            arr1[idx] = arr[idx];  // Unboxing Integer to int
        }

        return arr1;
    }
}
