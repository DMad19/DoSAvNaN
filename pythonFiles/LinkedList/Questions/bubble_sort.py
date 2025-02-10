class ListNode:
    def __init__(self, x,node=None):
        self.val = x
        self.next = node
        
def bubble_sort(head,row,col):
    if(row==0):
        return head
    elif(col<row):
        first = get(head,col)
        second = get(head,col+1)
        if(first.val>second.val):
            if first == head:
                first.next = second.next
                second.next = first
                head = second
            else:
                prev = get(head,col-1)
                first.next = second.next
                prev.next = second
                second.next  = first
        return bubble_sort(head,row,col+1)
    else:
        return bubble_sort(head,row-1,0)

def get(head,col):
    temp = head
    while(col>0):
        temp = temp.next
        col -= 1
    return temp

def display(head):
    temp = head
    while(temp):
        print(temp.val,end=" ")
        temp = temp.next
    print()

head = None
temp = None
for i in [10,20,30,40]:
    newNode = ListNode(i,temp)
    head = newNode
    temp = newNode

display(head)
head = bubble_sort(head,3,0)
display(head)