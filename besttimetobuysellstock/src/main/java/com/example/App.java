package com.example;

import java.util.Hashtable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] prices = {7,1,5,3,6,4};
        System.out.println( "Max Profit: " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        
        if(prices.length <= 1)
            return 0;

        int currentMaxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            int sellPrice = prices[i];
            if(sellPrice > buyPrice){
                int profit = sellPrice - buyPrice;
                if(profit > currentMaxProfit)
                    currentMaxProfit = profit;
            }else
                buyPrice = sellPrice;
        }

        return currentMaxProfit < 0 ? 0 : currentMaxProfit;
    }    
}
