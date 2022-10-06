package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.Comparator;

public class IntegerSet {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	// Default Constructor
	  public IntegerSet() {}
	// Clears the internal representation of the set
	  public void clear() {
	    if (set.isEmpty() == false) {
	    set.removeAll(set);
	  }
	}
	// Returns the length of the set
	  public int length(){
	    return set.size();
	  }
	//Returns true if the 2 sets are equal, false otherwise;
	  public boolean equals(IntegerSet b) {
	    for(int i = 0; i < b.set.size(); i++) {
	      if (set.contains(b.set.get(i)) == false) {
	       return false;
	      }
	  }
		return true;
	  }
	// Returns true if the set contains the value, otherwise false
	  public boolean contains (int value) {
	    return set.contains(value);
	  }
	  // Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	  public int largest()
	  throws IntegerSetException {
	    if(set.isEmpty()) {
	    throw new IntegerSetException(); }
	    int max = set.get(0);
	    for(int i = 1; i < set.size(); i++) {
	      if (max < set.get(i)) {
	        max = set.get(i);
	      }
	    }
	    return max;
	  }
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	  public int smallest() 
	  throws IntegerSetException {
	    if(set.isEmpty()) {
	    throw new IntegerSetException(); }
	    set.sort(Comparator.naturalOrder());
	    return set.get(0);
	  }
	// Adds an item to the set or does nothing it already there	
	  public void add(int item) {
	    set.add(item);
	  }
	// Removes an item from the set or does nothing if not there
	  public void remove(int item) {
	    if (set.contains(item)) {
	      int num = set.indexOf(item);
	      set.remove(num);
	    } 
	  }
	// Set union
	  public void union(IntegerSet b) {
	    for(int i = 0; i < b.set.size(); i++) {
	      if (set.contains(b.set.get(i)) == false) {
	        set.add(b.set.get(i));
	  }
	  }
	  }
	// Set intersection
	  public void intersection(IntegerSet b) {
	    for(int i = 0; i < set.size(); i++) {
	      if (set.contains(b.set.get(i)) == false) {
	        int num = set.indexOf(i);
	        set.remove(num);
	  }
	  }
	}
	// Set difference, i.e., s1 –s2
	  public void diff(IntegerSet b) {
		  set.remove(b);
	  }
	// Returns true if the set is empty, false otherwise
	  public boolean isEmpty() {
	    if (set.isEmpty()) {
	      return true;
	    }
	    return false;
	  }
	// return String representation of your set
	  public String toString() {
	    return set.toString();
	  }
	}