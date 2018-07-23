package com.cn.algorithm.practice.GetCommonLengthChars;

public class MaxProfitTest {

  public static void main(String[] args){

    int[] prices = new int[]{7,1,5,3,6,4};

    System.out.println(getMaxProfit(prices));

  }

  public static int getMaxProfit(int[] prices){

    if(prices.length==0 || prices.length==1)
      return 0;

    int profit = 0;
    int min = prices[0];

    for(int i=0;i<prices.length;i++){
      if(min>prices[i])
        min = prices[i];
      else
        profit = Math.max(profit,prices[i]-min);
    }

    return profit;

  }

}
