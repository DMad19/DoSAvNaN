def subsets(s):
    l = [""]
    for i in s:
        for j in range(len(l)):
            elem = l[j]+i
            l.append(elem)
    return l
print(subsets("Abc"))