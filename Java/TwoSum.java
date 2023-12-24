class Solution {
    public int buyChoco(int[] prices, int money) {
        int minimum1 = Integer.MAX_VALUE;
        int minimum2 = Integer.MAX_VALUE;
        int position1 = 0;
        for (int i = 0; i < prices.length; i++){
            if (minimum1 > prices[i]) {
                minimum1 = prices[i];
                position1=i;
            }
        }
        for (int i = 0; i < prices.length; i++){
            if (minimum2 > prices[i] & position1 != i) {
                System.out.println(i);
                minimum2 = prices[i];
            }
        }
        System.out.println(minimum1);
        System.out.println(minimum2);

        int left = money - (minimum1 + minimum2);
        if(left < 0){
            return money;
        }
        return left;
    }
}