import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class DSAPrioQueue {
    public static void main(String [] args){


        Queue<Double> queue = new PriorityQueue<>();
        queue.offer(3.0);
                queue.offer(2.0);

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}
