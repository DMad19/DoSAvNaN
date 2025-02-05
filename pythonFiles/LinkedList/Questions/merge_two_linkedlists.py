# https://leetcode.com/problems/merge-two-sorted-lists/
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, list1,list2):
        head = ListNode(0)
        dup = head
        while(list1 and list2):
            # print(list1.val,list2.val,head.val)
            if(list1.val<list2.val):
                head.next = list1
                list1 = list1.next
            else:
                head.next = list2
                list2 = list2.next
            head = head.next
        if(list1): #Here you can use where also but as it's a linked list using if is optimal so we can just connect to first node
            head.next = list1
        if(list2):
            head.next = list2
        return dup.next