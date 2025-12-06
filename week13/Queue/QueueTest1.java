package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("홍길동");
        queue.offer("김철수");
        queue.offer("이영희");

        System.out.println("현재 큐: " + queue);
        System.out.println("peek: " + queue.peek());
        System.out.println("poll: " + queue.poll());
        System.out.println("poll: " + queue.poll());
        System.out.println("is empty? : " + queue.isEmpty());
        System.out.println("remain queue: " + queue);
    }
}
