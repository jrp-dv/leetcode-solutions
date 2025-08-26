'''
* 58. Length of Last Word
* https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
* Time: O(n), Space: O(1)
* Difficulty: Easy
'''

#Esta es la solución larga. Se puede hacerf con un s.strip().split() y del tirón. Eso está hecho en la solución con Java
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        i = len(s) - 1
        count = 0

        while(i >= 0 and s[i] == " "):
            i -= 1

        while(i >= 0 and s[i] != " "):
            count += 1
            i -= 1


        return count
