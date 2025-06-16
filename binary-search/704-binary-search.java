/**
 * 704. Binary Search
 * https://leetcode.com/problems/binary-search/description/
 * Time: O(log n), Space: O(1)
 * Difficulty: Easy
 */


class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int mid;


        //Estos dos casos no hacen falta realmente, el while los maneja bien
        //Aunque así es bastante más explícito y "algo" más eficiente, ya que el best-case sería O(1) en vez de O(log n)
        if (nums.length == 0){
            return -1;
        }

        if (nums.length == 1) {
            if (nums[left] == target){
                return left;
            } else {
                return -1;
            }
        }


        while(left <= right) {
            mid = left + (right-left) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                right = mid-1; //mid - 1 porque así eliminamos la mitad derecha del array. Lo mismo para el caso de abajo pero con la mitad izquierda.
            } else {
                left = mid+1;
            }
        }

        return -1;
    }
}
