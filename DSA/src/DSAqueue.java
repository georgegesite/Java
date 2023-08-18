import java.util.Queue;
import java.util.LinkedList;

public class DSAqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Using the Queue interface

        queue.offer(10); // Enqueue
        queue.offer(20);
        queue.offer(30);

        System.out.println("Size of queue: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued: " + queue.poll());
        System.out.println("Dequeued: " + queue.poll());

        System.out.println("Size of queue: " + queue.size());
    }
}