package longest.substring.without.repeating.characters;

import java.util.ArrayList;

/**
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * 
 * @author Yi Xia
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
		System.out.println(test.lengthOfLongestSubstring(""));
	}

	public int lengthOfLongestSubstring(String s) {
		int length =0 ;
		int current = 0;
		if(s == null){
			return 0;
		}
		for (int i = 0; i < s.length()-1; i++){
			ArrayList<String> temp = new ArrayList<String>();
			current = 1;
			temp.add(String.valueOf(s.charAt(i)));
			for (int j = i + 1; j < s.length(); j++){
				if(!temp.contains(String.valueOf(s.charAt(j)))){
					temp.add(String.valueOf(s.charAt(j)));
					current++;
				}else{
					break;
				}
			}
			if(current > length){
				length = current;
			}
			if(length > s.length() - i){
				break;
			}
		}
		return length;
	}

}
