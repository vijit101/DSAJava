package BitManipulation;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num & 1) == 1) { // as and of num with 000001 means all other bits 0 only last bit 1
            System.out.println("Num is odd ");
        } else {
            System.out.println("Num is even");
        }
    }
}
