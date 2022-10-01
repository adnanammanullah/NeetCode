package com.needcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 *
 */

public class TwoSum {

//	public int[] twoSum(int[] nums, int target) {
//		Arrays.sort(nums);
//		int sum;
//		for(int i=0, j=nums.length-1; i<j; ) {
//			sum = nums[i]+nums[j];
//			if(sum==target) {
//				return new int[] {i, j};
//			}else if(target<sum)
//				j--;
//			else
//				i++;
//		}
//		return new int[] {-1,-1};
//	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, List<Integer>> indexMap = new HashMap<Integer, List<Integer>>();
		for(int i=0; i<nums.length; i++) {
			if(indexMap.get(nums[i])==null) {
				indexMap.put(nums[i], new ArrayList<Integer>());
			}
			List<Integer> temp = indexMap.get(nums[i]);
			temp.add(i);
			indexMap.put(nums[i], temp);
		}
		int newTarget;
		for(int i=0; i<nums.length; i++) {
			newTarget = target-nums[i];
			if(indexMap.containsKey(newTarget)) {
				if(newTarget==nums[i]) {
					if(indexMap.get(newTarget).size()>1) {
						return new int[] {indexMap.get(newTarget).get(0),
								indexMap.get(newTarget).get(1)
								};
					}
				} else {
					return new int[] {i, indexMap.get(newTarget).get(0)};
				}
			}
		}
		
		return new int[] {-1, -1};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {3,2,4},6)));
	}

}
