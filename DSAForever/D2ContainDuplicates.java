package DSAForever;

import java.util.HashSet;

public class D2ContainDuplicates {

    public static void main(String[] args) {

    }

    public boolean containsDuplicaten2(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;

        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (map.contains(nums[i])) {
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
}
