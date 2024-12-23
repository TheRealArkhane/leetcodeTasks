package arraysAndHashing;

// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
// https://neetcode.io/problems/anagram-groups

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] wordCharArray = word.toLowerCase().toCharArray();
            Arrays.sort(wordCharArray);
            if (map.containsKey(String.valueOf(wordCharArray))) {
                map.get(String.valueOf(wordCharArray)).add(word);
            } else {
                map.put(String.valueOf(wordCharArray), new ArrayList<>());
                map.get(String.valueOf(wordCharArray)).add(word);
            }
        }
        return new ArrayList<>(map.values());
    }
}
