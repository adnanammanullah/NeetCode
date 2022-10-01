package com.needcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

//	public List<List<String>> groupAnagrams(String[] strs) {
//		Map<Integer, List<String>> groupMap = new HashMap<Integer, List<String>>();
//		int hashVal;
//		for(int i=0; i<strs.length; i++) {
//			hashVal=getStrHash(strs[i]);
//			if(null==groupMap.get(hashVal))
//				groupMap.put(hashVal, new ArrayList<String>());
//			groupMap.get(hashVal).add(strs[i]);
//		}
//		
//		return groupMap.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
//	}
//
//	private int getStrHash(String string) {
//		int hashVal=0;
//		for(int i=0; i<string.length(); i++) {
//			hashVal+=(int)string.charAt(i);
//		}
//		return hashVal;
//	}
	private class ValuePair{
		String oldValue;
		String newValue;
		
		public ValuePair(String oldValue, String newValue) {
			this.oldValue=oldValue;
			this.newValue=newValue;
		}
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		List<ValuePair> valuePairs = new ArrayList<GroupAnagrams.ValuePair>();
		Map<String, List<String>> sortedMap = new HashMap<String, List<String>>();
		
		for(String str : strs) {
			char [] chars = str.toCharArray();
			Arrays.sort(chars);
			valuePairs.add(new ValuePair(str, Arrays.toString(chars)));
		}
		
		for(ValuePair valuePair : valuePairs) {
			List<String> groupList = sortedMap.getOrDefault(valuePair.newValue, new ArrayList<String>());
			groupList.add(valuePair.oldValue);
			sortedMap.put(valuePair.newValue, groupList);
		}
		
		return sortedMap.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new GroupAnagrams().groupAnagrams(new String[] {"abc", "abc", "acb"}));
	}

}
