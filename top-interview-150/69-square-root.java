/**
 * 69. Square Root
 * https://leetcode.com/problems/sqrtx/description/?envType=study-plan-v2&envId=top-interview-150
 * Time: O(log (n)), Space: O(1)
 * Difficulty: Easy
 */

class Solution {
    public int mySqrt(int x) {

        int min = 0;
        int max = x > 4 ? x / 2 : x; //'Propiedad' de las raíces. La raíz cuadrada de cualquier número mayor que 4 es más pequeña que la mitad de ese número. Si es más pequeño que 4 no se cumple, pero vale la pena usarlo para el resto de números
        int mid = max / 2;

        if (x == 0 || x == 1) return x;

        while (min <= max) {
            //Casteo a long porque hay testcases en los que hay overflow
            if ((long) mid * mid > x) {
                max = mid - 1; //Acuérdate siempre de hacer el -1 o +1 según toque. En estas dos ramas ya has probado con mid, no tiene sentido volver a probar
            } else if ((long) mid * mid < x) {
                min = mid + 1;
            } else {
                return mid;
            }

            mid = min + (max - min) / 2;
        }

        return max; //Aquí es max, porque al salir del bucle, el último número que sabemos que se ha pasado de largo es mid, y el último que se quedó por debajo es max. Como pide el enunciado hacer el suelo, devolvemos max.


    }
}
