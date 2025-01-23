def solveSudoku(board):
        solved  = True
        for i in range(len(board)):
            for j in range(len(board)):
                if board[i][j] == ".":
                    solved = False
                    break
            if not solved:
                break
        if solved:
            return True
        for num in range(1,10):
            if isSafe(board,i,j,str(num)):
                board[i][j] = str(num)
                if(solveSudoku(board)):
                    return True
                else:
                    board[i][j] = "."
        return False
def isSafe(board,row,col,num):
    # to check row
    for i in range(len(board)):
        if board[row][i] == num:
            return False
    
    # to check col
    for i in range(len(board)):
        if board[i][col] == num:
            return False
            
    # to check div
    rowLength = row - row % 3
    colLength = col - col % 3
    for i in range(rowLength,rowLength+3):
        for j in range(colLength,colLength+3):
            if board[i][j] == num:
                return False
    return True
