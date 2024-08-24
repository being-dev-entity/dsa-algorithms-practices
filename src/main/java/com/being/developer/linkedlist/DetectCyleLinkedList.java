package com.being.developer.linkedlist;

public class DetectCyleLinkedList {
    public static void main(String[] args) {
        CylicLinkedList cylicLinkedList = new CylicLinkedList();
        cylicLinkedList.buildDummyIntegerLinkedList();
        Node<Integer> meetNode = detectCycle(cylicLinkedList);

        System.out.println("Has Cycle and its meeting node is: " + meetNode.value);

        Node<Integer> firstNode = detectFirstNode(cylicLinkedList);
        System.out.println("Has Cycle and its fist node is: " + firstNode.value);

    }

    public static Node<Integer> detectCycle(CylicLinkedList cylicLinkedList) {
        Node<Integer> slow = cylicLinkedList.getHead();
        Node<Integer> fast = cylicLinkedList.getHead();

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return slow;
            }
        }

        return null;
    }

    public static Node<Integer> detectFirstNode(CylicLinkedList cylicLinkedList) {
        Node<Integer> meetNode = detectCycle(cylicLinkedList);
        Node<Integer> startNode = cylicLinkedList.getHead();
        while (meetNode != startNode) {
            meetNode = meetNode.next;
            startNode = startNode.next;
        }
        return startNode;
    }
}
