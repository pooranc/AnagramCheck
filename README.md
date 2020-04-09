# AnagramCheck

## This assignment is basically, checking for a Anagram. What is anagram ? if two String has same set of character in a different order. A "Key" String is passed to Find(Key) method and is checked for anagram with all the Strings in String Array in a for loop. 

## There is 2 anagram check helper method: 
1. anagramEfficiet(key) : 
  This logic of this method is to count the number of occurrences of each character in our arguments. 
  
     1. Time complexity of this would be O(n) as there is one for loop for which iterate over "n" character. "n" being the length on the key String.
  
     2. Size complexity, it would need extra space for lettercounting array, and it would be much bigger if multibyte character set are used.
     
2. anagramCheck(Key) : 
    The logic here is convert each input string into char array and sort them using the Array functions and check if two sorted array equal or not.
    
    1. Time complexity would be O(n log n), because sorting of array.

## Compile instructions:

Clone this project, and import as "existing java project" in eclipse. and Run the "FinderTest.java" as junit test case.
