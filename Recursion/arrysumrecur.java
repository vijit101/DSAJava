package Recursion;

public class arrysumrecur {
    public static void main(String[] args) {
        int[] ary2 = { 2, 8, 12, 16, 19 };
        System.out.println(sum(ary2, 0));
    }

    public static int sum(int input[], int i) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (i == input.length - 1) {
            return input[i];
        }
        int sum = input[i] + sum(input, i + 1);
        return sum;
    }
}
