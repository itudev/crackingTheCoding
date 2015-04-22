package com.Reverse;

public class ReverseStringC {

	public static String reverseString(String str) {
		//We would be manipulating string so we need to convert into charArray.
		// input is null terminated string.hence 0 should always come in the end.
		char[] charArr = str.toCharArray();
		char temp;
		for (int i = 0, j = charArr.length -2; i < charArr.length; i++, j--) {

			// swap first and last
			if (i < j) {
			char vali = charArr[i];
			char valj = charArr[j];
				temp = vali;
				charArr[i] = valj;
				charArr[j] = temp;

			}
			else{
				//if i <= j no need of continuing the loop
				break;
				
			}

		}
		System.out.println(charArr);
		String NewStr = new String(charArr);
		return NewStr;
	}

	public static void main(String[] args) {
		String result = ReverseStringC.reverseString("abcd0");
		System.out.println(result);

	}

}
