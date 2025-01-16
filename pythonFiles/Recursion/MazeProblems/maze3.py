# Maze3 has a obstacle at (1,1)

# maze3 - down, right, down-right Diagonal

def countPaths(r,c,n):
    if r==1 and c==1:
        return 0
    if r==n-1 or c==n-1:
        return 1
    count = 0
    count += countPaths(r+1,c+1,n)
    count += countPaths(r,c+1,n)
    count += countPaths(r+1,c,n)
    return count
print(countPaths(0,0,3)) 

# C - Cross, D - Down, R - Right 
def printPaths(p,r,c):
    if r==1 and c==1:
        return
    if r==2 and c==2:
        print(p)
        return
    if r<2 and c<2:
        printPaths(p+"C",r+1,c+1)
    if r<2:
        printPaths(p+"D",r+1,c)
    if c<2:
        printPaths(p+"R",r,c+1)
printPaths("",0,0)

def getPaths(p,r,c):
    if r==1 and c==1:
        return []
    if r==2 and c==2:
        return [p]
    l = []
    if r<2 and c<2:
        l.extend(getPaths(p+"C",r+1,c+1))
    if r<2:
        l.extend(getPaths(p+"D",r+1,c))
    if c<2:
        l.extend(getPaths(p+"R",r,c+1))
    return l
print(getPaths("",0,0))

# what if they give maze and obstacle might be at any place
def countPathsWithMaze(r,c,maze):
    if maze[r][c]==False:
        return 0
    if r==len(maze)-1 or c==len(maze[0])-1:
        return 1
    count = 0
    count += countPathsWithMaze(r+1,c+1,maze)
    count += countPathsWithMaze(r,c+1,maze)
    count += countPathsWithMaze(r+1,c,maze)
    return count

def printPathsWithMaze(p,r,c,maze):
    if maze[r][c]==False:
        return
    if r==len(maze)-1 and c==len(maze[0])-1:
        print(p)
        return
    if r<len(maze)-1 and c<len(maze[0])-1:
        printPathsWithMaze(p+"C",r+1,c+1,maze)
    if r<len(maze)-1:
        printPathsWithMaze(p+"D",r+1,c,maze)
    if c<len(maze)-1:
        printPathsWithMaze(p+"R",r,c+1,maze)

def getPathsWithMaze(p,r,c,maze):
    if maze[r][c]==False:
        return []
    if r==len(maze)-1 and c==len(maze[0])-1:
        return [p]
    l = []
    if r<len(maze)-1 and c<len(maze[0])-1:
        l.extend(getPathsWithMaze(p+"C",r+1,c+1,maze))
    if r<len(maze)-1:
        l.extend(getPathsWithMaze(p+"D",r+1,c,maze))
    if c<len(maze)-1:
        l.extend(getPathsWithMaze(p+"R",r,c+1,maze))
    return l
maze = [
    [True,True,True],
    [True,False,True],
    [True,True,True]
        ]
print(countPathsWithMaze(0,0,maze)) 
printPathsWithMaze("",0,0,maze)
print(getPathsWithMaze("",0,0,maze))