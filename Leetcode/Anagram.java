package Leetcode;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.print(isAnagram("rat","car"));
    }

    public static boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }

        // Alpha betically sort both arrays 
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr, tarr);
    }


    static boolean areAnagrams(String s1, String s2) {
        int[] freq = new int[26];

        // Count frequency of each character in string s1
        for (int i = 0; i < s1.length(); i++)
            freq[s1.charAt(i) - 'a']++;

        // Count frequency of each character in string s2
        for (int i = 0; i < s2.length(); i++)
            freq[s2.charAt(i) - 'a']--;

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
