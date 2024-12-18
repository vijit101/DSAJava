public class checknum {
    public static void main(String[] args) {
        int[] ary = { 8, 4, 5, 6, 7 };
        System.out.println(checkNumber(ary, 6, ary.length));
    }

    public static boolean checkNumber(int input[], int x, int indx) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        --indx;
        if (indx == 0) {
            return false;
        }

        if (input[indx] == x) {
            return true;
        }

        boolean isnumpresent = checkNumber(input, x, indx);
        return isnumpresent;
    }
}
