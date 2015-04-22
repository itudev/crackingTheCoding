package com.StringRotation;

public class StringRotation {

	public static boolean stringRotation(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 == len2 && len1 > 0) {
			String newStr = str2 + str2;
			for (int i = 0; i < newStr.length() - len1; i++) {
				if (newStr.substring(i, i + len1).equals(str1)) {
					return true;

				}
			}

		}

		return false;

	}

	public static void main(String[] args) {
		boolean bool = stringRotation("dalda", "dadas");
		System.out.println(bool);
	}

}
