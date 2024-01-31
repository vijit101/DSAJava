public class Dectobin {
    public static void main(String[] args) {
        long decimal = dectobin(10111);
        System.out.println("decimal is : " + decimal);
    }

    public static long dectobin(long binary) {
        long newnum = 0;
        String decstring = Long.toString(binary);
        for (int i = 0; i < decstring.length(); i++) {
            long num = (long) (binary % 10) * (long) (Math.pow(2, i));
            newnum += num;
            binary = binary / 10;

        }
        return newnum;
    }
}
