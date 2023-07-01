//找出陣列中的所有遞增序列差
public class Main {
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int min_index=0; min_index<prices.length; min_index++) {
            int diff = 0;
            int max_index = min_index + 1;
            //System.out.println("min = " + min_index);
            //System.out.println("max = " + max_index);
            if (max_index == prices.length) break;
            if (prices[max_index] > prices[min_index]) {
                diff = prices[max_index] - prices[min_index];
                sum = sum + diff;
                //System.out.println("diff = " + diff);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {7,1,5,3,4,5};
        int total_profit = maxProfit(array);
        System.out.println(total_profit);
    }
}
