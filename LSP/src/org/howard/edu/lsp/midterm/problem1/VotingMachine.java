package org.howard.edu.lsp.midterm.problem1;

import java.util.*;

public class VotingMachine {
	HashMap<String,Integer> c = new HashMap<String,Integer>();
	
	public void addCandidate(String name) { //Adds a candidate to the list with 0 votes
		c.putIfAbsent(name,0);
	}
	
	public void castVotes(String name, int votes) { // Cast votes to the candidate with the given name
		int v = 0;
		for(String i : c.keySet()) {
			if (i == name) {
				v = c.get(i) + votes;
				c.put(name, v);
			}
		}
	}
	
	public int getVotes(String names) throws UnknownCandidateException { //Return the number of votes for a given candidate
		if (c.containsKey(names)) {
			return c.get(names);
	}
		else {
			throw new UnknownCandidateException();
		}
	}
	
	public int sum() { // Return the total number of votes for all candidates.
		int count = 0;
		for(int i : c.values()) {
			count += i;
			}
		return count;
	}
}