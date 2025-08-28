'''
* 55. Jump Game
* https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
* Time: O(n), Space: O(1)
* Difficulty: Medium
'''

#La idea es guardar la posición más lejana a la que podemos llegar en cada iteración. Si esa posición es mayor que n, devolvemos True, si i > farthest, devolvemos False.
class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """

        i = 0
        farthest = 0
        n = len(nums) - 1

        while (i <= farthest):
            jump = nums[i]

            farthest = max(farthest, i + jump)

            if (farthest >= n):
                return True

            i+=1

        return False
