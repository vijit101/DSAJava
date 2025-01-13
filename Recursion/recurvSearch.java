public class recurvSearch {
    public static void main(String[] args) {
        int[] ary = { 9, 8, 10, 8, 8 };

    }

    public static int[] allIndexes(int input[], int x) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (input.length == 0) {
            int[] indxer = {0};
            return indxer;
        }

        if (input[0] == x) {
            return ;
        }
        int[] indxs[i] = allIndexes(input, x);
    }
}
