package roman.to.integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
	}
	public int romanToInt(String s) {
		char[] input = s.toCharArray();
        Map<Character, Integer> rule = new HashMap<Character, Integer>();
        rule.put('I',1);
        rule.put('V',5);
        rule.put('X',10);
        rule.put('L',50);
        rule.put('C',100);
        rule.put('D',500);
        rule.put('M',1000);
        int result = 0;
        for(int i = 0; i < input.length; i++){
            int val = rule.get(input[i]);
            if(i==input.length-1 || (i < input.length-1 && rule.get(input[i+1])<=val)){
                result += val;
            }
            else{
                result -= val;
            }
        }
        return result;
	}
}
