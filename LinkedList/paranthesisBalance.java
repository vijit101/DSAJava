package LinkedList;

import java.util.Stack;

public class paranthesisBalance {

    public static void main(String[] args) {
        Stack<Integer> extra = new Stack<>();
        Stack<Integer> inpt = new Stack<>();
        inpt.push(3);
        inpt.push(2);
        inpt.push(1); 
        String str = "}{}";
        //System.out.println(isBalanced(str));
        reverseStack(inpt, extra);
        while(!inpt.isEmpty()){
            System.out.println(inpt.pop());
        }
        


    }

    public static boolean isBalanced(String expression) {
        //Your code goes here
        if (expression.isEmpty() || expression == null) {
            return true;
        }
        Stack<Character> charStack = new Stack<>();
        int i = 0;
        while (i < expression.length()) {
            char ithChar = expression.charAt(i);
            if (ithChar == '{' || ithChar == '(' || ithChar == '[') {
                charStack.push(ithChar);
            } else {
                if(!charStack.isEmpty()){
                    char topChar = charStack.peek();
                    if ((ithChar == '}' && topChar == '{') || 
                        (ithChar == ')' && topChar == '(') || 
                        (ithChar == ']' && topChar == '[')) {
                        charStack.pop(); // Pop matching opening bracket
                    } else {
                        return false; // Mismatched brackets
                    }
                }else{
                    return false;
                }

               

            }
            i++;
        }
        return charStack.isEmpty();
    }



    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here

        if(input.isEmpty()){
            return;
        }
        int elem = input.pop();
        
        reverseStack(input, extra);

        if(input.isEmpty()){
            input.push(elem);
        }else{
            while(!input.isEmpty()){
                extra.push(input.pop());
            }
            input.push(elem);
            while(!extra.isEmpty()){
                input.push(extra.pop());
            }

        }

	}
}
