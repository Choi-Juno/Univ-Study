package Stack;

public class Stack2ClsTest {
    public static void main(String[] args) {
        Stack2Cls stack = new Stack2Cls();

        stack.push(10);
        stack.stack();
        stack.push(20);
        stack.stack();
        stack.push(30);
        stack.stack();

        System.out.println("peek: " + stack.peek());
        stack.stack();
        System.out.println("pop: " + stack.pop());
        stack.stack();
        System.out.println("pop: " + stack.pop());
        stack.stack();
        System.out.println("is empty? : " + stack.isEmpty());
        System.out.println("is full? : " + stack.isFull());
        stack.stack();
    }
}
