class Solution2 {
    public static int maxProfit1(int[] prices) {
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int price : prices){
            if(price < min){
                min = price;
            }else{
                profit = Math.max(profit, price-min);
            }
        }

        return profit;
    }

    public static void main(String args[]){
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit1(prices));
    }
}