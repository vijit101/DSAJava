import java.util.Scanner;

public class Revnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int getnum = sc.nextInt();
        System.out.println("Rev of a number is " + RevNos(getnum));
    }

    public static String RevNos(int num) {
        String numString = Integer.toString(num);
        String revnum = new String();
        for (int i = 1; i <= numString.length(); i++) {
            int ones = num % (10 * i);
            int residue = num / (10 * i);
            revnum = revnum + Integer.toString(ones);
        }
        return revnum;
    }
}
