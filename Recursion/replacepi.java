
public class replacepi {
    public static void main(String[] args) {
        String ppn = "popininpinpinpoppin";
        System.out.println(replacePi(ppn));
    }

    public static String replacePi(String s) {
        // Write your code here
        if (s.length() <= 1) {
            return s;
        }

        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            return "3.14" + replacePi(s.substring(2));

        } else {
            return s.charAt(0) + replacePi(s.substring(1));
        }
    }
}
