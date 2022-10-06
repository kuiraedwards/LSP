package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    set1.add(6);
	    set1.add(7);
	    
	    System.out.println("Value of Set1 is: " + set1.toString() + " with length ");
	    System.out.print(set1.length());
	    System.out.println("Smallest value in Set1 is: " + set1.smallest());
	    System.out.println("Largest value in Set1 is: " + set1.largest());
	    System.out.println("Is 3 in Set1? " + set1.contains(3));
	      
	    IntegerSet set2 = new IntegerSet();
	    set2.add(4);
	    set2.add(5);
	    set2.add(7);
	    set2.add(8);
	    set2.add(9);
	    set2.add(10);
	    set2.add(11);
	     
	    System.out.println("Value of Set2 is: " + set2.toString() + " with length ");
	    System.out.print(set2.length());
	    System.out.println("Is 3 in Set2? " + set2.contains(3));
	    System.out.println("Union of Set1 and Set2: ");
	    set1.union(set2);	// union of set1 and set2
	    System.out.println("Result of union of Set1 and Set2");
	    set1.toString();
	    
	    set1.clear();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    set1.add(6);
	    set1.add(7);
	    
	    set1.diff(set2);
	    System.out.println("The set difference of Set1 and Set2 is: ");
	    
	    set1.clear();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    set1.add(6);
	    set1.add(7);
	    
	    set1.intersection(set2);
	    System.out.println("Intersection of Set1 and Set2: ");
	    
	    set1.remove(1);
	    set1.remove(2);
	    set1.remove(3);
	    set1.remove(6);
	    set1.add(4);
	    set2.remove(8);
	    set2.remove(9);
	    set2.remove(10);
	    set2.remove(11);
	    
	    System.out.println("Value of Set1 is: " + set1.toString());
	    System.out.println("Value of Set2 is: " + set2.toString());
	    System.out.println("Are Set1 and Set2 equal? ");
	    System.out.println(set1.equals(set2));
	    set2.clear();
	    System.out.println("Is Set2 empty? ");
	    System.out.println(set2.isEmpty());
	    
	    System.out.println("Value of Set2 is: " + set2.toString() + " with length ");
	    System.out.println(set2.length());
}
}
