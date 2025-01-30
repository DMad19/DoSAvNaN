# POTD 30-01-2025
# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/n-queen-problem0315

class Solution:
    def nQueen(self, n):
        # code here
        board = [['.' for i in range(n)] for i in range(n)]
        return getNQueens(board,0,0)
def getNQueens(board,row,col):
    if row==len(board):
        l = []
        for arr in board:
            for j in range(len(arr)):
                if arr[j]=="Q":
                    l.append(j+1)
        return [l]
    l = []
    for i in range(len(board)):
        if(isSafe(board,row,i)):
            board[row][i] = 'Q'
            l.extend(getNQueens(board,row+1,0))
            board[row][i] = '.'
    return l
def isSafe(board,row,col):
    for i in range(row):
        if board[i][col] == "Q":
            return False
    
    # left diagonal
    left = min(col,row)
    for i in range(1,left+1):
        if(board[row-i][col-i]=="Q"):
            return False
    
    # right diagonal
    right = min(row,len(board)-col-1)
    for i in range(1,right+1):
        if(board[row-i][col+i]=="Q"):
            return False
    return True