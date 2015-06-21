import java.util.Stack;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloJava {
	public static int take = 0;

	public static void main(String[] args) {
//		System.out.println(take);
//		int take = 2;
//		System.out.println(take);
//		String test = "hello java";
//		String test2 = test.trim();
//		System.out.println(test2);
//
//		Stack stk = new Stack();
//		stk.push(1);
//		stk.push("2");
//		System.out.println(stk.peek());
		
		HelloJava hj = new HelloJava();
		char[] input = { '8', '9', '9' };
		input = hj.incChar(input);
		for(int i = 0; i < input.length; i++){
			System.out.println(input[i] + ", ");
		}

	}

	public char[] incChar(char[] input) {
		int n = input.length;
		int old = 0;
		for (int i = 0; i < n ; i++) {
			old += Math.pow(10, n-1-i) * Integer.parseInt(String.valueOf(input[i]));
		}
		int newInt = old + 1;
		input = String.valueOf(newInt).toCharArray();
		return input;
	}

	@Test
	public void incCharTest() {
		HelloJava hj = new HelloJava();
		char[] input = { '8', '9', '9' };
		input = hj.incChar(input);
		assertArrayEquals(input, new char[]{'9','0','0'});
	}

}