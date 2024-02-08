package ArraysCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] Ary = { 1, 2, 5, 8, 20, 30, 45, 100, 111, 112, 125, 334 };
        int ky = 100;
        int index = binSearchOG(ky, Ary);
        if (index == -1) {
            System.out.println("not found ");
        } else {
            System.out.println("Element found at " + index);
        }
    }

    public static int binSearchJugaad(int key, int[] ary) {
        int start = 0;
        int end = ary.length;
        int midpt = (start + end) / 2;
        int index = -1;
        for (int i = 0; i < ary.length; i++) {
            if (ary[midpt] == key) {
                index = midpt;
                break;
            } else if (ary[midpt] > key) {
                midpt = midpt - (midpt / 2);
            } else {
                midpt = midpt + (midpt / 2);
            }
        }
        return 0;
    }

    public static int binSearchOG(int key, int[] ary) {
        int start = 0;
        int end = ary.length - 1;
        int index = -1;
        int midpt = (start + end) / 2;
        while (start <= end) {
            midpt = (start + end) / 2;
            int midpt_value = ary[midpt];
            if (ary[start] == key) {
                index = start;
                break;
            } else if (ary[end] == key) {
                index = end;
                break;
            } else if (midpt_value == key) {
                index = midpt;
                break;
            } else if (midpt_value > key) {
                end = midpt - 1;
            } else if (midpt_value < key) {
                start = midpt + 1;
            }
        }
        return index;
    }

}
