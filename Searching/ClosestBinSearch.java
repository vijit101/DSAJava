package Searching;

public class ClosestBinSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 10 };
        int index = binarySearchClosest(arr, 0, 0, 9);
        System.out.println(index);
    }

    public static int binarySearchClosest(int[] nums, int left, int right, int target) {
        int indx = -1;
        int start = 0;
        int end = nums.length;
        int midpt = nums.length / 2;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i <= (nums.length) / 2; i++) {
            if (target == nums[midpt]) {
                indx = midpt;
                return indx;
            } else if (target < nums[midpt]) {
                end = midpt;
                int dist = nums[midpt] - target;
                dist = Math.abs(dist);
                if (diff < dist) {
                    diff = dist;
                    indx = midpt;
                }
                midpt = (midpt + start) / 2;

            } else if (target > nums[midpt]) {
                start = midpt;
                int dist = target - nums[midpt];
                dist = Math.abs(dist);
                if (diff > dist) {
                    diff = dist;
                    indx = midpt;
                }
                midpt = (midpt + end) / 2;
            }
        }
        return indx;
    }
}
