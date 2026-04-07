package DSAForever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D3GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> Answer = new ArrayList<>();
        List<String> vals = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        char[] sortedWord;
        for (int i = 0; i < strs.length; i++) {
            sortedWord = strs[i].toCharArray();
            Arrays.sort(sortedWord);
            if (map.containsKey(sortedWord)) {
                vals.add(strs[i]);
                map.put(sortedWord.toString(), vals);

            } else {
                vals.add(strs[i]);
                map.put(sortedWord.toString(), vals);
            }

        }

        for (map.Entry<String, List<String> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
            Answer.add(e.getValue());
        }

        return Answer;
    }
}
