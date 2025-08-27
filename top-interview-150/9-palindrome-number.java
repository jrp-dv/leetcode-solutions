/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/?envType=study-plan-v2&envId=top-interview-1500
 * Time: O(1), Space: O(1).
 * En tiempo es O(1) porque el número de dígitos de un entero está acotado (32 bits). Como tal, se van a hacer como máximo 10 iteraciones, independientemente de lo que valga x. Por lo tanto, es O(1).
 * Difficulty: Easy
 */

class Solution {
    public boolean isPalindrome(int x) {

        long reversed = 0; //Solución fácil para el overflow a cambio de usar algo más de memoria (sigue siendo O(1) y esta solución bate al 88.9% en memoria).
        // La otra forma es darle la vuelta a la mitad del número. Mientras que x > reversed, quitamos números de x y los ponemos en reversed. Al acabar,
        // x tiene la mitad del número y reversed la otra invertida. SI el número de dígitos es impar, reversed va a tener un número más, que lo quitamos con reversed/10.
        // Si es par, la comparación se hace de forma directa.
        int y = x;

        if (x < 0) {
            return false;
        }

        while (y > 0) {
            int digitToAdd = y % 10;
            reversed = reversed * 10 + digitToAdd;
            y = y / 10;
        }

        return x == reversed;

    }
}
