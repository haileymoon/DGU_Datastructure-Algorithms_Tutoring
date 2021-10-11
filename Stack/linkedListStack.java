package Stack;

import java.util.NoSuchElementException;

/**
 * make stack using linkedList
 */
public class linkedListStack {

    // Create Node that has a data, and the next node
    private static class Node{
        private char data;
        private Node next;

        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top;

    public char pop(){
        if(top == null) 
            throw new NoSuchElementException();
        char item = top.data;
        top = top.next;

        return item;
    }
    
    public void push(char item){
        Node new_node = new Node(item);
        new_node.next = top;
        top = new_node;
    }

    public char peek() {
        if(top == null){
            throw new NoSuchElementException();
        } return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    
}