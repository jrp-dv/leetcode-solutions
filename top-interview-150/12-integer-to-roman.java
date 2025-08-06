/**
 * 12. Integer to Roman
 * https://leetcode.com/problems/integer-to-roman/?envType=study-plan-v2&envId=top-interview-150
 * Time: O(1), Space: O(1). El tamaño de los numeros romanos está limitado por el problema y no depende del tamaño de la entrada.
 * Difficulty: Medium
 */


//La iudea principal detrás de esta solución es buscar el número más grande posible que se le puede restar a num, y añadir el símbolo correspondiente a res. Repetimos ese proceso hasta que num sea 0, y ya tenemos el número romano correspondiente.
class Solution {
    public String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int x = 0;
        String res = "";


        while (num > 0) {

            while (num >= values[x]) { //Nos permite repetir el símbolo tantas veces como sea necesario
                //Por ejemplo, si num = 3000, entrará 3 veces en este bucle, y añadirá "M" tres veces
                num -= values[x];
                res += symbols[x];
            }
            x++;
        }

        return res;
    }
}
