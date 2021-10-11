package Stack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(checkBrackets.checkBracket(input));
        scanner.close();
    }
}
