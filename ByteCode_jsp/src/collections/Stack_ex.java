package collections;

import java.util.Stack;

public class Stack_ex {

	public static void main(String[] args) {
        Stack s =new Stack();
        s.push(10);
        s.push(80);
        s.push(40);
        s.push(50);
        System.out.println(s);
        System.out.println("pop "+s.pop());
        System.out.println("peek "+s.peek());
        System.out.println("search "+s.search(20));
        while(!s.isEmpty()){
        	System.out.println(s.pop());
        }
	}

}
