package com.needcode.arrays;

public class ContainsDuplicatelll {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
		boolean found=false;
		for(int i=0; i<nums.length && !found; i++) {
			for(int j=i+1; j<=i+indexDiff && j<nums.length && !found; j++) {
				if(Math.abs(nums[i]-nums[j])<=valueDiff)
					found=true;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new ContainsDuplicatelll().containsNearbyAlmostDuplicate(new int[] {1,6,11,16,2, 21},3,4));

	}

}
