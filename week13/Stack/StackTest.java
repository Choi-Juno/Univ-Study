package Stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("스택 내용: " + stack);

        System.out.println("peek: " + stack.peek());

        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());

        System.out.println("is empty? : " + stack.isEmpty());

        System.out.println("remain stack: " + stack);
    }
}
