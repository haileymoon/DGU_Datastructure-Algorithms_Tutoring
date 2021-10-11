package Stack;

import java.util.Stack;
/***
 * example main of using stack library
*/
public class stackClassStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
        
        System.out.println("size: "+ stack.size());
        System.out.println(stack.toString());

        stack.pop();
        stack.pop();

        System.out.println("size: "+ stack.size());
        System.out.println(stack.toString());    
    }
}
