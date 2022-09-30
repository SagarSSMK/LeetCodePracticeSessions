package SeventyFiveLeetCode.Array;

public class BuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = {7,6,4,10,1};

        System.out.println(buyAndSellStock(prices));

    }

    public static int buyAndSellStock(int[] prices){
        int maxProfit = 0;
        int profitSoFar = prices[0];
        for (int price : prices) {
            profitSoFar = Math.min(price, profitSoFar);
            maxProfit = Math.max(maxProfit, price - profitSoFar);
        }
        return maxProfit;
    }
}
