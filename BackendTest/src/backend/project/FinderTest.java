package backend.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FinderTest {

	/**
	 * simple test
	 */
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
		
		assertEquals(expected, finder.find("sad"), "simple test -> succesful");
		
	}
	
	/**
	 * Test to check for same character different times
	 */
	@Test
	void test2() {
		String[] thisIsAStringArray = new String[] {"dddd", "dddddd", "d"};
		Finder finder = new Finder(thisIsAStringArray);
		
		ArrayList<String> expected = new ArrayList<String>();
		assertEquals(expected, finder.find("dd"), "Array containing a same charater different time -> succesful");
	}

	/**
	 * Passing Null String as a key
	 */
	@Test
	void test3() {
		String[] thisIsAStringArray = new String[] {"asd", "cat", "apple"};
		Finder finder = new Finder(thisIsAStringArray);
		
		ArrayList<String> expected = new ArrayList<String>();
		assertEquals(expected, finder.find(null), "Null as a key string -> succesful");
	}


}
