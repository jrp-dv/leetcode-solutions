/**
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/description/?envType=study-plan-v2&envId=top-interview-1500
 * Time: O(n), Space: O(1) en el mejor de los casos, O(n) en el peor de los casos (crear un nuevo array).
 * Difficulty: Easy
 */


class Solution {
    public int[] plusOne(int[] digits) {

        int i = digits.length - 1;

        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }

        if (i >= 0) {
            digits[i] += 1;
            return digits;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;

        return res;

    }
}
