package org.howard.edu.lsp.assignment2;

public class Driver {

	public static void main() {
		Combinations comb = new Combinations();
		comb.compute(new int[] {5,5,15,10}, 15);
		comb.compute(new int[] {1,2,3,4,5,6}, 6);
		comb.compute(new int[] {3,1,5,9,7,6}, 157);
		}
	}
