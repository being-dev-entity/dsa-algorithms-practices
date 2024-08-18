package com.being.developer.linkedlist;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("Linked List examples!");

        System.out.println("Add some elements in linked list");

        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(10);
        customLinkedList.add(20);
        customLinkedList.add(30);
        customLinkedList.add(40);
        customLinkedList.add(50);

        System.out.println("Empty: " + customLinkedList.isEmpty());
        System.out.println("Size: " + customLinkedList.size());
        System.out.println("Elements:");
        customLinkedList.traverse();

        System.out.println("Remove head case:");
        customLinkedList.remove(10); // 10
        System.out.println("Size: " + customLinkedList.size());
        System.out.println("Elements:");
        customLinkedList.traverse();

        System.out.println("Add a new element:");
        customLinkedList.add(70);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        System.out.println("Remove middle case:");
        customLinkedList.remove(30);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        System.out.println("Remove tail case:");
        customLinkedList.remove(70);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        System.out.println("***Index based add ****");

        customLinkedList.add(60);

        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        // add at last
        customLinkedList.addAt(70, 4);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        // add at middle
        customLinkedList.addAt(111, 2);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        // add at start
        customLinkedList.addAt(222, 0);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        System.out.println("***Index based remove****");

        // remove at top
        customLinkedList.removeAt(0);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        // remove at middle
        customLinkedList.removeAt(2);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        // add at last
        customLinkedList.removeAt(4);
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();

        System.out.println("***Reverse Linked List****");
        customLinkedList.reverse();
        System.out.println("Size: " + customLinkedList.size());
        customLinkedList.traverse();
    }
}
