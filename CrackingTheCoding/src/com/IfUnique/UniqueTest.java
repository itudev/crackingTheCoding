package com.IfUnique;

public class UniqueTest {

	public static void main(String[] args) {
		IfUnique uni = new IfUnique();
		boolean bool = uni.ifUnique("adca");
		//System.out.println(bool);
		
		boolean result = uni.ifUniqueString("adc");
		System.out.println(result);
		
		boolean resultHashset = IfUnique.ifUniqueStringUsingHashSet("adcc");
		System.out.println(resultHashset);
	}

}
