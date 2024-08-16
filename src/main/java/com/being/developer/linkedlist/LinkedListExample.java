package com.being.developer.linkedlist;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("Linked List examples!");

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(10);
        customLinkedList.add(20);
        customLinkedList.add(30);
        customLinkedList.add(40);
        customLinkedList.add(50);

        System.out.println(customLinkedList.isEmpty());
        System.out.println(customLinkedList.size());

        customLinkedList.traverse();
        customLinkedList.remove(50); // 10
        System.out.println(customLinkedList.size());
        customLinkedList.traverse();

        customLinkedList.add(70);
        System.out.println(customLinkedList.size());
        customLinkedList.traverse();
    }
}
