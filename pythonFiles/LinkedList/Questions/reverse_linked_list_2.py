# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseBetween(self, head):
        cur = head
        prev = None
        for i in range(left-1):
            prev = cur
            cur = cur.next
        prevEnd = prev
        newStart = cur
        for i in range(left,right+1):
            nextN = cur.next
            cur.next = prev
            prev = cur
            cur = nextN
        if(newStart!=cur):
            newStart.next = cur
        if(prevEnd):
            prevEnd.next = prev
        if left!=1:
            return head
        return prev