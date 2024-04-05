package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(CalculateFactorial(5));
    }

    public static int CalculateFactorial(int num) {

        if (num == 0) {
            System.err.println("Base Case");
            return 1;
        }
        int fct = num * CalculateFactorial(num - 1);

        return fct;
    }
}
