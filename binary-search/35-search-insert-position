/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 * Time: O(log n), Space: O(1)
 * Difficulty: Easy
 */



class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int mid = right / 2;

        while(left <= right) {

            mid = left + (right - left) / 2;

            //Casos especiales: que mid sea igual al target, o que el primer o último valor sea mayor o menor que el target respectivamente. En el caso del right, se suma 1 para que target se inserte después del último elemento
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] > target) {
                return left;
            } else if (nums[right] < target) {
                return right + 1;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return mid;

    }
}
