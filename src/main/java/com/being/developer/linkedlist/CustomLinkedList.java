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

    public void reverse() {
        // Linked list keep tail as well so re-assiging it the new changed tail end.
        tail = head;
        // starting from second element.
        Node<T> current = head.next;
        Node<T> prevNode = head;
        // head will be tail now so pointing to null;
        prevNode.next = null;

        while (current != null) {
            Node<T> next = current.next; // to keep next node ref for iteration.
            current.next = prevNode;
            prevNode = current;
            current = next;
        }
        // Current start pointing to null at the end of linked list.
        // therefore prevNode will be head then.
        head = prevNode;
    }

}

class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node<T> other = (Node) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (next == null) {
            if (other.next != null)
                return false;
        } else if (!next.equals(other.next))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]";
    }

}
