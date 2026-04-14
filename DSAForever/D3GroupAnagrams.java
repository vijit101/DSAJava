package DSAForever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class D3GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams2(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        char[] sortedWord;
        for (int i = 0; i < strs.length; i++) {
            sortedWord = strs[i].toCharArray();
            Arrays.sort(sortedWord);
            String fullSortedWord = new String(sortedWord);
            if (map.containsKey(fullSortedWord)) {
                map.get(fullSortedWord).add(strs[i]);

            } else {
                List<String> vals = new ArrayList<>();
                vals.add(strs[i]);
                map.put(fullSortedWord, vals);
            }

        }
        List<List<String>> Answer = new ArrayList<>();

        for (String k : map.keySet()) {
            System.out.print(map.get(k));
            Answer.add(map.get(k));
        }

        return Answer;
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append(count).append('#');
            }
            String key = keyBuilder.toString();

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(key, newList);
            }

        }
        return new ArrayList<>(map.values());

    }

}
