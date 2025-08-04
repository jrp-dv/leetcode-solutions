///**
// * 169. Majority Element
// * https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
// * Time: O(n), Space: O(n)
// * The Boyer-Moore Voting Algorithm can be used to solve this problem in O(n) time and O(1) space.
// * Difficulty: Easy
// */

class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> dict = new HashMap<>();
        int maxKey = 0;
        int maxValue = 0;

        for (int i = 0;i < nums.length;i++) {

            if (dict.containsKey(nums[i])) {
                int value = dict.get(nums[i]);
                dict.put(nums[i],value + 1);
            } else {
                dict.put(nums[i], 1);
            }

            if (dict.get(nums[i]) > maxValue){
                maxKey = nums[i];
                maxValue = dict.get(nums[i]);
            }
        }

        return maxKey;

    }
}
