package Sorting;

public class bubble {
    public static void main(String[] args) {
        // int[] Myary = { 120, 1, 10, 360, 5, 3, 6, 2, 100 };
        int[] Myary = {
                90, 68, 151, 175, 398, 382, 369, 609, 940, 982, 47, 522, 497, 784,
                126, 659, 124, 931, 272, 473, 794, 411, 379, 717, 502, 812, 548, 50,
                450, 358, 136, 454, 980, 916, 683, 637, 317, 345, 676, 899, 574, 69,
                201, 353, 604, 588, 375, 810, 119, 808, 589, 53, 565, 888, 929, 997,
                540, 649, 267, 504, 727, 228, 529, 53, 760, 984, 114, 738, 471, 290,
                655, 165, 234, 242, 239, 721, 614, 775, 138, 339, 972, 509, 856, 901,
                320, 46, 539, 266, 502, 888, 18
        };
        Myary = BubbleSort(Myary);
        for (int i = 0; i < Myary.length; i++) {
            System.out.println(Myary[i]);
        }
    }

    public static int[] BubbleSort(int[] ary) {
        for (int i = 0; i < ary.length - 1; i++) {

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
