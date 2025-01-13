public class BinSearchRecurv {
    public static void main(String[] args) {
        int[] ary = { 10, 20, 50, 60, 100 };
        System.out.println(binSearchRec(ary, 0, ary.length, 100));
    }

    public static int binSearchRec(int[] inpt, int si, int ei, int key) {
        int mid = (si + ei) / 2;
        if (si > ei) {
            return -1;
        }

        if (inpt[mid] == key) {
            return mid;
        }

        if (key > inpt[mid]) {
            si = mid + 1;
            return binSearchRec(inpt, si, ei, key);
        } else {
            ei = mid - 1;
            return binSearchRec(inpt, si, ei, key);
        }
    }
}
