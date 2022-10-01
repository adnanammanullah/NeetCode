package com.neetcode.twoPointer;

import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		for(int i=0, j=nums.length-1; i<j; ) {
			int sum = nums[i]+nums[j];
			if(sum==target) {
				return new int[] {i,j};
			}else if(sum>target) {
				j--;
			}else
				i++;
		}
		
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {2,7,11,15}, 9)));
	}

}
