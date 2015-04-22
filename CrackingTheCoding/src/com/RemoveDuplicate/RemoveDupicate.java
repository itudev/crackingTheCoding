package com.RemoveDuplicate;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDupicate {

	public static String removeDuplicate(String str) {
		// if empty or null
		if (str == " " || str == null) {
			return str;
		}
		// convert string to char Array
		char[] charArr = str.toCharArray();
		int i = 1;
		int j = 1;
		// we would have unique elements at less than i position.
		while (j < charArr.length) {
			int k = 0;
			for (; k < i; k++) {
				if (charArr[k] == charArr[j]) {
					break;
				}
			}
			if (k >= i) {
				charArr[i] = charArr[j];
				i++;
			}
			j++;

		}
		// copying the unique sequence into new Array.
//		char[] newArr = new char[i];
//		for (int p = 0, q = 0; p < i; p++, q++) {
//			newArr[p] = charArr[q];
//		}
		
		char[] newArr = Arrays.copyOf(charArr, i);

		String newStr = new String(newArr);
		return newStr;

	}

	// removing duplicate using HashSet
	// Complexity: Order of N
	public static void removeDuplicateHashSet(String str) {
		char[] charArr = str.toCharArray();
		TreeSet<Character> hs = new TreeSet();
		for (int i = 0; i < charArr.length; i++) {
			hs.add(charArr[i]);
		}

		System.out.println(hs.toString());

	}

	// remove Duplicate after sorting
	public static String removeDuplicateSorting(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		//System.out.println(charArr);
		int i =0; int j=1;
		while (j < charArr.length) {
			if (charArr[i] == charArr[j]) {
				j++;
			} else {
				i++;
				charArr[i] = charArr[j];
				j++;

			}
		
		}
//		char[] newArr = new char[i+1];
//		for (int p = 0, q = 0; p <= i; p++, q++) {
//			newArr[p] = charArr[q];
//		}
		char[] newArr = Arrays.copyOf(charArr, i+1);


		String newStr = new String(newArr);
		return newStr;

	}

	public static void main(String[] args) {
		String res = removeDuplicate("abacba");// abcde
		System.out.println(res);
		removeDuplicateHashSet("aabb");
		String finals =removeDuplicateSorting("pqpqa");
		System.out.println(finals);
		//removeDuplicat
	}

}
