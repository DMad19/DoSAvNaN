# https://www.geeksforgeeks.org/problems/decode-the-string2444/1
# POTD 01-03-2025

class Solution:
    def decodedString(self, s):
        return getDecodedString(s)
                
def getDecodedString(s):
    # print(s)
    digitstack = []
    charstack = []
    i = 0
    
    while(i < len(s)):
        cnt = 0
        if s[i].isdigit():
            while i<len(s) and s[i].isdigit():
                cnt = cnt * 10 + int(s[i])
                i += 1
            i -= 1
            digitstack.append(cnt)
        else:
            if s[i]=="]":
                digit = digitstack.pop()
                string = ""
                while(True):
                    popped = charstack.pop()
                    if popped == "[":
                        break
                    string = popped + string
                res = digit * string
                charstack.append(res)
            else:
                charstack.append(s[i])
        i += 1
    res = ""
    while charstack:
        res = charstack.pop() + res 
    return res