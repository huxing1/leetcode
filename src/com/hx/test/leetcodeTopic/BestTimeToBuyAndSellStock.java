package com.hx.test.leetcodeTopic;

/**
 * @program: leetcode
 * @description: 121. 买卖股票的最佳时机
 * @author: hux
 * @create: 2020-07-02 17:33
 **/
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length<2) return 0;
        int maxProfit=0,buyPrice=prices[0];
        for (int i=0;i<prices.length;i++){
            if (prices[i]<buyPrice) buyPrice=prices[i];
            else maxProfit=Math.max(maxProfit,prices[i]-buyPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices={9,3,7,5,1,8};
        System.out.println(maxProfit(prices));
    }
}
