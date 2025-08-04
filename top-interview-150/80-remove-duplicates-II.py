'''
* 80. Remove Duplicates from Sorted Array II
* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
* Time: O(n), Space: O(1)
* Difficulty: Medium
'''


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        j = 0

        #Exactamente la misma idea que el problema 26, pero teniendo en cuenta que ahora podemos comparar hasta 2 elementos. Así que, mantenemos los dos primeros elementos iguales, y a partir de ahí comparamos con el que está 2 posiciones detrás.
        for i in range(len(nums)):

            if (i < 2 or nums[i] != nums[j-2]):
                nums[j] = nums[i]
                j += 1

        return j

