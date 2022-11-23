/**
 * 
 */
package org.howard.edu.lsp.assignment7;

import java.util.*;

/**
 * @author Kuira Jhanai Edwards @02942519
 *
 */
public class CurvedGrade implements AverageStrategy {

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() < 3) throw new EmptyListException();
		
		int sum = 0;
		Collections.sort(grades);
		
		for(int i = 2; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		
		int avg = sum / (grades.size() - 2);
		return avg;
	}

}