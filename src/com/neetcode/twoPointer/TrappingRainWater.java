package com.neetcode.twoPointer;

public class TrappingRainWater {

	public int trap(int[] height) {
		int i=0, j=height.length-1;
		
		while(i<height.length && height[i]==0)
			i++;
		
		while(j>0 && height[j]==0)
			j--;
		int min;
		int totalFilling=0;
		while(i<j) {
			min=Math.min(height[i], height[j]);
			if(height[i]<=height[j]) {
				i++;
				if(height[i]<=min) {
					totalFilling+=min-height[i];
					height[i]=min;
				}
			}else {
				j--;
				if(height[j]<=min) {
					totalFilling+=min-height[j];
					height[j]=min;
				}
			}
		}
		return totalFilling;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(new TrappingRainWater().trap(new int[] {1,0,4,0,1,4}));
//		System.out.println(new TrappingRainWater().trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
//		System.out.println(new TrappingRainWater().trap(new int[] {4,2,0,3,2,5}));
		System.out.println(new TrappingRainWater().trap(new int[] {0}));

	}

}
