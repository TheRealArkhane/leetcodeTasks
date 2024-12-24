package stack;

import java.util.Stack;

/*
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:
Input: s = "[]"
Output: true

Example 2:
Input: s = "([{}])"
Output: true

Example 3:
Input: s = "[(])"
Output: false
Explanation: The brackets are not closed in the correct order.

 */

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> closeToOpen = new java.util.HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        for (char character : s.toCharArray()) {
            if (closeToOpen.containsKey(character)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(character)) {
                    stack.pop();
                }
                else return false;
            }
            else stack.push(character);
        }
        return stack.isEmpty();
    }
}
