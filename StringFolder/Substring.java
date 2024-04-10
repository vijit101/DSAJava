package StringFolder;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mystr = sc.next(); // Add string as EWNS directions
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(mystr.charAt(i));

        }
    }
}
