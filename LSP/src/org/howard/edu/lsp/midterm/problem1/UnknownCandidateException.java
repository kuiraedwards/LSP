package org.howard.edu.lsp.midterm.problem1;

public class UnknownCandidateException extends Exception {
	public UnknownCandidateException() {
		super("This candidate is not on the ballot!");
	}
}
