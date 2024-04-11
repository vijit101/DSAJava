package StringFolder;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mystr = sc.next();
        boolean pallin = checkPallindrome(mystr);
        System.out.println(pallin);

    }

    public static boolean checkPallindrome(String getStr) {

        int j = getStr.length() - 1;
        for (int i = 0; i < (getStr.length() / 2) + 1; i++) {
            if (getStr.charAt(i) != getStr.charAt(j) && i <= j) {
                return false;
            }
            j--;
        }
        return true;
    }
}
