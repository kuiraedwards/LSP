/**
 * 
 */
package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author kuiraedwards
 *
 */
class AvgGradeTest {
	public AvgGradeTest() {};
	AvgGrade grades = new AvgGrade();
	CurvedGrade curve = new CurvedGrade();
	List<Integer> test1 = new ArrayList<>();
	List<Integer> test2 = new ArrayList<>();
	List<Integer> test3 = new ArrayList<>();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUp() throws EmptyListException {
		test1.add(80);
		test1.add(66);
		test1.add(90);
		test1.add(88);
		test1.add(75);
		test2.add(100);
		test2.add(100);
		test2.add(95);
		test2.add(88);
		test2.add(0);
		test2.add(79);
		test3.add(75);
		test3.add(73);
	}

	@Test
	void test() throws EmptyListException {
		assertEquals(79, grades.compute(test1), "The average grade of the 5 scores is 79.");
		assertEquals(86, curve.compute(test1), "The average grade of the 3 scores is 86.");
		assertEquals(77, grades.compute(test2), "The average grade of the 6 scores is 77.");
		assertEquals(95, curve.compute(test2), "The average grade of the 4 scores is 96.");
		assertEquals(74, grades.compute(test3), "The average grade of the 2 scores is 74.");
		assertEquals(0, curve.compute(test3), "The average grade of the 0 scores is 0."); //The only test that should fail!
	}
	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	

}
