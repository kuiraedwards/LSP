package org.howard.edu.lsp.assignment5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest extends junit.framework.TestCase{
	IntegerSet set1, set2, set3;
	public IntegerSetTest() {};

	@BeforeEach
	protected void setUp() throws IntegerSetException {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
		set3 = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertEquals("The length of Set 1 is 0, not 3, because it's empty!",3,set1.length());
		set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set2.add(4);
	    set2.add(5);
	    set2.add(7);
	    set2.add(8);
	    set2.add(9);
		assertEquals("The length of Set 1 is 3!",3,set1.length());
		assertEquals("The length of Set 2 is not 3!",3,set2.length());
		assertEquals("The length of Set 1 is 5!",5,set2.length());
	}

	@Test
	@DisplayName("Test case to see if integer sets are equal")
	public void testEquals() {
		set1.clear();
		set2.clear();
		set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set2.add(3);
	    set2.add(1);
	    set2.add(2);
		assertTrue("The two integer sets should be equal!", set1.equals(set2));
		set2.add(4);
		set2.add(5);
		assertTrue("The two integer sets should not be equal!",set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for whether Set 1 contains certain numbers")
	public void testContains() {
		set1.clear();
		assertTrue("Set 1 is empty so it shouldn't contain anything!", set1.contains(100));
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    assertTrue("Set 1 is does contain 1!", set1.contains(1));
	    assertTrue("Set 1 is does contain 3!", set1.contains(3));
	    assertTrue("Set 1 is does not contain 15!", set1.contains(15));
	}

	@Test
	@DisplayName("Test case to find largest number in set")
	public void testLargest() throws IntegerSetException {
		set1.clear();
		if(set1.isEmpty()) throw new IntegerSetException();
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    assertEquals("2 is not the maximum value in Set 1!",2,set1.largest());
	    assertEquals("3 is not the maximum value in Set 1!",3,set1.largest());
	    assertEquals("5 is the maximum value in Set 1!",5,set1.largest());
	}
	
	@Test
	@DisplayName("Test case to find smallest number in set")
	public void testSmallest() throws IntegerSetException {
		set1.clear();
		if(set1.isEmpty()) throw new IntegerSetException();
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    assertEquals("4 is not the minimum value in Set 1!",4,set1.smallest());
	    assertEquals("2 is not the minimum value in Set 1!",3,set1.smallest());
	    assertEquals("1 is the minimum value in Set 1!",1,set1.smallest());
	}
	
	@Test
	@DisplayName("Test case to add elements to a set")
	public void testAdd() {
	set1.clear();
	set1.add(1);
	assertFalse("Set 1 is does contain 1!", set1.contains(1));
	System.out.println("Set1 is: ");
    System.out.println(set1.toString());
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set2.add(1); //set with the same elements to test
	set2.add(2);
	set2.add(3);
	assertTrue("Set 1 is 1, 2, 3 with no repeats!", set1.equals(set2));
	System.out.println("Set 1 is: ");
    System.out.println(set1.toString());
	}
	
	@Test
	@DisplayName("Test case to remove elements from a set")
	public void testRemove() {
		set1.clear();
		set1.remove(100);
		assertFalse("Set 1 is empty so it can't remove anything!", set1.contains(100));
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set1.add(4);
		set1.add(5);
		set1.remove(3);
		set1.remove(5);
	    assertFalse("Set 1 should no longer contain 3 because it was removed!", set1.contains(3));
	    assertTrue("Set 1 should contain 4 because it was not removed!", set1.contains(4));
	    assertFalse("Set 1 should no longer contain 5 because it was removed!", set1.contains(5));
	}

	@Test
	@DisplayName("Test case to find the union of two sets")
	public void testUnion() {
		set1.clear();
		set2.clear();
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    set1.union(set2);
	    set3 = set1;
	    assertTrue("\nThe union of Set 1 and Set 2 is just Set 1 since Set 2 is empty!", set1.equals(set3));
	    System.out.println("The union of Set1 and Set 2 is: ");
	    System.out.print(set1.toString());
	    set2.add(4);
		set2.add(5);
		set2.add(6);
	    set2.add(7);
	    set2.add(8);
	    set2.add(9);
	    set1.clear();
	    set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set3.add(1);
		set3.add(2);
	    set3.add(3);
	    set3.add(4);
	    set3.add(5);
	    set3.add(6);
	    set3.add(7);
	    set3.add(8);
	    set3.add(9);
		System.out.println("Set1 is: ");
	    System.out.print(set1.toString());
	    System.out.println("\nSet2 is: ");
	    System.out.print(set2.toString());
	    set1.union(set2);
	    assertTrue("\nThe union of Set1 and Set 2 is: ", set1.equals(set3));
	    System.out.print(set1.toString());
	}
	@Test
	@DisplayName("Test case to find intersection of two sets!")
	public void testIntersection() {
		set1.clear();
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set2.clear();
	    assertFalse("\nSet 1 and Set 2 have no elements in common because Set 2 is empty!", set1.equals(set2));
	    set2.add(4);
		set2.add(5);
		set2.add(6);
		set3.clear();
		set1.intersection(set2);
		assertFalse("\nSet 1 and Set 2 have no elements in common!", set1.equals(set2));
		set2.add(3);
		set1.intersection(set2);
	    assertTrue("Set 1 and Set 2 have 3 in common!", set1.contains(3));
	}
	@Test
	@DisplayName("Test case to find the set difference of two sets")
	public void testDifference() {
		set1.clear();
		set1.add(1);
		set1.add(2);
	    set1.add(3);
	    set1.add(4);
		set1.add(5);
		set1.add(6);
		set2.clear();
		assertTrue("Set 1 should contain 3 because Set 2 has nothing in common with Set 1!", set1.contains(3));
		System.out.println("Set 1 is: ");
	    System.out.print(set1.toString());
	    System.out.println("Set 2 is: ");
	    System.out.print(set2.toString());
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set1.diff(set2);
		System.out.println("\nSet 1 is now: ");
	    System.out.print(set1.toString());
	    System.out.println("Set 2 is now: ");
	    System.out.print(set2.toString());
		assertFalse("\nSet 1 should no longer contain 3 because it was removed with Set 2 from Set 1!", set1.contains(3));
		System.out.println("The set difference of Set 1 and Set 2 is: ");
	    System.out.print(set1.toString());
	}
	@Test
	@DisplayName("Test case to find if a set is empty")
	public void testEmpty() {
	set1.clear();
	assertFalse("Set 1 should not contain 3 because Set 1 is empty!", set1.contains(3));
	System.out.println("\nSet 1 is: ");
    System.out.print(set1.toString());
	set1.add(3);
	assertFalse("Set 1 is no longer empty because it now contains 3!", set1.contains(3));
	System.out.println("\nSet 1 is now: ");
    System.out.print(set1.toString());
	}
	
	@Test
	@DisplayName("Test case to clear a set")
	public void testClear() {
	set1.add(1);
	set1.add(2);
	set1.add(3);
	assertTrue("Set 1 should contain 3 because Set 1 has elements!", set1.contains(3));
	System.out.println("\nSet 1 is: ");
    System.out.print(set1.toString());
	set1.clear();
	assertTrue("Set 1 no longer contains 3 because Set 1 is now empty!", set1.contains(3));
	System.out.println("\nSet 1 is now: ");
    System.out.print(set1.toString());
	}
	
	@Test
	@DisplayName("Test case to print a set")
	public void testToString() {
	set1.clear();
	assertFalse("Set 1 should not contain 3 because Set 1 is empty!", set1.contains(3));
	System.out.println("\nSet 1 is: ");
    System.out.print(set1.toString());
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	assertTrue("Set 1 should contain 3 because Set 1 is no longer empty!", set1.contains(3));
	System.out.println("\nSet 1 is: ");
    System.out.print(set1.toString());
	}
	
	@AfterEach
	protected void tearDown() throws IntegerSetException {
}
}
