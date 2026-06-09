package DSAForever;

public class D5LongestRepeatingCharReplacement {

    public static void main(String[] args) {

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

    public int characterReplacementBrute(String s, int k) {

        int ans = 0;

        for (int start = 0; start < s.length(); start++) {

            int[] freq = new int[26];
            int maxFreq = 0;

            for (int end = start; end < s.length(); end++) {

                char ch = s.charAt(end);

                freq[ch - 'A']++;

                maxFreq = Math.max(maxFreq, freq[ch - 'A']);

                int windowLength = end - start + 1;

                int changesNeeded = windowLength - maxFreq;

                if (changesNeeded <= k) {
                    ans = Math.max(ans, windowLength);
                }
            }
        }

        return ans;
    }
}
