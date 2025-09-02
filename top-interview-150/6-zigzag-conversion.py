"""
* 6. Zigzag Conversion
* https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150
* Time: O(n), Space: O(n).
* Difficulty: Medium
"""

class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """

        if (numRows == 1 or numRows >= len(s)):
            return s

        rows = [""] * numRows
        actual_row = 0
        direction = 1

        for c in s:
            rows[actual_row] += c #Añadimos el carácter a la fila actual

            actual_row += direction #Cambiamos de fila

            if (actual_row == 0 or actual_row == len(s)-1): #Si llegamos a la primera o la última fila, cambiamos de dirección para hacer el zigzag
                direction *= -1

        return "".join(rows) #Unimos todas las filas para obtener el resultado final


