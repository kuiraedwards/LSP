package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;

public class Combinations {
	
	public void compute(int[] input, int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		findCombos(input, 0, sum, new ArrayList<Integer>(), result);
		
		System.out.println(result);
		
	}
	public void findCombos(int[] input, int index, int sum, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
		if(sum == 0) {
			result.add(current);
			return;
		}
		if(sum < 0) {
			return;
		}
		for(int i = index; i < input.length; i++) {
			if(i == index || input[i] != input[i-1]) {
				current.add(input[i]);
				findCombos(input, i+1, sum - input[i], current, result);
				current.remove(current.size()-1);
			}
		}
	}

}