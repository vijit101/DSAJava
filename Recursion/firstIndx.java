package Recursion;

public class firstIndx {
    public static void main(String[] args) {
        int[] Myary = { 1, 3, 6, 11, 12, 17 };
        // int[] ary2 = { 2, 8, 12, 16, 19 };
        System.out.println(firstIndex(Myary, 11, 0));
    }

    public static int firstIndex(int input[], int x, int indx) {

        if (input[indx] == x) {
            return indx;
        }
        if (indx == input.length - 1) {
            return -1;
        }
        int indxfound = firstIndex(input, x, indx + 1);
        return indxfound;

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

    }

    public static int lastIndex(int input[], int x, int arraySize) {
        --arraySize;
        if (input[arraySize] == x) {
            return arraySize;
        }
        if (arraySize == input.length - 1) {
            return -1;
        }
        int indxfound = lastIndex(input, x, arraySize);
        return indxfound;

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

    }
}
