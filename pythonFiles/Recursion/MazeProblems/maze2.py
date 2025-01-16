# maze2 - down, right, down-right Diagonal

def countPaths(r,c,n):
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