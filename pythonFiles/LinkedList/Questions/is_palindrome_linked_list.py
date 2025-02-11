# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def isPalindrome(self, head):
        mid = getMid(head)
        midHead = reverse(mid)
        temp = midHead
        while(head and temp):
            if(head.val != temp.val):
                break
            head = head.next
            temp = temp.next
        reverse(mid)
        if(not head or not temp):
            return True
        return False
def getMid(head):
    slow = head
    fast = head
    while(fast and fast.next):
        slow = slow.next
        fast = fast.next.next
    return slow

def reverse(head):
    prev = None
    cur = head
    while(cur):
        nextN = cur.next
        cur.next = prev
        prev = cur
        cur = nextN
    return prev