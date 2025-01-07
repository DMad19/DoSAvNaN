def subsetsforDuplicates(s):
    l = [""]
    start = 0
    end = 0
    for i in range(len(s)):
        start = 0
        if i>0 and s[i]==s[i-1]:
            start = end + 1
        end = len(l)-1
        for j in range(start,len(l)):
            l.append(l[j]+s[i])
    return l
print(subsetsforDuplicates("Abcc")) 