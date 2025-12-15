package Queue;

//Implement FIFO order processing using Queue

import java.util.LinkedList;
import java.util.Queue;

public class Prog_1 {
    public static void main(String[] args) {

        Queue<String> orders = new LinkedList<>();

        orders.add("Order-101");
        orders.add("Order-102");
        orders.add("Order-103");
        orders.add("Order-104");

        while (!orders.isEmpty()) {
            String order = orders.poll();
            System.out.println("Processing " + order);
        }
    }
}
