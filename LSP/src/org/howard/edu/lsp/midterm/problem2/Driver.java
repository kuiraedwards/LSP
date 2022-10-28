package org.howard.edu.lsp.midterm.problem2;

import org.howard.edu.lsp.midterm.problem2.Person;

public class Driver {
	public static void main(String[] args) {
		String name = "Glen Learner";
		String SSN = "123-45-6789";
		Person guy = new Person(name, SSN, 45);
		
		System.out.println(guy);
}
}
