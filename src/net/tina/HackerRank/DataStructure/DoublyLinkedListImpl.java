package net.tina.HackerRank.DataStructure;

import java.util.Arrays;

public class DoublyLinkedListImpl {
    private DoubleNode head;
    private DoubleNode tail;
    private int length;

    public DoublyLinkedListImpl(int value) {
        head = new DoubleNode(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        DoubleNode newNode = new DoubleNode(value);
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        DoubleNode newNode  = new DoubleNode(value);
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }

    public int[] printList() {
        int [] array = new int [length];
        DoubleNode currentNode = this.head;
        int i = 0;
        while(currentNode != null) {
            array[i] = currentNode.value;
            currentNode = currentNode.next;
            i++;
        }
        return array;
    }

    public void insert(int index, int value) {
        if(index < 0 || index > length) {
            System.out.println("Index Out Of Bounds For Length" + length);
        }
        else if (index == 0) {
            prepend(value);
        }
        else if(index == length) {
            append(value);
        }
        else {
            DoubleNode current = head;
            for(int i = 0; i < index  - 1; i++) {
                current = current.next;
            }
            DoubleNode newNode = new DoubleNode(value);
            newNode.next = current.next;
            current.next = newNode;
            newNode.previous = current;
            newNode.next.previous = newNode;
            length++;
        }
    }

    public static void main(String [] args) {
        DoublyLinkedListImpl myDoublyLinkedList = new DoublyLinkedListImpl(10);
        myDoublyLinkedList.append(5);
        myDoublyLinkedList.append(40);
        myDoublyLinkedList.prepend(1);
        System.out.println(Arrays.toString(myDoublyLinkedList.printList()));
    }


}
