import java.util.Scanner;

class Solution {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        helper.multiply(a, b,c);
    }
}

// Helper class containing overloaded multiplication methods
class Helper {

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply an array of integers
    public void multiply(int a, int b,int c) {
        int prod = a*b;
        System.out.println(prod);
        System.out.println(prod*c);
    }
}

// Main class to handle user input and invoke Helper methods
