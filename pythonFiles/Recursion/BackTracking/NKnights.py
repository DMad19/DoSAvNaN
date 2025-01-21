def NKnights(board,row,col,n):
    if n==0:
        print(board)
        return 1
    if row == len(board)-1 and col==len(board):
        return 0
    c = 0
    if col==len(board):
        c += NKnights(board,row+1,0,n)
    else:
        if isSafe(board,row,col):
            board[row][col] = "K"
            c += NKnights(board,row,col+1,n-1)
            board[row][col] = "."
        c += NKnights(board,row,col+1,n)
    return c

def isSafe(board,row,col):
    if(isValid(board,row-2,col+1) and board[row-2][col+1]=="K"):
        return False
    if(isValid(board,row-2,col-1) and board[row-2][col-1]=="K"):
        return False
    if(isValid(board,row-1,col-2) and board[row-1][col-2]=="K"):
        return False
    if(isValid(board,row-1,col+2) and board[row-1][col+2]=="K"):
        return False
    return True

def isValid(board,row,col):
    if row<len(board) and row>=0 and col<len(board) and col>=0:
        return True
    return False
n = 2
board = [['.' for i in range(n)] for i in range(n)]
print(NKnights(board,0,0,n))