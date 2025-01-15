package LinkedList;

public class LinkedListInt {
    int llLength = 0;
    NodeGeneric<Integer> head = new NodeGeneric<>();
    NodeGeneric<Integer> tail = head;

    LinkedListInt(Integer headData){
        head.data = headData;
        if(llLength ==0){
            llLength++;
        }
    }

    public NodeGeneric<Integer> GetHead(){
        return head;
    }

    public NodeGeneric<Integer> GetTail(){
        return tail;
    }

    public int GetLength(){
        return llLength;
    }

    public void AddNode(Integer Newdata){
        NodeGeneric<Integer> nd = new NodeGeneric<>(Newdata);
        if(head == null){
            head = tail = nd;
            llLength++;
        }
        if(head.next == null){
            head.next = nd;
            tail = nd;
            llLength++;
        }
        if(tail != head && tail !=null){
            tail.next = nd;
            tail = nd;
            llLength++;
        }

    }

    public void AddNodeToPosRec(NodeGeneric<Integer> myhead,Integer Newdatam ,int pos){
        
        if(pos > llLength){
            System.err.println("Pos out of bounds");
        }

        if(pos == 0){
        NodeGeneric<Integer> nd = new NodeGeneric<>(Newdatam);
        nd.next = myhead;
        head = nd;
        return;
        }

        if (pos == llLength) {
            NodeGeneric<Integer> nd = new NodeGeneric<>(Newdatam);
            tail.next = nd;
            tail = nd;
            return;
        }
       if(pos == 1){
        NodeGeneric<Integer> nd = new NodeGeneric<>(Newdatam);
        NodeGeneric<Integer> temp = myhead.next;
        myhead.next = nd;
        nd.next = temp;
        return;
       }
       
       AddNodeToPosRec(myhead.next, Newdatam, pos-1);

    }

    public void delatpos(NodeGeneric<Integer> myhead,int pos){

        if(pos > llLength){
            System.err.println("Pos out of bounds");
            return;
        }

        if(pos == 0){
            head = myhead.next;
            return;
        }
        if (myhead.next.next == null) {
            myhead.next = null;
            tail = myhead;
            return;
        }

        if(pos==1){
            myhead.next = myhead.next.next;
            return;
        }
        System.out.print(myhead.data);
        delatpos(myhead.next, --pos);
    }

    public NodeGeneric<Integer> reverseRec(NodeGeneric<Integer> head){
        if(head==null || head.next == null){
            return head;
        }
        NodeGeneric<Integer> endNode = reverseRec(head.next);
        
        System.out.println(endNode.data);
        System.out.println(head.data);
        head.next.next = head; 
        head.next = null;
        return endNode;
    }

    public void PrintLL(){
        NodeGeneric<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null \n");
    }

    public static void main(String[] args) {
        LinkedListInt ll = new LinkedListInt(10);
        ll.AddNode( 20);
        ll.AddNode( 30);
        ll.AddNode( 50);
        System.out.println("1 "+ll.head.data+" 2 "+ll.head.next.data+" 3 "+ll.head.next.next.data);
        //System.out.print(ll.tail.data);
        ll.AddNodeToPosRec(ll.head, 40, 2);
        ll.PrintLL();
        ll.reverseRec(ll.head);
        ll.PrintLL();
    }


}
