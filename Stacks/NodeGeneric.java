package Stacks;

public class NodeGeneric<T> {
    public T data;
    public NodeGeneric<T> next;


    public NodeGeneric(){
        
    }

    public NodeGeneric(T myData) {
        this.data = myData;
    }

    // public void AddNewNode(NodeGeneric<T> head , T Newdata){
    //     NodeGeneric<T> nd = new NodeGeneric<T>();
    //     nd.data = Newdata;
    // }
}

