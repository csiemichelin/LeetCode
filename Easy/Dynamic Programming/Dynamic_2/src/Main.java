public class Main {
    public static int maxProfit(int[] prices) {
        /*
        int max = 0;
        int startIndex = 0;
        int start = prices[startIndex];
        int end = -1;
        //時間複雜度太高
        while (true) {
            if (startIndex >= prices.length-1)    break;
            //System.out.println("StartIndex = " + startIndex);
            for (int i=startIndex+1; i<prices.length; i++) {
                end = prices[i];
                //System.out.println("start = " + start + ", end = " + end );
                if (end - start > max) {
                    max = end - start;
                }
            }
            startIndex++;
            start = prices[startIndex];
        }
         */
        int buy = prices[0];
        int max = 0;
        for (int i=0; i<prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > max) {
                max = prices[i] - buy;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}