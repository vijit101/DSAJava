package Queue;

import java.util.ArrayList;

public class customQueue {
    ArrayList<Integer> data = new ArrayList<>();
    int endIndx = -1;
    int frontIndex = 0;

    public void Enqueue(int datam){
        data.add(datam);
        endIndx++;
    }

    public Integer Dequeue(){
        Integer val = -404;
        if(!data.isEmpty()){
            val = data.get(frontIndex);
            data.remove(frontIndex);   
            endIndx--;     
        }else{
            System.out.print("Empty queue error ");
        }
        return val;
       
    }

    public static void main(String[] args) {
        customQueue Que = new customQueue();
        Que.Enqueue(20);
        Que.Enqueue(30);
        System.out.println(Que.Dequeue());
        System.out.println(Que.Dequeue());
        System.out.println(Que.Dequeue());
    }

}
