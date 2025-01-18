package Stacks;

import java.util.ArrayList;

public class myStack {
    int topIndx = 0; 
    ArrayList<Integer> stackData;

    public void push(int data){
        stackData.add(topIndx,data);
        topIndx = topIndx +1;
    }

    public int TopAndPop(){
        if(isEmpty()){
            return -404;
        }
        int value = stackData.get(topIndx);
        stackData.remove(topIndx);
        topIndx = topIndx -1;
        return  value;
    }
    public void pop(){
        if(isEmpty()){
            return;
        }
        stackData.remove(topIndx);
        topIndx = topIndx -1;
    }
    public int Top(){
        int value = stackData.get(topIndx);
        return  value;
    }

    public int Size(){
        return topIndx+1;
    }

    public boolean isEmpty(){
        if(stackData.size() == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }



}
