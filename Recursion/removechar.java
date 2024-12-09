package Recursion;

public class removechar {
    public static void main(String[] args) {
        String str = "xyxzjxxyzx";
        System.out.println(removeX(str));
    }

    public static String removeX(String input) {
        // Write your code here
        if (input.length() == 0) {
            return input;
        }

        String smallinput = removeX(input.substring(1));
        if (input.charAt(0) == 'x') {
            return "" + smallinput;
        } else {
            return input.charAt(0) + smallinput;
        }
    }
}
