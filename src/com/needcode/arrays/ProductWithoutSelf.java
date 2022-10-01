package com.needcode.arrays;

public class ProductWithoutSelf {

public int[] productExceptSelf(int[] nums) {
		
		int [] products = new int[nums.length];
		int zeros = 0;
		int product=1;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==0) {
				zeros++;
			}else
				product*=nums[i];
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==0) {
				if(zeros>1)
					products[i]=0;
				else
					products[i]=product;
			}else {
				if(zeros>0)
					products[i]=0;
				else
					products[i]=product/nums[i];
			}
		}
		
		return products;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
