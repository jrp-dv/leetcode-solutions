'''
* 80. Time to Buy and Sell Stock II
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150
* Time: O(n), Space: O(1)
* Difficulty: Medium
'''

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """

        maxProfit = 0

        for i in range(0, len(prices)-1):

            if (prices[i+1] > prices[i]):
                maxProfit += prices[i+1] - prices[i]


        return maxProfit
