package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("철수");
        queue.add("경수");
        queue.add("정수");

        while (!queue.isEmpty()) {
            System.out.println("Next: " + queue.poll());
        }
        System.out.println("End!!!");
    }
}
