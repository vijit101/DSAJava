package Stacks;


public class LLStacks<T> {
    private NodeGeneric<T> head = new NodeGeneric();
    private NodeGeneric<T> prevTop = new NodeGeneric();
    private NodeGeneric<T> topPointer = new NodeGeneric();
    int llLength = 0;


    public LLStacks() {
        prevTop = head;
        topPointer = head;
    }
   

    public int size(){
        return llLength;
    }

    public boolean  isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(T elem){
        if(isEmpty()){
            head.data = elem;
        }
        else{
            NodeGeneric<T> nd = new NodeGeneric();
            nd.data = elem;
            topPointer.next = nd;
            prevTop = topPointer;
            topPointer = nd;
        }

    }

    public T pop(){
        T temp = topPointer.data;
        
        prevTop.next = null;
        topPointer = prevTop;
        prevTop = GetPReviousTop(head);
        return temp;
    }

    private NodeGeneric<T> GetPReviousTop(NodeGeneric<T> head){
        NodeGeneric<T> pT= new NodeGeneric<>();
        while(head.next != null){
            head = head.next;
            pT = head;
        }
        return pT;
    }

}
