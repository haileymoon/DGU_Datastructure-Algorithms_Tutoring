package Stack;

import java.util.NoSuchElementException;

/**
 * linkedListStack
 */
public class linkedListStack {

    // Create Node that has a data, and the next node
    private static class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    
    public Object pop(){
        if(top == null) 
            throw new NoSuchElementException();
        Object item = top.data;
        top = top.next;

        return item;
    }
    
    public void push(Object item){
        Node new_node = new Node(item);
        new_node.next = top;
        top = new_node;
    }

    public Object peek() {
        if(top == null){
            throw new NoSuchElementException();
        } return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
    
}