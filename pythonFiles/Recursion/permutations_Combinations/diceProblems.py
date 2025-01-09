def printDiceRolls(p,target):
    if target==0:
        print(p)
        return
    for i in range(1,7):
        if i>target:
            return
        printDiceRolls(p+str(i),target-i)
printDiceRolls("",4)

def getDiceRolls(p,target):
    if target==0:
        return [p]
    l = []
    for i in range(1,7):
        if i>target:
            return l
        l.extend(getDiceRolls(p+str(i),target-i))
    return l
print(getDiceRolls("",4))

def countDiceRolls(p,target):
    if target==0:
        return 1
    c = 0
    for i in range(1,7):
        if i>target:
            return c
        c += countDiceRolls(p+str(i),target-i)
    return c
print(countDiceRolls("",4))