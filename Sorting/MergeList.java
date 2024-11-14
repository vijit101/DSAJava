public class MergeList {
    public static void main(String[] args) {
        int[] Myary = { 1, 3, 6, 11, 12, 17 };
        int[] ary2 = { 2, 8, 12, 16, 19 };
        int[] test = merge(Myary, ary2);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
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
