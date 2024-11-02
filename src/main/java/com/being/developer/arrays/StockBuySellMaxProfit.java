package com.being.developer.arrays;

/**
 * 
 * The goal is to maximize profit by choosing the best day to buy and the best
 * day to sell stocks given an array of prices where each element is the stock
 * price on that day.
 * Explanation:
 * You want to find two days i and j such that prices[i] is the minimum price
 * before prices[j] and the difference prices[j] - prices[i] is the maximum
 * possible profit.
 * The simplest and most efficient way is to iterate through the array, keeping
 * track of the minimum price seen so far and the maximum profit you can achieve
 * based on that minimum price.
 */
public class StockBuySellMaxProfit {
    public static void main(String[] args) {
        System.out.println("Find best time to buy and sell stock to gain Max Profit.");
        int stockValues[] = { 2, 3, 4, 1, 5, 23, 24, 10 };
        int maxProfit = maxProfit(stockValues);
        for (int i : stockValues) {
            System.out.print(" " + i);
        }
        System.out.println("MaxProfit: " + maxProfit);
    }

    // Complexity O(n2) => O(n)
    private static int maxProfit(int[] stockValues) {
        if (stockValues == null || stockValues.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < stockValues.length - 1; i++) {
            if (minPrice < stockValues[i]) {
                minPrice = stockValues[i];
            } /* else if (stockValues[i] - minPrice > maxProfit) {
                maxProfit = stockValues[i] - minPrice;
            } */
            maxProfit = Math.max(maxProfit, stockValues[i] - minPrice);
        }

        return maxProfit;
    }
}
