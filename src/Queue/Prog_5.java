package Queue;

//Implement Queue using LinkedList

import java.util.LinkedList;
import java.util.Queue;

public class Prog_5 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue);

        int removed = queue.poll();
        System.out.println(removed);

        System.out.println(queue);
    }
}
