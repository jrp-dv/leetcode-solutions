/**
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150
 * Time: O(n), Space: O(1)
 * Difficulty: Easy
 */


class Solution {
    public int romanToInt(String s) {
        int x = s.length() - 1;
        int res = 0;


        Map<String, Integer> conversionMap = Map.ofEntries(
                Map.entry("I", 1),
                Map.entry("V", 5),
                Map.entry("X", 10),
                Map.entry("L", 50),
                Map.entry("C", 100),
                Map.entry("D", 500),
                Map.entry("M", 1000),
                Map.entry("IV", 4),
                Map.entry("IX", 9),
                Map.entry("XL", 40),
                Map.entry("XC", 90),
                Map.entry("CD", 400),
                Map.entry("CM", 900)
        );

        if (s.length() == 1) {
            return conversionMap.get(s); //En esta rama no hay nada que hacer, se devuelve el valor del tirón
        }

        while (x >= 0) {

            if (x > 0) { //Si es mayor que 0, podemos agrupar dos caracteres. Los agrupamos y comprobamos si están en el mapa de conversiones.
                String subString = s.substring(x-1,x+1);
                if (conversionMap.containsKey(subString)) {
                    res += conversionMap.get(subString);
                    x -= 2;
                    continue;
                }
            }

            //Si x=0, o no hemos podido agrupar, cogemos el caracter actual y lo convertimos
            char actualChar = s.charAt(x);
            res += conversionMap.get(String.valueOf(actualChar));
            x--;

        }

        return res;
    }
}
