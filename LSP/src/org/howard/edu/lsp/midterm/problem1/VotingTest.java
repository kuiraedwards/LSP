package org.howard.edu.lsp.midterm.problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VotingTest {
	HashMap<String,Integer> test;
	public VotingTest() {};

	@BeforeEach
	public void setUp() throws UnknownCandidateException {
		test = new HashMap<String,Integer>();
		test.put("Kennedy", 15);
		test.put("Obama", 25);
		test.put("Clinton", 3);
		test.put("Biden", 10);
	}

	@Test
	@DisplayName("Test case for getting number of votes for a candidate")
	public void testGetVotes() {
		assertEquals(25,test.get("Obama"),("Obama did not get 25 votes."));
		assertEquals(50,test.get("Kennedy"), "Kennedy did not get 50 votes.");
		assertEquals(3,test.get("Clinton"), "Clinton did get 3.");
	}
	
	@Test
	@DisplayName("Test case for total sum of votes on ballots.")
	public void testSum() {
		
	}
	
	@AfterEach
	public void tearDown() throws UnknownCandidateException {
	}

}
