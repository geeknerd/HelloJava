package regular.expression.matching;

import java.util.*;

/**
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 * 
 * @author Yi Xia
 *
 */
public class Solution {

	public static void main(String[] args) {

	}

	public boolean isMatch(String s, String p) {
		Stack<Character> s_stack = new Stack<Character>();
		Stack<Character> p_stack = new Stack<Character>();
		boolean match = true;
		for(int i = s.length()-1; i >=0; i--){
			s_stack.push(s.charAt(i));
		}
		for(int i = p.length()-1; i >=0; i--){
			p_stack.push(s.charAt(i));
		}
		while(!s_stack.isEmpty() && !p_stack.isEmpty()){
			char s_pop = s_stack.pop();
			char p_pop = p_stack.pop();
			if(p_pop=='*'){
				
			}
		}
		if(!s_stack.isEmpty() || !p_stack.isEmpty()){
			match = false;
		}
		return match;
	}

}
