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

# without using row and col args -- like sudoku solver
def NQueens2(board):
    c = 0
    for i in range(len(board)):
        flag = True
        for j in range(len(board)):
            if board[i][j] == "Q":
                c+=1
                flag = False
        if flag:
            break
    if c==len(board):
        return [[''.join(arr) for arr in board]]
    l = []
    for col in range(len(board)):
        if(isSafe(board,i,col)):
            board[i][col] = "Q"
            l.extend(NQueens(board))
            board[i][col] = "."
    return l

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