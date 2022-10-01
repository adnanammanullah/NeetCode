package com.neetcode.twoPointer;

public class MostWaterContainer {

	public int maxArea(int[] height) {
		int maxArea = Integer.MIN_VALUE, area;
		int len, hei;
		for(int i=0, j=height.length-1; i<j; ) {
			len=j-i;
			hei=Math.min(height[i], height[j]);
			area = getArea(len, hei);
			if(area>maxArea)
				maxArea=area;
			if(height[i]<=height[j])
				i++;
			else
				j--;
		}
		
		return maxArea;
	}
	
	private int getArea(int indexDiff, int minHeight) {
		return indexDiff*minHeight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MostWaterContainer().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}

}
