package n.queens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		List<String[]> sol = s.solveNQueens(4);
		System.out.println("[");
		for (String[] so : sol) {
			System.out.print("[");
			for (int i = 0; i < so.length; i++) {
				System.out.println(so[i] + ",");
			}
			System.out.println("],");
		}
		System.out.println("]");
	}

	public List<String[]> solveNQueens(int n) {
		ArrayList<ArrayList<Integer>> queens = new ArrayList<ArrayList<Integer>>();
		initializeQueens(queens, n);
		ArrayList<Integer> q1 = queens.get(0);
		List<String[]> sol = new ArrayList<String[]>();
		
		String[] temp = new String[n];
		while (!q1.isEmpty()) {
			reset(queens,n);
			int queen1 = q1.get(0);
			filter(0, n, queen1, queens);
			boolean isValid = check(1, queens);
			if (isValid) {
				for (int i = 1; i < n; i++) {
					filter(i, n, queens.get(i).get(0), queens);
					isValid = check(i + 1, queens);
					if (!isValid) {
						break;
					}
				}
			}
			if (isValid) {
				ArrayList<Integer> val = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					val.add(queens.get(i).get(0));
				}
				temp = parseSol(val);
				sol.add(temp);
			}
			q1.remove(0);
		}
		return sol;
	}

	public void filter(int start, int n, int value, ArrayList<ArrayList<Integer>> queens) {
		for (int i = start + 1; i < queens.size(); i++) {
			int index = 0;
			ArrayList<Integer> current = queens.get(i);
			if (current.contains(value)) {
				index = current.indexOf(value);
				current.remove(index);
			}
			if (current.contains(value - i + start)) {
				index = current.indexOf(value - i + start);
				current.remove(index);
			}
			if (current.contains(value + i - start)) {
				index = current.indexOf(value + i - start);
				current.remove(index);
			}
		}
	}

	public boolean check(int start, ArrayList<ArrayList<Integer>> queens) {
		if (start >= queens.size()) {
			return true;
		} else {
			for (int i = start; i < queens.size(); i++) {
				if (queens.get(i).isEmpty()) {
					return false;
				}
			}
		}
		return true;
	}

	public void reset(ArrayList<ArrayList<Integer>> queens, int n){
		for(int k = n-1; k > 0; k--){
			queens.remove(k);
		}
		for (int j = 1; j < n; j++) {
			ArrayList<Integer> q = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				q.add(i);
			}
			queens.add(q);
		}
	}
	
	public String[] parseSol(ArrayList<Integer> s) {
		String[] result = new String[s.size()];
		for (int i = 0; i < s.size(); i++) {
			char[] temp = new char[s.size()];
			Arrays.fill(temp, '.');
			temp[s.get(i)] = 'Q';
			result[i] = String.valueOf(temp);
		}
		return result;
	}

	public void initializeQueens(ArrayList<ArrayList<Integer>> queens, int n) {
		for (int j = 0; j < n; j++) {
			ArrayList<Integer> q = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				q.add(i);
			}
			queens.add(q);
		}
	}
}
