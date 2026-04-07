package ArraysCode;

public class subarraysumeqlk {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int ans = subarraySum(nums, 2);
        System.out.println(ans);

    }

    public static int subarraySum(int[] nums, int k) {
        int answer = 0;
        int fullsum = 0;
        boolean isKpresentInArr = false;
        if (nums[0] == k) {
            answer++;
            isKpresentInArr = true;
        }
        for (int i = 0; i < nums.length; i++) {
            fullsum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[j] == k) && (isKpresentInArr == false)) {
                    answer++;
                    isKpresentInArr = true;
                }
                fullsum += nums[j];
                if (fullsum == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
