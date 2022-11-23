/**
 * 
 */
package org.howard.edu.lsp.assignment7;

/**
 * @author Kuira Jhanai Edwards @02942519
 *
 */
public class EmptyListException extends Exception {
	public EmptyListException() { //Thrown when list is empty
		super("This list is empty!");
	}

}
