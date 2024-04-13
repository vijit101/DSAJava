package BitManipulation;

import java.util.Scanner;

public class clearLastithBits {
    public static void main(String[] args) {
        int num, ibits;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ibits = sc.nextInt();
        System.out.println(ClearLastBits(num, ibits));

    }

    private static int ClearLastBits(int num, int ibits) {
        // TODO Auto-generated method stub
        int bitmask = ~0 << ibits;
        int otpt = num & bitmask;
        return otpt;

    }
}
