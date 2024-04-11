package BitManipulation;

public class getIthBit {
    public static void main(String[] args) {
        GetBitAt(10, 1);
    }

    public static void GetBitAt(int nos, int ithBit) {
        byte num = (byte) ((nos >> ithBit) & (1));
        System.out.println(num);

    }
}
