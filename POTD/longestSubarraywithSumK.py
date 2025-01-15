# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/longest-sub-array-with-sum-k0809

# Bruteforce
def longestSubarrayWithTarget(arr,k):
    ans = 0
    for i in range(len(arr)):
        s = 0
        for j in range(i,len(arr)):
            s += arr[j]
            if s==k:
                ans = j-i+1
    return ans

#optimal
def longestSubarrayWithTarget2(arr,k):
    prefixArr = [0]*len(arr)
    prefixArr[0] = arr[0]
    for i in range(1,len(arr)):
        prefixArr[i] = prefixArr[i-1] + arr[i]
    d = {}
    for i in range(len(prefixArr)):
        if prefixArr[i] in d:
            d[prefixArr[i]].append(i)
        else:
            d[prefixArr[i]] = [i]
    ans = 0
    for i in range(len(prefixArr)):
        if prefixArr[i]==k:
            ans = max(ans,i+1)
        else:
            comp = prefixArr[i]-k
            if comp in d:
                ans = max(ans,i-d[comp][0])
    return ans