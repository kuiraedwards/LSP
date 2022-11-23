/**
 * 
 */
package org.howard.edu.lsp.assignment7;

import java.util.*;

/**
 * @author Kuira Jhanai Edwards @02942519
 *
 */
public interface AverageStrategy {
	public int compute(List<Integer> grades) throws EmptyListException;
	//public void AvgGrade(); //calculates the average grade
	//public void CurvedGrade(); //calculates the average grade with two dropped scores

}

