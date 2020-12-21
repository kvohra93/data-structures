/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author kunal
 */
public class StockTrade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int[] prices = {7,6,4,3,1};
        StockTrade1 o = new StockTrade1();
        System.out.println(o.maxProfit(prices));
    }
   
    public int maxProfit(int[] prices) {// using max value and calculating profit
        int min  = Integer.MAX_VALUE;
        int max = 0;
        for (int i=0; i<prices.length; i ++){
            if (prices[i] < min){
                min = prices[i];
            }
            else if (prices[i] - min > max){
                max = prices[i] - min;
            }
                   
        }
    return max;
    }
}
//        for(int i = 0; i<prices.length; i ++){
//            for (int j = i; j<prices.length;j++){
//                int diff = prices[j] - prices [i];
//                if(diff>maxProfit)
//                {maxProfit = diff;}
//                System.out.println(prices[i]+","+prices[j]+","+maxProfit);
////            }
          
       