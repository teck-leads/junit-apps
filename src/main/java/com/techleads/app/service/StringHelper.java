package com.techleads.app.service;
public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	
	
	public static void main(String[] args) {
		String str="AABAA";
		StringHelper sh=new StringHelper();
		boolean theSame = sh.areFirstAndLastTwoCharactersTheSame(str);
		System.out.println(theSame);
		System.exit(0);
		String rest = sh.truncateAInFirst2Positions(str);
		System.out.println(rest);
		
	}

}