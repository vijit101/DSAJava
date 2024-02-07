import java.util.Scanner;

public class LinearSrch {
    public static void main(String[] args) {
        int[] Arraylinear = new int[10];
        for (int i = 0; i <= 9; i++) {
            Arraylinear[i] = i + 10;
        }
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = LinearSearch(key, Arraylinear);
        if (index == Integer.MIN_VALUE) {
            System.out.println("Item not found");
        } else {
            System.out.println("Key found at index " + index);
        }

    }

    public static int LinearSearch(int key, int[] Array) {
        int index = Integer.MIN_VALUE;
        for (int j = 0; j < Array.length; j++) {
            if (key == Array[j]) {
                index = j;
                break;
            }
        }
        return index;
    }
}
