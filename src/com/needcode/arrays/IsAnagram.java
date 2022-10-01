package com.needcode.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IsAnagram {
	
	/**
	 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
	 */

	public boolean isAnagram(String s, String t) {
		
		if(null==s || null==t || s.length()!=t.length())
			return false;
		
		boolean isAna=true;
		
		Map<Character, Integer> charFrequency = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			charFrequency.put(s.charAt(i), charFrequency.getOrDefault(s.charAt(i), 0)+1);  
		}
		
		for(int i=0; i<t.length(); i++) {
			charFrequency.put(t.charAt(i), charFrequency.getOrDefault(t.charAt(i), 0)-1);  
		}
		
		for ( Entry<Character, Integer> mapEntry : charFrequency.entrySet()) {
			if(mapEntry.getValue()!=0) {
				isAna=false;
				break;
			}
		}
		
		return isAna;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new IsAnagram().isAnagram("tariq", "riqza"));

	}

}
