package BitManipulation;

import java.util.Scanner;

public class clearLastithBits {
    public static void main(String[] args) {
        int num, ibits;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ibits = sc.nextInt();
        System.out.println(ClearLastBits(num, ibits));
        System.out.println(ClearBitRange(11, 2, 1));
    }

    private static int ClearLastBits(int num, int ibits) {
        // TODO Auto-generated method stub
        int bitmask = ~0 << ibits;
        int otpt = num & bitmask;
        return otpt;

    }

    private static int ClearBitRange(int num, int ibitleftmost, int ibitrightmost) {
        // TODO Auto-generated method stub
        byte mynum = (byte) num;
        String bit = Byte.toString(mynum);
        int size = bit.length() - 1;
        int bitmask = (~0 << ibitleftmost) | (1 >> size - ibitrightmost);
        int otpt = num & bitmask;
        return otpt;

        // bit mask = ((~0 << ibitleftmost)) | (1<<i) -1
    }

}
