/**
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 * Time: O(log n), Space: O(1)
 * Difficulty: Easy
 */



class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;
        int mid = right / 2;

        while (left <= right) {

            mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % letters.length]; //Sirve para que si left es igual a letters.length, se vuelva a empezar desde el principio del array

    }
}
