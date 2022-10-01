package com.needcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 */
public class ContainsDuplicate {

//	public boolean containsDuplicate(int[] nums) {
//		
//		boolean containsDup=false;
//		Set<Integer> distinctNum = new HashSet<Integer>();
//		
//		for(int i=0; i<nums.length && !containsDup; i++) {
//			if(distinctNum.contains(nums[i])) {
//				containsDup=true;
//			}
//			distinctNum.add(nums[i]);
//		}
//		
//		return containsDup;
//		
//	}

	public boolean containsDuplicate(int[] nums) {

		boolean containsDup = false;
		
		Arrays.parallelSort(nums);
		
		for(int i=1; i<nums.length && !containsDup; i++) {
			if(nums[i]==nums[i-1]) {
				containsDup=true;
			}
		}
		
		return containsDup;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
