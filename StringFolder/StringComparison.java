package StringFolder;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mystr = sc.nextLine(); // Add string as EWNS directions
        StringBuilder sb = new StringBuilder("");
        int compressVal = 1;
        char currentElement = mystr.charAt(0);
        for (int i = 1; i < mystr.length(); i++) {
            if (mystr.charAt(i) == currentElement) {
                compressVal++;
                if (i == mystr.length() - 1) {
                    sb.append(currentElement);
                    if (compressVal > 1) {
                        sb.append(Integer.toString(compressVal));
                    }
                }

            } else {
                sb.append(currentElement);
                if (compressVal > 1) {
                    sb.append(Integer.toString(compressVal));
                }
                currentElement = mystr.charAt(i);
                compressVal = 1;
            }
        }

        System.out.println(sb);

    }
}
