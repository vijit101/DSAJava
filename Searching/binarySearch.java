package Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 10 };
        int index = binSearch(5, arr);
        System.out.println(index);
    }

    public static int binSearch(int key, int[] arry) {
        int indx = -1;
        int start = 0;
        int end = arry.length;
        int midpt = arry.length / 2;
        for (int i = 0; i <= (arry.length) / 2; i++) {
            if (key == arry[midpt]) {
                indx = midpt;
                return indx;
            } else if (key < arry[midpt]) {
                end = midpt;
                midpt = (midpt + start) / 2;
            } else if (key > arry[midpt]) {
                start = midpt;
                midpt = (midpt + end) / 2;

            }
        }
        return indx;
    }

    public static int search(int[] nums, int target) {
        // Write your code here.
        int indx = -1;
        return indx;
    }

}
