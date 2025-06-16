/**
 * 2016. Maximum difference between increasing elements
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
 * Time: O(n^2), Space: O(1)
 * Difficulty: Easy
 * The most efficient solution would be O(n).
 */


class Solution {
    public int maximumDifference(int[] nums) {

        int x = 0;
        int y = nums.length - 1;
        int diff = nums[y] > nums[x] ? nums[y] - nums[x] : -1;


        while(x < nums.length) {
            if (nums[y] > nums[x]) {
                int updatedDiff = nums[y] - nums[x];

                if (updatedDiff > diff){
                    diff = updatedDiff;
                }
            }

            if (x == y){
                x++;
                y = nums.length -1;
            } else {
                y--;
            }
        }
        return diff;
    }

}
