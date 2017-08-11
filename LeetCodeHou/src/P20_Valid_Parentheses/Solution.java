package P20_Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 */

public class Solution {
//	public boolean isValid(String s) {
//		if (s.length() == 0) return true;
//		if (s.length() == 1) return false;
//		Map<Character, Character> map = new HashMap<>();
//		map.put('(', ')');
//		map.put('[', ']');
//		map.put('{', '}');
//		Stack<Character> stack = new Stack<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			if (stack.isEmpty()) {
//				if (map.containsValue(s.charAt(i))) {
//					return false;
//				} else {
//					stack.push(s.charAt(i));
//				}
//			} else {
//				if (map.get(stack.peek()).equals(s.charAt(i))) {
//					stack.pop();
//				} else {
//					if (map.containsValue(s.charAt(i))) {
//						return false;
//					} else {
//						stack.push(s.charAt(i));
//					}
//				}
//			}
//		}
//		if (stack.isEmpty()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public boolean isValid(String s) {
		if (s.length() == 0) return true;
		if (s.length() == 1) return false;
		Stack<Character> stack = new Stack<Character>();
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || !stack.pop().equals(c)) {
				return false;
			} 
		}
		return stack.isEmpty();
	}

}
