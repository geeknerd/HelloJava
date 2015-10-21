package example.clone_and_copy.yixia;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{3,2,2,3};
		int[] cloneInput = input.clone();
		int[] copyInput = Arrays.copyOf(input, input.length);

		Integer[] in = new Integer[]{new Integer(3),new Integer(2),new Integer(2),new Integer(3)};
		Integer[] cloneIn = in.clone();
		Integer[] copyIn = Arrays.copyOf(in, in.length);
		
		for (Integer i : in) {
			System.out.println(i.intValue());
		}
		Arrays.sort(cloneIn);
		for (Integer i : in) {
			System.out.println(i.intValue());
		}
		for (Integer i : cloneIn) {
			System.out.println(i.intValue());
		}
	}

}
