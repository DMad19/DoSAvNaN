# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/solve-the-sudoku-1587115621
# POTD 31-01-2025

class Solution:
    
    #Function to find a solved Sudoku. 
    def solveSudoku(self, mat):
        
        # Your code here
        solved = True
        for row in range(len(mat)):
            for col in range(len(mat)):
                if mat[row][col] == 0:
                    solved = False
                    break
            if not solved:
                break
        if(solved):
            return True
        for i in range(1,10):
            if(isSafe(mat,row,col,i)):
                mat[row][col] = i
                if(self.solveSudoku(mat)):
                    return True
                mat[row][col] = 0
        return False
    
def isSafe(mat,row,col,value):
    for i in range(len(mat)):
        if mat[i][col] == value:
            return False
    
    for i in range(len(mat)):
        if mat[row][i] == value:
            return False
        
    r  = row - row % 3
    c = col - col % 3
    for i in range(r,r+3):
        for j in range(c,c+3):
            if mat[i][j] == value:
                return False
    return True