'''
 1       2       3
abc     def     ghi
 4       5       6
jkl     mno     pqr
 7       8       9
stu     vwx     yz
'''

def printPhoneNumbercombos(p,up):
    if up=="":
        print(p)
        return
    digit = int(up[0])
    for i in range((digit-1)*3,digit*3):
        printPhoneNumbercombos(p+chr(ord('a')+i),up[1:])
    
printPhoneNumbercombos("","12")

def getPhoneNumbercombos(p,up):
    if up=="":
        return [p]
    digit = int(up[0])
    l = []
    for i in range((digit-1)*3,digit*3):
        l.extend(getPhoneNumbercombos(p+chr(ord('a')+i),up[1:]))
    return l
print(getPhoneNumbercombos("","12"))

def countPhoneNumbercombos(p,up):
    if up=="":
        return 1
    digit = int(up[0])
    c = 0
    for i in range((digit-1)*3,digit*3):
        c += (countPhoneNumbercombos(p+chr(ord('a')+i),up[1:]))
    return c
print(countPhoneNumbercombos("","123"))