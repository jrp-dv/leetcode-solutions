/**
 * 3000. Max Area of Longest Diagonal Rectangle
 * https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-08-26
 * Time: O(n), Space: O(n). Se podría optimizar el espacio juntando los dos bucles en uno solo.
 * Difficulty: Easy
 */


class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxDiagonal = 0;
        int maxArea = 0;
        List<Integer> res = new ArrayList<>();
        res.add(0); //Añado el 0 siempre porque si el primero es el más grande, ya está en la lista.

        for (int i = 0;i<dimensions.length; i++) {

            int currentDiagonal = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];

            if (i == 0) {
                maxDiagonal = currentDiagonal;
            } else {

                if (currentDiagonal > maxDiagonal) {
                    maxDiagonal = currentDiagonal;
                    res.clear(); //Borro los anteriores porque ya no me interesan que estén
                    res.add(i);

                } else if (currentDiagonal == maxDiagonal) {
                    res.add(i); //Aquí no se borra nada, solo añado el índice a la lista.
                }

            }
        }

        for (int j=0; j<res.size(); j++){
            int actualIndex = res.get(j);

            int actualArea = dimensions[actualIndex][0] * dimensions[actualIndex][1];

            if (j == 0) {
                maxArea = actualArea;
            } else {

                if (actualArea > maxArea) {
                    maxArea = actualArea;
                }

            }
        }

        return maxArea;

    }


}
