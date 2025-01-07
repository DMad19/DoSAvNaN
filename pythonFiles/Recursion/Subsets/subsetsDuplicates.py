def getsubsets(p,up,i,flag):
    if(i==len(up)):
        return [p]
    l = []
    if not (up[i]==up[i-1] and flag):
        l.extend(getsubsets(p,up,i+1,False))
    l.extend(getsubsets(p+up[i],up,i+1,True))
    return l
print(getsubsets("","abcc",0,False))