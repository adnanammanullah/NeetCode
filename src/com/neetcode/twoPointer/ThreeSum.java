package com.neetcode.twoPointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.parallelSort(nums);
		Set<List<Integer>> triplets = new HashSet<List<Integer>>();
		int sum;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1, k=nums.length-1; j<k;) {
				sum=nums[j]+nums[k];
				if(sum==-1*nums[i]) {
					triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if(sum>-1*nums[i]) {
					k--;
				} else
					j++;
			}
		}
		return triplets.stream().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new ThreeSum().threeSum(new int[] {3,0,-2,-1,1,2}).toString());

	}

}
