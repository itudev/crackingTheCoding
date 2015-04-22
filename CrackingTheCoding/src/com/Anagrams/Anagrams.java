package com.Anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Anagrams {
	public static boolean isAnagrams(String str1, String str2) {
		// if null, false
		if (str1 == null || str2 == null) {
			return false;
		}

		// if length of string not equal
		if (str1.length() != str2.length()) {
			return false;
		}
		// create a buffer
		int[] buffer = new int[256];
		int i = 0;
		// increase the value of buffer by one
		for (i = 0; i < str1.length(); i++) {
			++buffer[str1.charAt(i)];
		}
		int j = 0;
		// decrease by 1, so that we could ultimately get 0.
		for (; j < str2.length(); j++) {
			char ch = str2.charAt(j);
			if (buffer[ch] == 0){ 
				return false;
			}
			else{
				// decrease it if greater
				--buffer[ch];
			}

		}
				return true;
			}
//		}

		//return true;

	// checking if two strings are anagrams
	public boolean ifPermutation(String str1, String str2) {
		boolean result = false;
		//if length is not equal return 
		if (str1.length() != str2.length()) {
			return result;
			
			// if either  or both of the string are null. 
		} else if (str1 == null || str2 == null) {
			return result;

		} else {
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			// if sorting allowed, sort and compare
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			int i, j;
			for (i = 0, j = 0; i < charArr1.length; i++, j++) {
				if (charArr1[i] != charArr2[j]) {
					return result;
				}
			}
			if (i >= charArr1.length) {
				result = true;
				return result;
			}
		}
		return result;
	}

	// Using hashtable
	// finding permutation using hashtable gives O(n)
	public static boolean findIfPermutation(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			return result;

		} else if (str1 == null || str2 == null) {
			return result;

		} else {
//			Map<Character, Integer> table = buildTable(str1);
			//Creating map with character as key and integer as value
			Map<Character, Integer> table = new Hashtable<Character, Integer>();
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			int count = 1;
			// int val =0;
			for (char ch:charArr1) {
				// if table has already that key increement the value of value
				Integer valuee = table.get(ch);
				if (valuee != null) {
					System.out.println("value is:" + valuee);
					table.put(ch, ++valuee);
				} else {
					// else add it to the table and value as one
					table.put(ch, 1);
				}

			}
//			// just for iterating the map
//			for (Map.Entry<Character, Integer> entry : table.entrySet()) {
//				System.out.println("Key : " + entry.getKey() + " Value : "
//						+ entry.getValue());
//			}
			// checking in another string
			for (int i = 0; i < charArr2.length; i++) {
				//if another string doesnt contain that character return false
				if (!(table.containsKey(charArr2[i]))) {
				//	System.out.println(result);
					return result;
					// else decrease the value by one. we are kinda subtracting. so if its zero at the end means both string have same characters.
				} else {
					Integer res = table.get(charArr2[i]);
					if (res==null) {
						return false;
					}
					if(res <= 0){
						return result;
					}
					res--;
					System.out.println(res);
					table.put(charArr2[i], res);

				}
			}// iterating the map again to check if we got any non zero value. if yes means string are not permutable.
//			for (Map.Entry<Character, Integer> entry : table.entrySet()) {
//				System.out.println("Key : " + entry.getKey() + " Value : "
//						+ entry.getValue());
//				if(entry.getValue() != 0){
//					return result;
//				}
//				else {
//					result = true;
//				}
//			}
			

		}
		result = true;
		return result;

	}

	public static void main(String[] args) {
		boolean res = Anagrams.isAnagrams("aase", "aaes");
		System.out.println(res);
		boolean result = findIfPermutation("aaba", "aabb");
		System.out.println(result);
	}
}
