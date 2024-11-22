package Recursion;

public class sumofNnums {
    public static void main(String[] args) {
        System.out.println(sumnum(5));
    }

    public static int sumnum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = sumnum(n - 1) + n;
        return sum;
    }
}
