# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/permutations-of-a-given-string2041

class Solution:
    def findPermutation(self, s):
        # Code here
        return list(set(getPermutations("",s)))
def getPermutations(p,up):
    if(up==""):
        return [p]
    l = []
    for i in range(len(p)+1):
        l.extend(getPermutations(p[:i]+up[0]+p[i:],up[1:]))
    return l