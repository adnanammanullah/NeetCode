package com.neetcode.twoPointer;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if(null==s) {
			return false;
		}
		boolean isValid=true;
		String cleanedStr = cleanString(s);
		
		if(cleanedStr.length()==0 || cleanedStr.length()==1 || cleanedStr.length()==2) {
			isValid=true;
		}else {
			for(int i=0, j=cleanedStr.length()-1; isValid && i<j; i++,j--) {
				if(cleanedStr.charAt(i)!=cleanedStr.charAt(j)) {
					isValid=false;
				}
			}
		}
		return isValid;
		
	}

	private String cleanString(String s) {
		return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ValidPalindrome().isPalindrome("a1b[]1a"));
	}

}
