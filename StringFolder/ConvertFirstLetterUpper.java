package StringFolder;

import java.util.Scanner;

public class ConvertFirstLetterUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mystr = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(mystr.charAt(0)));
        // StringBuilder sb = new StringBuilder();
        for (int i = 1; i < mystr.length(); i++) {
            if (mystr.charAt(i) == ' ' && i < mystr.length() - 1) {
                sb.append(" ");
                sb.append(Character.toUpperCase(mystr.charAt(i + 1)));
                i++;
            } else {
                sb.append(mystr.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
