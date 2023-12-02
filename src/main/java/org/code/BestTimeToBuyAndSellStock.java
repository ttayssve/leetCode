package org.code;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // 5
        System.out.println(maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1}; // 0
        System.out.println(maxProfit(prices));

        prices = new int[]{2, 4, 1}; // 2
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int overallProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min)
                min = price;
            int dailyProfit = price - min;
            if (dailyProfit > overallProfit)
                overallProfit = dailyProfit;
        }
        return overallProfit;
    }
}
