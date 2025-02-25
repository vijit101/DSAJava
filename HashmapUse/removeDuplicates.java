package HashmapUse;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,3,1,6,2,5};
        ArrayList<Integer> output = remDuplicates(arr);
        System.out.println(output);
    }

    public static ArrayList<Integer> remDuplicates(int[] arr){
        ArrayList<Integer> opt = new ArrayList<>();
        HashMap<Integer,Boolean>  map=  new HashMap<>(); 
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                continue;
            }
            opt.add(arr[i]);
            map.put(arr[i], true);
        }
        return  opt;

    }
}
