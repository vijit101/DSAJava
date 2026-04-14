package DSAForever;

import java.util.HashSet;

public class D4LongestSubString {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring1(String s) {
        int ans = 0;
        HashSet<Character> mySet = new HashSet<>();
        int start = 0;
        int i = start;
        int len = s.length();
        char[] chararry = s.toCharArray();

        while ((start < len) && (i < len)) {
            if (mySet.contains(chararry[i])) {
                if (ans < (i + 1) - start) {
                    ans = i + 1;
                }
                start++;
                i = start;
                mySet = new HashSet<>();
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(i));
            ans = Math.max(ans, i - start + 1);
        }

        return ans;
    }
}
