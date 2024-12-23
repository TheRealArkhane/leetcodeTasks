package twoPointers;

/*
Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward.
It is also case-insensitive and ignores all non-alphanumeric characters.

Example 1:
Input: s = "Was it a car or a cat I saw?"
Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:
Input: s = "tab a cat"
Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:
1 <= s.length <= 1000
s is made up of only printable ASCII characters.
*/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }

    public static boolean isPalindrome(String s) {
        String preparedString = s.toLowerCase().replace(" ", "").replaceAll("\\pP", "");
        int left = 0;
        int right = preparedString.length() - 1;
        while (left < right) {
            if (preparedString.charAt(left) != preparedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
