package BitManipulation;

public class getIthBit {
    public static void main(String[] args) {
        System.out.println(GetBitAt(10, 1));
        System.out.println(SetBitAt(10, 2));
        System.out.println(ClearBitAt(5, 0));
    }

    public static byte GetBitAt(int nos, int ithBit) {
        byte num = (byte) ((nos >> ithBit) & (1));
        return num;
        // Aliter bitmask = int bitMask = (1 << ithBit);
        // if (nos & bitmask > 0) { return 1 } else { 0 }
    }

    public static int SetBitAt(int nosToSet, int ithBit) {
        int bitMask = (1 << ithBit);
        int num = nosToSet | bitMask;
        return num;
    }

    public static int ClearBitAt(int nosToSet, int ithBit) {
        int bitMask = (1 << ithBit); // eg 5 is 101 and ith is 0 hence 1 < 0 is 001 hence ~001 is 110 so 101 & 110 is
                                     // 100
        bitMask = ~(bitMask);
        int num = nosToSet & bitMask;
        return num;
    }

    public static int updateIthBit(int nosToSet, int ithBit, int bittoUpdate) {
        int num;
        if (bittoUpdate == 0) {
            num = ClearBitAt(nosToSet, ithBit);
            return num;
        } else {
            num = SetBitAt(nosToSet, ithBit);
            return num;
        }

        // Aliter same can be done without if else first clear then shift the
        // bittoupdate say 1 to 3rd pos 0100 and or
        // n = clearbitat();
        // int Bitmask = BitToUpdate << i
        // int num = nosToSet | bitMask;
    }
}
