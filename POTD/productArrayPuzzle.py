# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/product-array-puzzle4525

# DForce - It's optimal :)
def productExceptSelf( arr):
    #code here
    totalSum = 1
    zeroes = 0
    for i in arr:
        if i==0:
            zeroes += 1
        else:
            totalSum *= i
    if zeroes>1:
        return [0 for i in range(len(arr))]
    if zeroes == 0:
        l = []
        for i in arr:
            l.append(totalSum//i)
        return l
    l = []
    if zeroes == 1:
        for i in arr:
            if i==0:
                l.append(totalSum)
            else:
                l.append(0)
    return l

# Can use prefix and suffix arrays 