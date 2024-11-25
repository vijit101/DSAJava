package Recursion;

public class pallinrecur {
    public static void main(String[] args) {
        String str1 = "ashhsa";
        System.out.println(isPalindrome(str1, 0, str1.length()));
    }

    public static boolean isPalindrome(String str, int frontIndx, int len) {
        // Write your code here.
        --len;
        if (len == 0 || frontIndx == len) {
            return true;
        }

        if (str.charAt(frontIndx) != str.charAt(len)) {
            return false;
        }

        boolean ispal = isPalindrome(str, ++frontIndx, len);
        return ispal;
    }
}
