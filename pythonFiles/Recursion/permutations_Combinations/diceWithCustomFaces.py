def printDiceRolls(p,target,faces):
    if target==0:
        print(p)
        return
    for i in range(1,faces+1):
        if i>target:
            return
        printDiceRolls(p+str(i),target-i,faces)
printDiceRolls("",4,3)

def getDiceRolls(p,target,faces):
    if target==0:
        return [p]
    l = []
    for i in range(1,faces+1):
        if i>target:
            return l
        l.extend(getDiceRolls(p+str(i),target-i,faces))
    return l
print(getDiceRolls("",4,3))

def countDiceRolls(p,target,faces):
    if target==0:
        return 1
    c = 0
    for i in range(1,faces+1):
        if i>target:
            return c
        c += countDiceRolls(p+str(i),target-i,faces)
    return c
print(countDiceRolls("",4,3))