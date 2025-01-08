def printPermuations(p,up):
    if(up==""):
        print(p)
        return
    for i in range(len(p)+1):
        printPermuations(p[0:i]+up[0]+p[i:],up[1:])
printPermuations("","abc")

def getPermuations(p,up):
    if(up==""):
        return [p]
    l = []
    for i in range(len(p)+1):
        l.extend(getPermuations(p[0:i]+up[0]+p[i:],up[1:]))
    return l
print(getPermuations("","abc"))

def countPermuations(p,up):
    if(up==""):
        return 1
    c = 0
    for i in range(len(p)+1):
        c+=(countPermuations(p[0:i]+up[0]+p[i:],up[1:]))
    return c
print(countPermuations("","abcd"))