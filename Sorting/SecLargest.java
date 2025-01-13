public class SecLargest {
    public static void main(String[] args) {
        int[] numbers = { 4, 3, 10, 9, 2 };
        int indx = secondLargestElement(numbers, numbers.length);
        System.out.println(indx);

    }

    public static int secondLargestElement(int[] arr, int n) {
        // Your code goes here
        int max = arr[0];
        int prev = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (prev < arr[i + 1] && max != arr[i + 1]) {
                prev = arr[i + 1];
            }
        }

        return prev;

    }

}
