package com.being.developer.linkedlist;

import java.util.Objects;

public class CustomLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CustomLinkedList() {
    }

    public void addAt(T value, int position) {
        Node<T> newNode = new Node<>(value);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node<T> currentNode = head;
        for (int i = 0; i < position - 1; i++) {
            currentNode = currentNode.next;
        }
        Node<T> temp = currentNode.next;
        currentNode.next = newNode;
        newNode.next = temp;
        size++;
        return;
    }

    public void add(T value) {

        if (Objects.isNull(head)) {
            head = new Node<>(value);
            tail = head;
            size++;
            return;
        }
        tail.next = new Node<>(value);
        tail = tail.next;
        size++;
    }

    public void removeAt(int position) {

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        Node<T> currentNode = head;
        for (int i = 0; i < position - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        size--;
        return;
    }

    public void remove(T value) {
        if (head.value.equals(value)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        Node<T> prevNode = null;

        while (Objects.nonNull(current)) {
            if (current.value.equals(value)) {
                prevNode.next = current.next;
                // tail element is being removed then prevNode will be tail now.
                if (Objects.isNull(current.next)) {
                    tail = prevNode;
                }
                size--;
                break;
            }
            prevNode = current;
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void traverse() {
        Node<T> current = head;
        while (Objects.nonNull(current)) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}

class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}
