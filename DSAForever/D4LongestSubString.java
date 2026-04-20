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


    public int characterReplacement(String s, int k) {
    int[] freq = new int[26];
    int left = 0;
    int maxFreq = 0;
    int ans = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        freq[c - 'A']++;

        maxFreq = Math.max(maxFreq, freq[c - 'A']);

        while ((right - left + 1) - maxFreq > k) {
            freq[s.charAt(left) - 'A']--;
            left++;
        }

        ans = Math.max(ans, right - left + 1);
    }

    return ans;
}
}
