package ArraysCode;

import java.util.Scanner;

public class HelperArrayFx {

    public static void printx() {
        System.out.println("Dance Dance Revolution");
    }

    public static int[] init_Array_values() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Array Size and the function will return array");
        int ArySize = sc.nextInt();
        int[] Arraylinear = new int[ArySize];
        for (int i = 0; i <= ArySize; i++) {
            Arraylinear[i] = i + 1;
        }
        return Arraylinear;
    }
}
