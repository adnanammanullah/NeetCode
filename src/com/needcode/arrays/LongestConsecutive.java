package com.needcode.arrays;

public class LongestConsecutive {
	public int longestConsecutive(int[] nums) {
		
		if(null==nums || nums.length ==0){
            return 0;
        }
        
		
		int longCount=1;
		int maxNum=Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>maxNum)
				maxNum=nums[i];
		}
		
		int [] countingSort = new int[maxNum+1];
		
		for(int i=0; i<nums.length; i++) {
			countingSort[nums[i]]=countingSort[nums[i]]+1;
		}
		
		//find longest seq of non zeros
		int start=-1;
		int end=-1;
		int len=0, maxLen=0;
		int maxStart=-1;
		int maxEnd=-1;
		for(int i=0; i<countingSort.length; i++) {
			if(countingSort[i]>0) {
				if(start>=0) {
					end++;
					len++;
				}else {
					start=i;
					end=i;
					len++;
				}
			}else {
				if(start>=0 && end>=0) {
					if(len>maxLen) {
						maxStart=start;
						maxEnd=end;
						maxLen=len;
					}
					start=-1;
					end=-1;
					len=0;
				}
			}
		}
		
		if(len>maxLen) {
			maxStart=start;
			maxEnd=end;
			maxLen=len;
		}
		
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestConsecutive().longestConsecutive(new int[] {100,4,200,1,3,2}));

	}

}
