package Queue;

public class LLQueue {
    NodeGeneric<Integer> head = new NodeGeneric<>();
    NodeGeneric<Integer> tail = new NodeGeneric<>();
    
    int QueueSize = 0;

    public LLQueue() {
        tail = head;
    }

    
    public void Enqueue(Integer Datam){
        
        if(QueueSize == 0){
            head.data = Datam;
            QueueSize++;
        }else{
            NodeGeneric<Integer> nd = new NodeGeneric<>(Datam);
            tail.next = nd;
            tail = nd;
            QueueSize++;

        }
    }

    public Integer Dequeue(){
        Integer val = head.data;
        NodeGeneric<Integer> temphead = new NodeGeneric<>();
        temphead = head;
        head = head.next;
        temphead.next = null;
        QueueSize--;
        return val;
    }
}
