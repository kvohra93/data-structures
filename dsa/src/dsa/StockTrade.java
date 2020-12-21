/*
 *https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
package dsa;

/**
 *
 * @author kunal
 */
public class StockTrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        StockTrade o = new StockTrade();
        System.out.println(o.maxProfit(prices));
    }
   
    public int maxProfit(int[] prices) {//brute
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i ++){
            for (int j = i; j<prices.length;j++){
                int diff = prices[j] - prices [i];
                if(diff>maxProfit)
                {maxProfit = diff;}
                System.out.println(prices[i]+","+prices[j]+","+maxProfit);
            }
          
        }
        return maxProfit;
    }
}  
