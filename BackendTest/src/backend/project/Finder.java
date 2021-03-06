package backend.project;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Finder program which takes a single String array as a argument and
 * implments a find method which would take single string argument as a key to
 * check the key is an anagram with all the String elements in String array.
 * this return list of string which is a anagram with a key argument.
 * 
 * @author pooran.c
 *
 */
public class Finder {

	public String[] thisIsAStringArray;

	public Finder(String[] inputArray) {
		this.thisIsAStringArray = inputArray;
	}

	/**
	 * This method check the two string are anagram or not. The logic is to count
	 * the number of occurrences of each character in our arguments.
	 * 
	 * @param word String from the inputArray
	 * @param key  String which is to be checked for anagram
	 * @return first string if the first and second are anagram, null if they are
	 *         not.
	 */
	public String anagramEfficiet(String word, String key) {
		// if the key passed is null, return null
		if (key == null) {
			return null;
		}

		// return null if the size of the two strings is not equal
		if (word.length() != key.length()) {
			return null;
		}

		// initialize a int array of size 256,
		// Assuming one byte for one character 256 size is good for ASCII,
		// if the multibyte charcter inputs are used then size would be biggervalues
		int[] letterCount = new int[256];

		for (int i = 0; i < word.length(); i++) {
			letterCount[word.charAt(i)]++;
			letterCount[key.charAt(i)]--;
		}

		for (int count : letterCount) {
			if (count != 0)
				return null;
		}
		return word;
	}

	/**
	 * This method check the two string are anagram or not. The logic here is
	 * convert each input string into char array and sort them using the Array
	 * functions and check if two sorted array equal or not.
	 * 
	 * @param word String from the inputArray
	 * @param key  String which is to be checked for anagram
	 * @return first string if the first and second are anagram, null if they are
	 *         not.
	 */
	public String anagramCheck(String word, String key) {
		// if the key passed is null, return null
		if (key == null) {
			return null;
		}
		// Converting each input to char Array
		char[] first = word.toCharArray();
		char[] second = key.toCharArray();

		// Sorting each array
		Arrays.sort(first);
		Arrays.sort(second);

		if (Arrays.equals(first, second)) {
			return word;
		} else {
			return null;
		}
	}

	/**
	 * This method would iterate over each string in inputString array and checks if
	 * the given key string is anagram with any of the string in input array.
	 * 
	 * @param key is the String which is checked for anagram.
	 * @return ArrayList of all the String which is a anagram with the key.
	 */
	public ArrayList<String> find(String key) {
		ArrayList<String> output = new ArrayList<String>();
		for (String s : this.thisIsAStringArray) {
			String result = anagramEfficiet(s, key);
			if (result != null && result.length() != 0) {
				output.add(result);
			}
		}
		return output;
	}

	public static void main(String[] args) {

//		String[] thisIsAStringArray = new String[] { "asd", "dsas", "asdfa"};
//		Finder finder = new Finder(thisIsAStringArray);
//
//		ArrayList<String> expected = new ArrayList<String>();
////		expected.add("eat");
////		expected.add("tea");
//
//
//		ArrayList<String> resOutput = finder.find(null);
//		if (resOutput != null && resOutput.size() != 0) {
//			System.out.println(resOutput);
//		} else {
//			System.out.println("String of arrays doesnot contain any anagrams of the input");
//
//		}

	}

}
