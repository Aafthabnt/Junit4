package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringHelperTest {
	
	
		StringHelper helper=new StringHelper();
	private	String input;
	private	String expectedOutput;
	

	public StringHelperTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void testTruncateAInFirst2Positions_() {
		
		String actual=helper.truncateAInFirst2Positions("AACD");
		String expected="CD";
		assertEquals(expected,actual);
	}
	
	@Test
	public void sort() {
		int[] a= {1,2,3,5,4};
		int[] e= {1,2,3,4,5};
		Arrays.sort(a);
		assertArrayEquals(e, a);
	}
	
	@Test(timeout=1000)
	public void testsort_Performance() {
		int[] array= {12,23,4};
		for(int i=1;i<=40000000;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}
	
	@Parameters
	public static Collection<String[]> testconditions() {
		String exceptedOutputs[][]= {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(exceptedOutputs);
	}
	
	@Test
	public void testTruncated() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	
	

}
