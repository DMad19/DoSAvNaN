# https://leetcode.com/problems/valid-sudoku/submissions/1518225372/

def validSudoku(board):
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] == ".":
                continue
            else:
                if(isSafe(board,i,j,board[i][j])):
                    continue
                else:
                    return False
    return True
def isSafe(board,row,col,num):
    # to check row
    for i in range(len(board)):
        if i==col:
            continue
        if board[row][i] == num:
            return False
    
    # to check col
    for i in range(len(board)):
        if i==row:
            continue
        if board[i][col] == num:
            return False
            
    # to check div
    rowLength = row - row % 3
    colLength = col - col % 3
    for i in range(rowLength,rowLength+3):
        for j in range(colLength,colLength+3):
            if i==row and j==col:
                continue
            if board[i][j] == num:
                return False
    return True
