public class mergesort {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 6, 2, 0 };
        mergeSort(arr, 0, arr.length);
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        // Write your code here

        if (arr.length <= 1) {
            return;
        }

        int leftLen = (l + r) / 2;
        int rightLen = r - leftLen;

        int[] leftArr = new int[leftLen];
        int[] rightArr = new int[rightLen];

        for (int i = 0; i < leftLen; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = leftLen; i < r; i++) {
            rightArr[i - leftLen] = arr[i];
        }
        mergeSort(leftArr, 0, leftLen);
        mergeSort(rightArr, 0, rightLen);
        Mergeit(leftArr, rightArr, arr);
    }

    public static void Mergeit(int[] LeftHalf, int[] RightHalf, int[] mergedArr) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < LeftHalf.length && j < RightHalf.length) {
            if (LeftHalf[i] <= RightHalf[j]) {
                mergedArr[k] = LeftHalf[i];
                i++;
                k++;
            } else {
                mergedArr[k] = RightHalf[j];
                j++;
                k++;
            }
        }

        while (i < LeftHalf.length) {
            mergedArr[k] = LeftHalf[i];
            k++;
            i++;
        }

        while (j < RightHalf.length) {
            mergedArr[k] = RightHalf[j];
            k++;
            j++;
        }

    }
}
