package com.replaceSpaces;

public class ReplaceSpaces {

	public static String replaceSpace(String str, int fullLength) {
		// charArray so that values can be indexed and access.
		char[] charArray = str.toCharArray();
		int indexLastChar = -1;
		fullLength = charArray.length;
		// finding last character before spaces
		// like asbsdssss. here d is the last character. ps: s is for space
		for (int i = fullLength - 1; i >= 0; i--) {
			if (charArray[i] != ' ') {
				indexLastChar = i;
				break;
			}
		}
		if (indexLastChar == -1) {
			return str;
		}
		// replacing spaces with %20 by traversing from lastcharacterIndex
		// started putting value in the end.
		// say asbsdssss putting d at 9th index and space before d is replaced
		// by %20
		for (int i = indexLastChar, j = fullLength - 1; i > 0; i--) {
			// no need of replacing anything. It means that there are no space left and hence copy as it is.
			if (i == j){
				break;
			}
			else if (charArray[i] != ' ') {
				charArray[j] = charArray[i];
				j--;
			} else  {
				charArray[j] = '0';
				charArray[j - 1] = '2';
				charArray[j - 2] = '%';
				j = j - 3;

			}

		}
		String newStr = new String(charArray);
		return newStr;
	}

	public static void main(String[] args) {
		String result = replaceSpace("abbb", 4 );
		System.out.println(result);

	}

}
