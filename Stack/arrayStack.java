package Stack;

/**
 * make stack using array
 * Not efficient compared to linked list
 */
public class arrayStack {
    private int top;
    private int size;
    private char array[];

    public arrayStack(int size){
        this.top = -1;
        this.size = size;
        this.array = new char[this.size];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size-1);
    }

    public void push(char item){
        if(isFull()){
            System.out.println("Cannot push, already Full!");
        }
        else
            array[++top] = item;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Nothing to pop");
            return 0;
        }
        else{
            char pop_item = array[top--];
            return pop_item;
        }
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }
        else
            return array[top];
        return 0;
    }
}
