import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc = IncludeScanner();
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2) {
            System.out.println("The number is prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println("The number is non Prime");
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is Prime");
        }

    }

    public static Scanner IncludeScanner() {
        // or should i make the sc as a singleton
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}
