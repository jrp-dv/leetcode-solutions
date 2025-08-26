/**
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
 * Time: O(n), Space: O(n). La solución de O(1) de espacio es la de Python.
 * Difficulty: Easy
 */


class Solution {
    public int lengthOfLastWord(String s) {


        String[] splits = s.trim().split(" ");

        return splits[splits.length-1].length();
    }
}
