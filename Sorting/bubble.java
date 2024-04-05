package Sorting;

public class bubble {
    public static void main(String[] args) {
        int[] Myary = { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
        Myary = BubbleSort(Myary);
        for (int i = 0; i < Myary.length; i++) {
            System.out.println(Myary[i]);
        }
    }

    public static int[] BubbleSort(int[] ary) {
        for (int i = 0; i < ary.length - 2; i++) {

            for (int j = 0; j < ary.length - 1 - i; j++) {
                if (ary[j] > ary[j + 1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
        return ary;
    }
}
