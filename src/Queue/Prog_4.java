package Queue;
/* Find front and rear elements of a Queue */
import java.util.LinkedList;
import java.util.Queue;

public class Prog_4 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        Integer front = queue.peek();
        Integer rear = ((LinkedList<Integer>) queue).getLast();

        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);
    }
}
