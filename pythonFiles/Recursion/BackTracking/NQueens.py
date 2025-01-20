def NQueens(board,row):
    if row==len(board):
        for i in board:
            print(i)
        print()
        return 1
    count = 0
    for i in range(len(board[row])):
        if(isSafe(board,row,i)):
            board[row][i] = 'Q'
            count += NQueens(board,row+1)
            board[row][i] = '.'
    return count
def isSafe(board,row,col):
    # col
    for i in range(row):
        if board[i][col] == 'Q':
            return False
    
    # right Diagonal
    right = min(row,len(board)-col-1)
    for i in range(1,right+1):
        if board[row-i][col+i] == 'Q':
            return False

    # left Diagonal
    left = min(row,col)
    for i in range(left+1):
        if board[row-i][col-i] == 'Q':
            return False
    return True

n = 4
board = [['.' for i in range(n)] for i in range(n)]
print(NQueens(board,0))