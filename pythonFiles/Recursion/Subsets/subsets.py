def subsets(p,up):
    if up=="":
        print(p)
        return
    subsets(p+up[0],up[1:])
    subsets(p,up[1:])
subsets("","abcd")

def getsubsets(p,up):
    if up=="":
        return [p]
    l = []
    l.extend(getsubsets(p,up[1:]))
    l.extend(getsubsets(p+up[0],up[1:]))
    return l
print(getsubsets("","abc"))