public class smalldiff {
    public static void main(String[] args) {
        int[] Myary = { 10, 20, 30 };
        int[] ary2 = { 17, 15 };
        System.out.println(smallestDifferencePair(Myary, 0, ary2, 0));

    }

    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        // Write your code here.
        int ans = Integer.MAX_VALUE;
        int diff;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                diff = Math.abs(arr1[i] - arr2[j]);
                if (diff < ans) {
                    ans = diff;
                }

            }
        }
        return ans;
    }
}
