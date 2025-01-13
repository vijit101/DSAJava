package Sorting;

public class insertionSorting {
    public static void main(String[] args) {
        int[] Myary = { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
        insertionSort(Myary, 0);
        for (int i = 0; i < Myary.length; i++) {
            System.out.println(Myary[i]);
        }
    }

    public static void insertionSort(int[] arr, int size) {
        // Your code goes here
        for (int i = 1; i < arr.length; i++) {
            int compareObj = arr[i];
            int indxTrackerforSwappedNum = i;
            for (int j = i - 1; j >= 0; j--) {
                if (compareObj < arr[j]) {// { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
                    int temp = arr[j];
                    arr[j] = arr[indxTrackerforSwappedNum];
                    arr[indxTrackerforSwappedNum] = temp;
                    indxTrackerforSwappedNum--;
                }
            }
        }
    }
}
