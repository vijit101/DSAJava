package LinkedList;

public class LinkedListInt {
    int llLength = 0;
    NodeGeneric<Integer> head = new NodeGeneric<>();
    NodeGeneric<Integer> tail = head;

    LinkedListInt(Integer headData){
        head.data = headData;
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
        }
        if(head.next == null){
            head.next = nd;
            tail = nd;
        }
        if(tail != head && tail !=null){
            tail.next = nd;
            tail = nd;
        }

    }

    public static void main(String[] args) {
        LinkedListInt ll = new LinkedListInt(10);
        ll.AddNode( 20);
        ll.AddNode( 30);
        System.out.println("1 "+ll.head.data+" 2 "+ll.head.next.data+" 3 "+ll.head.next.next.data);
        

    }


}
