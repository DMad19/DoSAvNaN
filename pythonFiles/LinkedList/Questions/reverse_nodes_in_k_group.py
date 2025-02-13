# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseKGroup(self, head, k):
        length = getLength(head)
        times = length // k
        prev = None
        cur = head
        first = head
        for time in range(times):
            i = 0
            nextHead = cur
            while(i<k):
               nextN = cur.next
               cur.next = prev
               prev = cur
               cur = nextN
               i+=1
            if time==0:
                head = prev
            else:
                first.next = prev
                first = nextHead
        first.next = cur
        return head
def getLength(head):
    cur = head
    l = 0
    while(cur):
        l += 1
        cur = cur.next
    return l