package LinkedList;

public class myFirstLL {

    public static class node {
        int data;
        node next;

        public node(int inpdata) {
            data = inpdata;
            next = null;
        }

    }

    public static node head;
    public static node tail;
    public static int llLength = 0;

    public static void AddFirst(int mydata) {
        node nd = new node(mydata);
        if (head == null) {
            myFirstLL.head = tail = nd;
            llLength++;
            return;
        }
        nd.next = myFirstLL.head;
        head = nd;
        llLength++;
    }

    public static void AddLast(int myData) {
        node nd = new node(myData);
        if (head == null) { // empty list
            head = tail = nd;
            llLength++;
            return;
        }
        tail.next = nd;
        tail = nd;
        llLength++;
    }

    public static void AddElementAtIndex(int index, int mydata) {
        node nd = new node(mydata);
        if (index > llLength) {
            System.out.println("index Out of Bounds");
            return;
        }
        if (index == 0) {
            AddFirst(mydata);
            return;
        }
        node temp = head;// index 0 is head
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                if (tail == temp) {
                    tail = nd;
                }
                nd.next = temp.next;
                temp.next = nd;
                llLength++;

            }
            temp = temp.next;
        }
    }

    public static void printLL(myFirstLL ll) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-> Null");
    }

    public static void removeFirst() {
        if (llLength == 0) {
            System.out.println("Linked list already empty");
            return;
        } else if (llLength == 1) {
            head = tail = null;
            llLength = 0;
            return;
        }
        head = head.next;
        llLength--;
    }

    public static int removeLast() {
        if (llLength == 0) {
            System.out.println("Linked list already empty");
            return Integer.MIN_VALUE;
        } else if (llLength == 1) {
            int val = head.data;
            head = tail = null;
            llLength = 0;
            return val;
        }
        node temp = head;// index 0 is head
        int val = Integer.MIN_VALUE;
        for (int i = 0; i < llLength; i++) {
            if (i == llLength - 2) {
                val = temp.next.data;
                tail = temp;
                tail.next = null;
                llLength--;
                return val;
            }
            temp = temp.next;
        }
        return val;
    }

    public static int SearchLL(int Key) {
        node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == Key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public static int RecurvSearch(int key, node myhead, int Index) {

        if (myhead.data == key) {
            return Index;
        }
        if (myhead.next == null) {
            return -1;
        }

        return RecurvSearch(key, myhead.next, Index + 1);
    }

    public static node reversedList() {
        node prev = myFirstLL.head;// 10
        node curr = prev.next;// 20
        node NextNode = curr.next;// 40
        myFirstLL.head.next = null;
        for (int i = 0; i < llLength - 1; i++) {
            if (curr == tail) {
                node temp = head;
                head = tail;
                tail = temp;
                curr.next = prev;
                return myFirstLL.head;
            }
            curr.next = prev;
            prev = curr;// 20
            curr = NextNode; // 40
            NextNode = curr.next;// 100

        }

        return myFirstLL.head;
    }

    public void DeleteNthNodeFromEnd(int n) {
        int nodefromfront = (myFirstLL.llLength - n + 1);
        node temp = myFirstLL.head;
        if (nodefromfront > myFirstLL.llLength || nodefromfront < 1) {
            return;
        }
        if (n == myFirstLL.llLength) { // head removal
            head = head.next;
            return;
        }
        if (n == 1) { // tail case
            removeLast();
            return;
        }
        for (int i = 1; i <= nodefromfront - 1; i++) {
            temp = temp.next;
            if (i == nodefromfront - 2) {
                if (temp.next != tail) {
                    node nxt = temp.next;
                    node nexter = nxt.next;
                    temp.next = nexter;
                }

            }
        }
    }

    public static node FindMid() {
        node slow;
        node fast = slow = myFirstLL.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isCycle() {
        node slow = head;
        node fast = head;

        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } else if (slow == fast) {
            return true;
        }
        return false;
    }

    public static boolean pallindrome() {

        boolean isPallindrome = true;
        if (head == null || head.next == null) {
            return true;
        }
        node ll = myFirstLL.head;
        node mid = FindMid();
        int midindx = llLength / 2;
        node prev = mid;
        node curr = prev.next;
        node NextNode = curr.next;
        prev.next = null;
        // rev
        int i = midindx;
        while (i < myFirstLL.llLength) {
            if (curr != tail) {
                curr.next = prev;
                prev = curr;// 20
                curr = NextNode; // 40
                NextNode = curr.next;// 100

                i++;
            } else {
                curr.next = prev;
                break;
            }

        }

        // check pallin
        int j = 0;
        node start = myFirstLL.head;
        node end = myFirstLL.tail;
        while (j < midindx) {
            if (start.data != end.data) {
                isPallindrome = false;
                return isPallindrome;
            }
            start = start.next;
            end = end.next;
            j++;

        }
        return isPallindrome;
    }

   

    public static void main(String[] args) {
        myFirstLL ll = new myFirstLL();
        // ll.removeFirst();
        ll.AddFirst(10);
        // ll.removeFirst();
        ll.AddLast(20);
        ll.AddLast(100);
        ll.AddLast(11);
        ll.AddLast(20);
        // ll.AddFirst(40);
        // ll.AddElementAtIndex(2, 40);
        ll.AddLast(10);
        System.out.println("Length : " + llLength);
        ll.printLL(ll);
        // System.out.println(SearchLL(50));
        // System.out.println(RecurvSearch(50, head, 0));
        ll.head = reversedList();
        printLL(ll);
        // ll.DeleteNthNodeFromEnd(1);
        printLL(ll);
        System.out.println(pallindrome() ? "true" : "false");
        System.out.println(isCycle() ? "true" : "false");
        ;
    }
}
