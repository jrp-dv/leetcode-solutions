///**
// * 125. Valid Palindrome
// * https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
// * Time: O(n), Space: O(n)
// Java creates a new string with the regex, so it uses O(n) space. For O(1), it could be done comparing chars and adding restrictions (char is not a number for example), but it wouldn't be as readable.
// * Difficulty: Easy
// */



class Solution {
    public boolean isPalindrome(String s) {

        //Expresión regular para quedarme solo con letras y/o números. Nada de espacios ni signos de puntuación. Daría problemas si se usara español, ya que las letras con tilde o las eñes también se las cargaría
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().trim();
        int x = 0;
        int y = s.length()-1;

        while(y > x) {

            if (s.charAt(x) != s.charAt(y)) {
                return false;
            } else {
                y--;
                x++;
            }
        }

        return true;


    }
}
