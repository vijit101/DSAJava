public class smallestDifference {
    public static void main(String[] args) {
        int[] Myary = { 10, 20, 30 };
        int[] ary2 = { 17, 15 };
        System.out.println(smallestDifferencePair(Myary, 0, ary2, 0));
    }

    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        // Write your code here.
        int[] mergedSortedList = merge(arr1, arr2);
        int dist = Math.abs(mergedSortedList[0] - mergedSortedList[1]);
        for (int i = 1; i < mergedSortedList.length - 1; i++) {
            if (dist > Math.abs(mergedSortedList[i] - mergedSortedList[i + 1])) {
                dist = Math.abs(mergedSortedList[i] - mergedSortedList[i + 1]);
            }
        }
        return dist;
    }

    public static int[] merge(int arr1[], int arr2[]) {
        // Your code goes here
        int[] ary = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < ary.length) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    ary[k] = arr1[i];
                    k++;
                    i++;
                } else if (arr1[i] >= arr2[j]) {
                    ary[k] = arr2[j];
                    k++;
                    j++;
                }
            } else if (i >= arr1.length) {
                ary[k] = arr2[j];
                k++;
                j++;
            } else if (j >= arr2.length) {
                ary[k] = arr1[i];
                k++;
                i++;
            }
        }
        return ary;
    }
}
