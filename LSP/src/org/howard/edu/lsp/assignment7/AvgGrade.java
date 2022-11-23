/**
 * 
 */
package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * @author Kuira Jhanai Edwards @02942519
 *
 */
public class AvgGrade implements AverageStrategy {

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() < 1) throw new EmptyListException();
		int sum = 0;
		
		for(int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		
		int avg = sum / grades.size();
		return avg;
	}

}
