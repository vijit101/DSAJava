package HashmapUse;

import java.util.ArrayList;
import java.util.List;

public class arrayUtils {
    public static <T> void PrintArray(T[] arr){
        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i]);
        }
    }

    public static <T> void  PrintArrayList(ArrayList<T> arr){
        for(int i=0;i<arr.size();i++){
            System.err.println(arr.get(i));
        }
    }

    public static <T> void  PrintArrayList(List<T> arr){
        for(int i=0;i<arr.size();i++){
            System.err.println(arr.get(i));
        }
    }
}
