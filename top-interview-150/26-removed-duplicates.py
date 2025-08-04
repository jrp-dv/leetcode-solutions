'''
* 26. Remove Duplicates from Sorted Array
* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
* Time: O(n, Space: O(1)
* Difficulty: Easy
'''

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        j = 0

        #La idea aquí es encontrar donde están los números no repetidos. Cuando encontramos un número que no es igual que su anterior, copiamos nums[i] en la posición que marque j y aumentamos su valor.
        # Al final, j es un contador que nos dice cuantos números son únicos.
        for i in range(len(nums)):
            if(i == 0 or nums[i] != nums[i-1]):
                nums[j] = nums[i]
                j += 1

        return j
