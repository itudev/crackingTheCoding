package com.IfUnique;

import java.util.HashSet;
import java.util.Set;

public class IfUnique {
	public boolean ifUnique(String str) {
		// buffer of boolean type array.
		boolean[] buffer = new boolean[255];
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char chars = str.charAt(i);
			// by default buffer values would be false.
			// So initially it would be false.
			if (buffer[chars] == true) {
				flag = true;
				break;
			} else {
				// fill true if it is the first time.
				buffer[chars] = true;
			}

		}
		// returning true if not unique
		return flag;

	}

	// without using any data structure.

	public boolean ifUniqueString(String str) {
		boolean flag = false;
		char[] charArr = str.toCharArray();
		int i;
		for (i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					flag = false;
					return flag;
				}
			}
		}
		if (i >= charArr.length) {
			// means that string is unique
			flag = true;
		}
		return flag;

	}
	
	//
	public static boolean ifUniqueStringUsingHashSet(String str) {
		boolean flag = false;
		
		char[] charArr = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		int i;
		for (i = 0; i < charArr.length; i++) {
			if(!(set.add(charArr[i]))){
				return false;
				
				}
			
		else{
			set.add(charArr[i]);
		}
			
		}
		if (i >= charArr.length) {
			// means that string is unique
			flag = true;
		}
		System.out.println("flag using hashtable: " + flag);
		return flag;

	}

}
