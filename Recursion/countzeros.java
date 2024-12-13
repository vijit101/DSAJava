package Recursion;

public class countzeros {
    public static void main(String[] args) {
        int num = 102401213;
        System.out.println(countZerosRec(num));
    }

    public static int countZerosRec(int input) {
        // Write your code here
        if (0 <= input && input <= 9) {
            if (input == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int dig = input % 10;
        if (dig == 0) {
            return 1 + countZerosRec(input / 10);
        } else {
            return 0 + countZerosRec(input / 10);
        }
    }
}
