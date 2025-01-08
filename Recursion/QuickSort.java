public class QuickSort {
    public static void main(String[] args) {
        int[] arx = { 100, 200, 1, 10, 2, 4, 5, 1000, 600 };
        QS(arx, 0, arx.length);
        int i = 0;
        while (i < arx.length) {
            System.out.println(arx[i]);
            i++;
        }
    }

    public static void QS(int[] ary, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int newIndx = Parition(ary, si, ei);
        QS(ary, si, newIndx - 1);
        QS(ary, newIndx + 1, ei);

    }

    public static int Parition(int[] arr, int si, int ei) {
        int moveby = 0;
        int PivotElement = arr[si];
        int orgSi = si;
        while (si < ei - 1) {
            if (arr[si + 1] < PivotElement) {
                moveby++;
            }
            si++;
        }

        if (moveby != 0) {
            arr[orgSi] = arr[orgSi + moveby];
            arr[orgSi + moveby] = PivotElement;
        }
        // sorting elements smaller to pivot elem to left and bigger to right
        si = orgSi;
        int endIndx = ei - 1;
        while (si < endIndx) {
            if (arr[si] < PivotElement) {
                si++;
            } else if (arr[endIndx] >= PivotElement) {
                endIndx--;
            } else {
                int temp = arr[si];
                arr[si] = arr[endIndx];
                arr[endIndx] = temp;
                si++;
                endIndx--;
            }

        }

        return orgSi + moveby;
    }

}
