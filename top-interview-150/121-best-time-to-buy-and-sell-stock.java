///**
// * 121. Best Time to Buy and Sell Stock
// * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
// * Time: O(n), Space: O(1)
// * Difficulty: Easy
// */


class Solution {
    public int maxProfit(int[] prices) {

        int diff = 0;
        int min = prices[0];


        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            diff = Math.max(diff, prices[i]-min); //Aquí forzamos que el valor de diff sea entre un valor actual (prices[i]) y el mínimo encontrado hasta ahora (min).
            // Si el valor actual es menor que el mínimo, el nuevo mínimo pasaría a ser prices[i] y la resta sería 0, por lo que no afectaría al valor de diff.

        }

        return diff;
    }
}
