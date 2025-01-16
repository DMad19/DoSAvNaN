# maze4 - moves in all directions 
# T - top
# B - Bottom
# L - Left
# R - Right
# D - Diagonal(Down - Right) 

# Required backTracking to make sure we won't enter previously visited cell in the same function call 
# and enter cell if possible in next function call

def countPaths(maze,p,r,c):
    if r==2 and c==2:
        return 1
    if(not maze[r][c]):
        maze[r][c] = 1
        count = 0
        if r<2:
            count+=countPaths(maze,p+"B",r+1,c)
        if c<2:
            count+=countPaths(maze,p+"R",r,c+1)
        if r>0:
            count+=countPaths(maze,p+"T",r-1,c)
        if c>0:
            count+=countPaths(maze,p+"L",r,c-1)
        if r<2 and c<2:
            count+=countPaths(maze,p+"D",r+1,c+1)
        maze[r][c] = 0
        return count
    return 0

def printPaths(maze,p,r,c):
    if r==2 and c==2:
        print(p)
        return
    if(not maze[r][c]):
        maze[r][c] = 1
        if r<2:
            printPaths(maze,p+"B",r+1,c)
        if c<2:
            printPaths(maze,p+"R",r,c+1)
        if r>0:
            printPaths(maze,p+"T",r-1,c)
        if c>0:
            printPaths(maze,p+"L",r,c-1)
        if r<2 and c<2:
            printPaths(maze,p+"D",r+1,c+1)
        maze[r][c] = 0
    return

def getPaths(maze,p,r,c):
    if r==2 and c==2:
        return [p]
    l = []
    if(not maze[r][c]):
        maze[r][c] = 1
        if r<2:
            l.extend(getPaths(maze,p+"B",r+1,c))
        if c<2:
            l.extend(getPaths(maze,p+"R",r,c+1))
        if r>0:
            l.extend(getPaths(maze,p+"T",r-1,c))
        if c>0:
            l.extend(getPaths(maze,p+"L",r,c-1))
        if r<2 and c<2:
            l.extend(getPaths(maze,p+"D",r+1,c+1))
        maze[r][c] = 0
    return l

def printMazeWithPath(maze,p,r,c,step):
    if r==2 and c==2:
        maze[r][c] = step
        for i in maze:
            print(i)
        print(p)
        print()
        maze[r][c] = 0
        return
    if(not maze[r][c]):
        maze[r][c] = step
        if r<2:
            printMazeWithPath(maze,p+"B",r+1,c,step+1)
        if c<2:
            printMazeWithPath(maze,p+"R",r,c+1,step+1)
        if r>0:
            printMazeWithPath(maze,p+"T",r-1,c,step+1)
        if c>0:
            printMazeWithPath(maze,p+"L",r,c-1,step+1)
        if r<2 and c<2:
            printMazeWithPath(maze,p+"D",r+1,c+1,step+1)
        maze[r][c] = 0
    return

maze = [[0,0,0],[0,0,0],[0,0,0]]
print(countPaths(maze,"",0,0))
printPaths(maze,"",0,0)
print(getPaths(maze,"",0,0))
printMazeWithPath(maze,"",0,0,1)