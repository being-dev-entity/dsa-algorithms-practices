package com.being.developer.arrays;

// Best time to Buy and Sell Stock ii || Leetcode - 122 | Stock Buy and Sell ||
// We can buy and sell any number of time stock provided no continuous buy only or sell can occur.
public class StockBuySellMaxProfitPart2 {

    public static void main(String[] args) {
        System.out.println("Stock Buy Sell Max Profit example 2");
        int[] stockPrices = { 7, 1, 5, 3, 6, 4 };
        // int[] stockPrices = { 5, 2, 6, 1, 4, 7, 3, 6 };
        int maxProfitTotal = maxProfit(stockPrices);
        System.out.println("maxProfitTotal: " + maxProfitTotal);
    }

    private static int maxProfit(int stockPrices[]) {
        if (stockPrices == null) {
            return 0;
        }
        int maxProfitTotal = 0;
        for (int i = 1; i < stockPrices.length; i++) {
            if (stockPrices[i] > stockPrices[i - 1]) {
                maxProfitTotal = maxProfitTotal + stockPrices[i] - stockPrices[i - 1];
            }
        }

        return maxProfitTotal;
    }
}
