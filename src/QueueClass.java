import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        PriorityQueue<Persom> queuePerson = new PriorityQueue<>(queue);
        queue.add(new Student(3, "Esma"));
        queue.add(new Student(1, "Esma1"));
        queue.add(new Student(2, "Esma2"));


        ArrayDeque<Student> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(new Student(3, "Esma"));
        arrayDeque.add(new Student(1, "Esma1"));
        arrayDeque.add(new Student(2, "Esma2"));
        arrayDeque.add(new Student(4, "Esma3"));
        System.out.println(arrayDeque);
        PriorityQueue<Integer> queueInteger = new PriorityQueue<>();
        queueInteger.add(3);
        queueInteger.add(1);
        queueInteger.add(2);
        System.out.println(queueInteger);
            System.out.println(queue.peek());
            System.out.println(queueInteger.peek());
//
//        PriorityQueue<String> pq = new PriorityQueue<>();
//        pq.add("apple");
//        pq.add("banana");
//        pq.add("cherry");
//        System.out.println(pq);
//        System.out.println("pq: " + pq.comparator());
//        PriorityQueue<String> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
//        pq1.add("apple");
//        pq1.add("banana");
//        pq1.add("cherry");
//        System.out.println(pq1);
//        System.out.println("pq1: " + pq1.comparator());


//        Comparator<String> comparator = Comparator.reverseOrder();
//        PriorityQueue<String> pq = new PriorityQueue<>(comparator);
//        pq.add("apple");
//        pq.add("banana");
//        pq.add("cherry");
//        System.out.println(pq);
    }
}
