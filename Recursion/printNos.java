package Recursion;

public class printNos {
    public static void main(String[] args) {
        printAllnos(5);

    }

    private static int printAllnos(int num) {
        if (num == 0) {
            return 1;
        }
        System.out.println(num);
        printAllnos(num - 1);
        System.out.println("hello world");
        return 0;
    }
}
