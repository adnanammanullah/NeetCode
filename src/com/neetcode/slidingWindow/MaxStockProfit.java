package com.neetcode.slidingWindow;

public class MaxStockProfit {

	public int maxProfit(int[] prices) {
		int maxProfit=0;
		
		if(null == prices || prices.length==1) {
			return maxProfit;
		}
		
		for(int i=0, j=1; i<j && j<prices.length;) {
			if(prices[j]-prices[i]<0) {
				i++;
				if(i==j)
					j++;
			}
			else {
				if(prices[j]-prices[i]>maxProfit)
					maxProfit=prices[j]-prices[i];
				j++;
			}
		}
		
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MaxStockProfit().maxProfit(new int[] {7,1,5,3,6,4}));
		System.out.println(new MaxStockProfit().maxProfit(new int[] {7,6,5,4,3,2,1}));
		System.out.println(new MaxStockProfit().maxProfit(new int[] {}));
		System.out.println(new MaxStockProfit().maxProfit(new int[] {1}));
		System.out.println(new MaxStockProfit().maxProfit(new int[] {1,2}));
	}

}
