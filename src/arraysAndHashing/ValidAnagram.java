package arraysAndHashing;


import java.util.HashMap;

//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
// https://neetcode.io/problems/is-anagram

public class ValidAnagram {
   public static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;

       HashMap<Character, Integer> sCount = new HashMap<>();
       HashMap<Character, Integer> tCount = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
           sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
           tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
       }
       return sCount.equals(tCount);
   }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("bbcc", "cbcc"));
    }
}
