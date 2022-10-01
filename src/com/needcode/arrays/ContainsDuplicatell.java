package com.needcode.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContainsDuplicatell {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean containsDup = false;
		Map<Integer, Integer> kNumbers = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < nums.length && !containsDup; i++) {
			kNumbers.put(nums[i], kNumbers.getOrDefault(nums[i], 0) + 1);
			if (kNumbers.get(nums[i]) > 1 && kNumbers.size() <= k) {
				containsDup = true;
			} else {
				if (kNumbers.size() > k) {
					Integer key = kNumbers.keySet().iterator().next();
					kNumbers.put(key, kNumbers.getOrDefault(key, 0) - 1);
					if (kNumbers.getOrDefault(key, 0) == 0) {
						kNumbers.remove(key);
					}
				}
			}
		}

		return containsDup;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 4 }, 2));

	}

}
