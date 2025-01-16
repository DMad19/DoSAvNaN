# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/largest-subarray-of-0s-and-1s

# Brute Force
def getLargestSubArrayOf0sAnd1s(arr):
    # code here
    ans = 0
    for i in range(len(arr)):
        zeroes = 0
        ones = 0
        for j in range(i,len(arr)):
            if arr[j] == 0:
                zeroes += 1
            else:
                ones += 1
            if zeroes == ones:
                ans = max(ans,j-i+1)
    return ans

# Optimal
def getLargestSubArrayOf0sAnd1sV2(arr):
    # code here
    s = 0
    ans = 0
    d = {}
    for i in range(len(arr)):
        if arr[i]==0:
            s += -1
        else:
            s += 1
        if s==0:
            ans = max(ans,i+1)
        else:
            if s in d:
                ans = max(ans,i-d[s])
            else:
                d[s] = i
    return ans