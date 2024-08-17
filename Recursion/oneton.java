package Recursion;

public class oneton {
    public static void main(String[] args) {
        // printAllnos(10);
        System.out.println(xpown(34.00515, -3));
    }

    private static void printAllnos(int num) {
        if (num == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(num);
        printAllnos(num - 1);
        System.out.println(num);
    }

    public static double xpown(double x, int n) {
        double val;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }
        val = xpown(x, Math.abs(n / 2));
        val = val * val;
        if (n % 2 != 0) {
            val = val * x;
        }
        if (n > 0) {
            return val;
        } else {
            return (1 / val);
        }
    }
}
