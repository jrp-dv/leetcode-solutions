/**
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 * Time: O(n), Space: O(1)
 * Difficulty: Easy
 */

class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0;
        int last = nums.length - 1;

        for (int i = 0;i < nums.length - count; i++) {

            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[last-count];
                nums[last-count] = temp;
                count++;
                i--;
            }
        }

        return nums.length - count;
    }
}
