/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 * Time: O(n), Space: O(1)
 * Difficulty: Easy
 */

class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 0;

        for (int i = 0; i<nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

    }
}
