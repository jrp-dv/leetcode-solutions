"""
* 36. Valid Sudoku
* https://leetcode.com/problems/valid-sudoku/description/?envType=study-plan-v2&envId=top-interview-150
* Time: O(1), Space: O(1). El tamaño del tablero es fijo, 9x9. Si fuera variable, sería O(n^2) en tiempo y O(n) en espacio.
* Difficulty: Medium
"""

class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """

        for i in range(9):
            numbersInRow = set()
            for j in range(9):
                rowElement = board[i][j]
                if (rowElement != "."):
                    if (rowElement in numbersInRow):
                        return False
                    else:
                        numbersInRow.add(rowElement)

        for j in range(9):
            numbersInColumn = set()
            for i in range(9):
                columnElement = board[i][j]
                if (columnElement != "."):
                    if (columnElement in numbersInColumn):
                        return False
                    else:
                        numbersInColumn.add(columnElement)


        for i in range(0,9,3):
            for j in range(0,9,3):
                numbersInGrid = set()
                for di in range(0,3):
                    for dj in range(0,3):
                        gridElement = board[i+di][j+dj]
                        if (gridElement != "."):
                            if (gridElement in numbersInGrid):
                                return False
                            else:
                                numbersInGrid.add(gridElement)

        return True
