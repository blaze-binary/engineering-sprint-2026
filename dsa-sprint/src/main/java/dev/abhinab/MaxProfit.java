package dev.abhinab.dsa_sprint;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    /**
     * uses only 1 loop to traverse hence time: O(N)
     * uses only 2 variables which doesn't depend on the size of the array,
     * hence space: O(1)
     * @param arr array of numbers
     * @return the maximum profit after trading
     * time: O(N)
     * space: O(1)
     */
    private static int maxProfit(int[] arr) {
        if (arr == null || arr.length < 1)
            return 0;
        int profit = 0;
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentProfit = 0;
            if (arr[i] > lowest) {
                currentProfit = arr[i] - lowest;
                if (profit < currentProfit) {
                    profit = currentProfit;
                }
            } else {
                lowest = arr[i];
            }
        }
        return profit;
    }
}

