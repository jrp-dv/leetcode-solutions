"""
* 392. Is Subsequence
* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
* Time: O(len(t)), Space: O(1)
* Difficulty: Easy
"""


class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        i = 0
        j = 0

        if (s == ""):
            return True

        while (j < len(t)):

            if(s[i] == t[j]):
                i += 1
                j += 1
            else:
                j += 1

            if (i == len(s)):
                return True

        return False



