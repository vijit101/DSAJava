
import java.util.Scanner;

public class checkpow2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(Checkpowerof2(num));
    }

    public static boolean Checkpowerof2(int num) {
        if (((num) & (num - 1)) == 0) {
            return true;
        }
        return false;
    }
}
