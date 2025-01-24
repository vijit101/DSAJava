package Queue;

import java.util.Queue;
import java.util.Stack;

public class RevQueue {

    public static void main(String[] args) {
        
    }


    public static void reverseQueue1(Queue<Integer> input) {
		//Your code goes here
        Stack<Integer> stck = new Stack<Integer>();
		while(!input.isEmpty()){
			Integer val = input.poll();
            stck.push(val);
		}

        while(!stck.isEmpty()){
			Integer val = stck.pop();
            input.add(val);
		}

	}


    public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here

        if(input.size()<=1){
            return;
        }

        int firstElem = input.poll();
        reverseQueue(input);
        input.add(firstElem);
	}
}
