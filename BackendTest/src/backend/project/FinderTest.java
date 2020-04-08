package backend.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FinderTest {

	@Test
	void test1() {
		String[] thisIsAStringArray = new String[5];
		thisIsAStringArray[0] = "asd";
		thisIsAStringArray[1] = "dsa";
		thisIsAStringArray[2] = "dsa";
		thisIsAStringArray[3] = "glk";
		thisIsAStringArray[4] = "lkm";
		Finder finder = new Finder(thisIsAStringArray);
		
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("asd");
		expected.add("dsa");
		expected.add("dsa");
		
		assertEquals(expected, finder.find("sad"), "test1 succesful");
		
	}
	
	@Test
	void test2() {
		String[] thisIsAStringArray = new String[] {"eat", "tea", "cat"};
		Finder finder = new Finder(thisIsAStringArray);
		
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("eat");
		expected.add("tea");
		assertEquals(expected, finder.find("eta"), "test2 succesful");
	}



}
