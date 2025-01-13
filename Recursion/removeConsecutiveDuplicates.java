public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "aabccbaaaaa";
        System.out.println(removeConsecutiveDuplicate(s));
    }

    public static String removeConsecutiveDuplicate(String s) {
        // Write your code here
        if (s.length() <= 1) {
            return s;
        }
        String smalloutput = removeConsecutiveDuplicate(s.substring(1));
        if (s.charAt(0) == smalloutput.charAt(0)) {

            return smalloutput;

        } else {
            return s.charAt(0) + smalloutput;
        }
    }
}
