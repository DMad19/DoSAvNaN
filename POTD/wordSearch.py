# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/word-search
# POTD 01-02-2025

def isWordExist(mat, word):
    return wordExist(mat,word,0,0,0)
def wordExist(mat,word,row,col,index):
    if row == len(mat):
        return False
    if col == len(mat[row]):
        return wordExist(mat,word,row+1,0,index)
    if(mat[row][col]=='*'):
        return False
    if(mat[row][col]==word[index]):
        mat[row][col] = '*'
        print(mat)
        if index==len(word)-1:
            return True
        if(isSafe(mat,row+1,col)):
            ans = wordExist(mat,word,row+1,col,index+1)
            if ans:
                return ans
        if(isSafe(mat,row,col+1)):
            ans = wordExist(mat,word,row,col+1,index+1)
            if ans:
                return ans
        if(isSafe(mat,row-1,col)):
            ans = wordExist(mat,word,row-1,col,index+1)
            if ans:
                return ans
        if(isSafe(mat,row,col-1)):
            ans = wordExist(mat,word,row,col-1,index+1)
            if ans:
                return ans
        mat[row][col] = word[index]
    return wordExist(mat,word,row,col+1,0)
def isSafe(board,row,col):
    if(row>=0 and row<len(board) and col>=0 and col<len(board[row]) and  board[row][col]!='*'):
        return True
    return False

# optimised. may be because it decreases function calls.
def exist(board,word):
    for i in range(len(board)):
        for j in range(len(board[i])):
            if(wordsearch("",board,i,j,word)):
                return True
    return False

def wordsearch(p,l,r,c,target):
    if(target[:len(p)]!=p):
        return False
    if(l[r][c]=='*'):
        return False
    p += l[r][c]
    l[r][c] = '*'
    if(p==target):
        return True
    if(r>0):
        if(wordsearch(p,l,r-1,c,target)):
            return True
    if(c>0):
        if(wordsearch(p,l,r,c-1,target)):
            return True
    if(r<len(l)-1):
        if(wordsearch(p,l,r+1,c,target)):
            return True
    if(c<len(l[0])-1):
        if(wordsearch(p,l,r,c+1,target)):
            return True
    l[r][c] = p[-1]
    p = p[:len(p)-1]
    return False

mat = [['A','B','C','D'],['P','Q','R','S'],['U','V','W','X']]
word= 'QRWX'

print(isWordExist(mat,word))
mat = [['A','B','C','D'],['P','Q','R','S'],['U','V','W','X']]
word= 'QRWX'
print(exist(mat,word))
