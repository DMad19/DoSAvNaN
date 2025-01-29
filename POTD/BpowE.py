def power(self, b: float, e: int) -> float:
    # Code Here
    if e==0:
        return 1
    ans = getp(b,abs(e))
    # print(ans)
    if e>=0:
        return ans
    return 1/ans
def getp(b,e):
    ans = 1.00000
    while(e>0):
        ans *= p(b,e)
        e = e-(2**int(math.log(e,2)))
    return ans
def p(b,e):
    if b==0:
        return b
    if e==1 or e==0:
        return b
    return p(b*b,e//2)