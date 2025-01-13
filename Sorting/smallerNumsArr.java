public class smallerNumsArr {
    public static void main(String[] args) {
        int[] Myary = { 10, 20, 30 };
        int[] ary2 = { 17, 15, 25, 100 };
        int[] arr = countS(0, 0, Myary, ary2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] countS(int n, int m, int[] a, int[] b) {
        // Write your code here.
        int[] itharr, jtharr;
        if (a.length > b.length) {
            itharr = a;
            jtharr = b;
        } else {
            itharr = b;
            jtharr = a;
        }
        int[] ans = new int[itharr.length];
        int count = 0;
        for (int i = 0; i < itharr.length; i++) {
            count = 0;
            for (int j = 0; j < jtharr.length; j++) {
                if (jtharr[j] < itharr[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

}
