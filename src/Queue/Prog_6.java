package Queue;
/* PriorityQueue sorting example */
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Prog_6 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(78, 12, 45, 3, 89, 26);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(list);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
