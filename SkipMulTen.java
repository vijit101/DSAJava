import java.util.Scanner;

public class SkipMulTen {
    public static void main(String[] args) {
        Scanner sc = IncludeScanner();
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 10 == 0) {
                continue;
            } else {
                System.out.println(i + "not a multiple of 10");
            }
        }
    }

    public static Scanner IncludeScanner() {
        // or should i make the sc as a singleton
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}