///**
// * 88. Merge Sorted Array
// * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// * Time: O(N+M), Space: O(1)
// * Difficulty: Easy
// */



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1; //Numeros en nums1
        int j = n-1; //Números en nums2
        int k = m + n - 1; //Última posición de nums1


        //La idea es recorrer los dos arrays desde el final. Como nums1 tiene ceros al final, nos quedamos con el número más grande entre nums1 y nums2 para el mismo índice, y lo añadimos al final. Así, ordenamos la lista sola y solo      recorremos cada array una vez.
        while (j>=0){

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;

        }
    }
}
