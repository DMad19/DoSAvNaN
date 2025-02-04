# https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def deleteDuplicates(self, head):
        first = head
        node = head
        while(node):
            if(node.val!=first.val):
                first.next = node
                first = node
            node = node.next
        if first:
            first.next = None
        return head
    # Kunal's
    def deleteDuplicates2(self, head):
        node = head
        while(node):
            if(node.next!=None and node.val == node.next.val):
                node.next = node.next.next
            else:
                node = node.next
        return head