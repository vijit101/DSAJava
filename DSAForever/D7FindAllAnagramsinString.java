package DSAForever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D7FindAllAnagramsinString {

    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> Answer = new ArrayList<>();
        int end = 0;
        int[] freq = new int[26];
        int[] prevFreq = new int[26];
        int j;
        for (int i = 0; i < s.length(); i++) {
            end = (i + p.length()) - 1;
            j = i;
            while (j <= end) {
                freq[s.charAt(j) - 'a']++; // score board used in bulls and cows 
                prevFreq[s.charAt(j) - 'a']++;
                freq[p.charAt(j - i) - 'a']--;// always runs from 0 -> p.length 
                j++;
            }

            for (Integer elem : freq) {
                if (elem == 0) {
                    Answer.add(i);
                } else {
                    freq = new int[26];
                    prevFreq[s.charAt(i) - 'a']--;
                    freq = prevFreq; // problem of deep and shallow copy 
                    j = end;
                    break;
                }
            }
        }
        return Answer;
    }

    public List<Integer> findAnagramsOptimized(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] patternFreq = new int[26];
        int[] windowFreq = new int[26];

        // Build pattern frequency
        for (char c : p.toCharArray()) {
            patternFreq[c - 'a']++;
        }

        // Build FIRST window
        for (int i = 0; i < p.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(patternFreq, windowFreq)) {
            ans.add(0);
        }

        // Slide the window
        for (int right = p.length(); right < s.length(); right++) {

            int left = right - p.length();

            // remove left
            windowFreq[s.charAt(left) - 'a']--;

            // add right
            windowFreq[s.charAt(right) - 'a']++;

            if (Arrays.equals(patternFreq, windowFreq)) {
                ans.add(left + 1);
            }
        }

        return ans;
    }
}
