package Stack;

/**
 * bracket types: (),{}, []
 */
public class checkBrackets {
    public static boolean checkBracket(String input){
        linkedListStack stack = new linkedListStack();
        boolean wrongflag = false;
        int loop_count = 0;
        for(char c : input.toCharArray()){
            ++loop_count;
            switch(c){
                case '(': 
                case '{': 
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || (stack.pop()) != '(') {
                        wrongflag = true;
                    }
                    break;

                case '}':
                    if (stack.isEmpty() || (stack.pop()) != '{') {
                        wrongflag = true;
                        }
                    break;

                case ']':
                    if (stack.isEmpty() || (stack.pop()) != '[') {
                        wrongflag = true;
                    }
                    break;    
                }
            if(wrongflag) break;
        }
        if(stack.isEmpty() && loop_count == input.toCharArray().length){
            System.out.println("괄호 쌍 매칭 성공!");
            return true; 
        }
        else {
            System.out.println("괄호 쌍 매칭 실패!");
            return false; 
        }

    }
}
