import java.util.Scanner;

public class looptest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which the sum will be calculated");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i < n) {
            i++;
            sum += i;
        }
        System.out.println("Sum of first N numbers" + sum);
    }
}
