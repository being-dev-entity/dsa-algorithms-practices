package com.being.developer.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExmaple {
    public static void main(String[] args) {
        createQueue();
        System.out.println("==========Operations===========================");
        queueOperations();
        queuePriority();
    }

    public static void createQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Abhay");
        queue.add("Rahul");
        queue.add("Rohit");
        queue.add("Sachin");
        queue.add("Virat");
        System.out.println("Queue: " + queue);
        System.out.println("Head: " + queue.peek());
        System.out.println("Element: " + queue.element());
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.offer("Abhay");
        queue2.offer("Rahul");
        queue2.offer("Rohit");
        queue2.offer("Sachin");
        queue2.offer("Virat");
        System.out.println("Queue2: " + queue2);
        System.out.println("Head: " + queue.peek());
        System.out.println("Element: " + queue.element());
    }

    public static void queueOperations() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Abhay");
        queue.offer("Rahul");
        queue.offer("Rohit");
        queue.offer("Sachin");
        queue.offer("Virat");
        System.out.println("Queue: " + queue);
        System.out.println("Head: " + queue.peek());
        System.out.println("Element: " + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Head: " + queue.peek());
        // remove all.
        while (queue.poll() != null) {
            System.out.println("Queue: " + queue);
        }
        // example quque will sorted alpahebatically.
        queue.offer("abc1");
        queue.offer("aaa");
        System.out.println("Queue: " + queue);
        System.out.println("Head: " + queue.peek());

        queue.remove();
        System.out.println("Queue: " + queue);
        queue.remove();
        System.out.println("Queue: " + queue);
        // will throw exception as queue is empty.
        // queue.remove();
    }

    public static void queuePriority() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(15);
        queue.offer(50);
        queue.offer(25);
        System.out.println("Queue: " + queue);
        // Queue: [10, 20, 15, 50, 25]
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer(10);
        queue2.offer(20);
        queue2.offer(15);
        queue2.offer(50);
        queue2.offer(25);
        System.out.println("Queue2: " + queue2);
        // Queue2: [50, 25, 15, 10, 20]
        PriorityQueue<String> queue3 = new PriorityQueue<>();
        queue3.offer("abc");
        queue3.offer("aaa");
        queue3.offer("ccc");
        queue3.offer("bbb");
        queue3.offer("cab");
        queue3.offer("bca");
        System.out.println("Queue3: " + queue3);
        // Queue3: [aaa, abc, bca, bbb, cab, ccc]

        PriorityQueue<Integer> queue4 = new PriorityQueue<>();
        queue4.add(10);
        queue4.offer(20);
        queue4.offer(15);
        queue4.offer(50);
        queue4.offer(25);
        System.out.println("Queue4: " + queue4);


        Queue<String> queue5 = new LinkedList<>();
        queue5.offer("A");
        queue5.offer("C");
        queue5.offer("B");
        queue5.offer("F");
        queue5.offer("D");
        System.out.println("Queue5: " + queue5);
        // Queue5: [A, C, B, F, D]

        Queue<String> queue6 = new PriorityQueue<>();
        queue6.offer("A");
        queue6.offer("C");
        queue6.offer("B");
        queue6.offer("F");
        queue6.offer("D");
        System.out.println("Queue6: " + queue6);
        // Queue6: [A, C, B, F, D]
    }

}
