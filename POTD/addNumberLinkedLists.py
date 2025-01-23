class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

#DForce
def addTwoLists1(self, num1, num2):
        # code here
        n1 = getNum(num1)
        n2 = getNum(num2)
        s = n1+n2
        head = Node(0)
        temp = Node(0)
        head.next = temp
        while(s!=0):
            rem = s%10
            temp.data = rem
            s = s//10
            newTemp = None
            if s!=0:
                newTemp = Node(0)
            temp.next = newTemp
            temp = newTemp
        return reverse(head.next)
def getNum(num):
    number = 0
    while(num):
        number = number*10 + num.data
        num = num.next
    return number

# Optimal
def addTwoLists(self, num1, num2):
    # code here
    while(num1.data == 0):
        num1 = num1.next
    while(num2.data == 0):
        num2 = num2.next
    num1 = reverse(num1)
    num2 = reverse(num2)
    carry = 0
    head = Node(0)
    temp = Node(0)
    head.next = temp
    while(num1 and num2):
        res = num1.data + num2.data + carry
        temp.data = res%10
        carry = res//10
        num1 = num1.next
        num2 = num2.next
        newNode = None
        if num1 or num2 or carry:
            newNode = Node(0)
        temp.next = newNode
        temp = temp.next
    while(num1):
        res = num1.data + carry
        temp.data = res%10
        carry = res//10
        num1 = num1.next
        newNode = None
        if num1 or carry:
            newNode = Node(0)
        temp.next = newNode
        temp = temp.next
    while(num2):
        res = num2.data + carry
        temp.data = res%10
        carry = res//10
        num2 = num2.next
        newNode = None
        if num2 or carry:
            newNode = Node(0)
        temp.next = newNode
        temp = temp.next
    while(carry!=0):
        res = carry
        temp.data = res%10
        carry = res//10
        newNode = None
        if carry:
            newNode = Node(0)
        temp.next = newNode
        temp = temp.next
    return reverse(head.next)
def reverse(head):
    cur = head
    prev = None
    while(cur):
        nextN = cur.next
        cur.next = prev
        prev = cur
        head = cur
        cur = nextN
    return head