package Recursion;

public class RecursiveArraycheck {
    public static void main(String[] args) {
        int[] Myary = { 1, 3, 6, 11, 12, 17 };
        int[] ary2 = { 2, 8, 12, 16, 19 };
        System.out.println(arraySortedOrNot(Myary, 0));
    }

    public static boolean arraySortedOrNot(int[] A, int N) {
        // Write your code here.
        --N;
        if (N == 0 || N == 1) {
            return true;
        }

        if (A[N - 1] > A[N]) {
            return false;
        }

        boolean smallerArray = arraySortedOrNot(A, N);
        return smallerArray;
    }
}
