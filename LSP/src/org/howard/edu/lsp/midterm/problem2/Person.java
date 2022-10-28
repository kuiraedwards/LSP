package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

		public Person(String name,  String socialSecurityNumber, int age) {
			this.setName(name);
			this.setSSN(socialSecurityNumber);
			this.setAge(age);
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSSN(String ssn) {
			this.socialSecurityNumber = ssn;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			String info = name + ", " + socialSecurityNumber + ", " + age;
			return info;
		}
		public boolean equals(Person p1, Person p2) {
			String ssn1 = p1.socialSecurityNumber;
			String ssn2 = p2.socialSecurityNumber;
			if (ssn1.equals(ssn2)) {
				System.out.println("This is the same person!");	// in this case, they would be the same
				return true;
			} else {
			    System.out.println("This is not the same person.");
			}
			return false;
		}
}
