package Sorting;

public class SelectionSortRemix {
    public static void main(String[] args) {
        int[] Myary = { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
        Myary = SelectionSort(Myary);
        for (int i = 0; i < Myary.length; i++) {
            System.out.println(Myary[i]);
        }
    }

    public static int[] SelectionSort(int[] ary) {
        for (int i = 0; i < ary.length - 1; i++) {
            double min = Double.POSITIVE_INFINITY;
            int minIndex = i;
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[minIndex] > ary[j]) {
                    minIndex = j;
                }
            }
            int temp = ary[i];
            ary[i] = (int) min;
            ary[minIndex] = temp;
        }
        return ary;
    }

}
