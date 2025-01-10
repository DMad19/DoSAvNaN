'''
1       2       3
        abc     def

4       5       6
ghi     jkl     mno

7       8       9
pqrs    tuv     wxyz
'''
def phoneNumberCombi(p,up):
    if up=="":
        if p!="":
            return [p]
        return []
    digit = int(up[0])
    l = []
    if digit==1:
        l.extend(phoneNumberCombi(p,up[1:]))
        return l
    if 2<=digit<=6:
        for i in range((digit-2)*3,(digit-1)*3):
            l.extend(phoneNumberCombi(p+chr(ord('a')+i),up[1:]))
    elif digit==7:
        for i in range((digit-2)*3,(digit-1)*3+1):
            l.extend(phoneNumberCombi(p+chr(ord('a')+i),up[1:]))
    elif digit==8:
        for i in range((digit-2)*3+1,(digit-1)*3+1):
            l.extend(phoneNumberCombi(p+chr(ord('a')+i),up[1:]))
    else:
        for i in range((digit-2)*3+1,(digit-1)*3+2):
            l.extend(phoneNumberCombi(p+chr(ord('a')+i),up[1:]))
    return l
print(phoneNumberCombi("","192"))