# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/merge-k-sorted-linked-lists
# POTD 19-02-2025

import heapq

class Node:
    def _init_(self,x):
        self.data = x
        self.next = None

class Solution:
    def mergeKLists(self, arr):
        # code here
        # return head of merged list
        head = Node(0)
        newarr = []
        for i in arr:
            heapq.heappush(newarr,(i.data,i))
        
        prev = head
        while(newarr):
            newNode = heapq.heappop(newarr)[1]
            prev.next = newNode
            prev = prev.next
            if(newNode.next):
                heapq.heappush(newarr,(newNode.next.data,newNode.next))
        
        return head.next