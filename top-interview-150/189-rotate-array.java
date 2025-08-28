///**
// * 189. Rotate Array
// * https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
// * Time: O(n), Space: O(n). Se puede hacer en O(1) usando ciclos de reemplazo o usando reversión.
// * Difficulty: Medium
// */

/*Se puede hacer en o(1) de espacio usando ciclos o reversión. Explico la reversión que es más sencilla de entender:
La idea es revertir primero el array entero. Luego revertimos los primero k elementos y luego el resto. Se consigue el mismo resultado, con menos uso de memoria.
Si es verdad que en el peor de los casos, la complejiodad temporal de la reversión es 3n (la de esta solución sería 2n), pero las dos son O(n) a fin de cuentas.
*/
class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length]; //Array auxiliar para guardar el resultado. Después copiamos al original.

        for (int i=0; i<nums.length; i++) {

            if (i+k < nums.length) {
                res[i+k] = nums[i];
            } else {
                int index = (i+k) % nums.length;
                res[index] = nums[i];
            }
        }

        for (int j = 0; j<res.length; j++){
            nums[j] = res[j];
        }
    }
}
