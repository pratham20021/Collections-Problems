package Queue;

//Generate first n numbers using Queue
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Prog_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue :");
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + " ");
        }
    }
}
