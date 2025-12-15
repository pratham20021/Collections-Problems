package Queue;

/* Implement priority scheduling using PriorityQueue */

import java.util.PriorityQueue;

public class Prog_2 {
    public static void main(String[] args) {

        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        tasks.add(3);
        tasks.add(1);
        tasks.add(4);
        tasks.add(2);

        while (!tasks.isEmpty()) {
            System.out.println("Processing task with priority " + tasks.poll());
        }
    }
}
