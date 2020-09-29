package net.tina.HackerRank.DataStructure;

import java.util.Arrays;

public class LinkedListImpl {
    private Node head;
    private Node tail;
    private int length;

    public LinkedListImpl(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }

    public int[] printList() {
        int [] array = new int [length];
        Node currentNode = this.head;
        int i = 0;
        while(currentNode != null) {
            array[i] = currentNode.value;
            currentNode = currentNode.next;
            i++;
        }
        return array;
    }

    public void insert(int index, int value) {
        //check params
        if(index < 0 || index > length) {
            System.out.println("Index Out Of Bounds For Length " + length);
        }
        else if(index == 0) {
            prepend(value);
        }
        else if(index == value) {
            append(value);
        }
        else {
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(value);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            length++;
        }
    }

    public void remove(int index) {
        if(index < 0 || index > length) {
            System.out.println("Index Out Of Bounds For Length " + length);
        }
        else if(index == 0) {
            head = this.head.next;
            length--;
        }
        else {
            Node currentNode = head;
            int i;
            for(i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            length--;
            if(i == length-1) {
                tail = currentNode;
            }
        }
    }

    public LinkedListImpl reverse(LinkedListImpl linkedList) {
        LinkedListImpl newList = new LinkedListImpl(linkedList.head.value);
        Node current = linkedList.head;
        while (current.next != null) {
            current = current.next;
            Node newNode = new Node(current.value);;
            newNode.next = newList.head;
            newList.head = newNode;
            newList.length++;
        }
        return newList;
    }






    public static void main(String [] args) {
        LinkedListImpl linkedList = new LinkedListImpl(10);
        linkedList.append(12);
        linkedList.prepend(1);
        linkedList.prepend(4);
        linkedList.append(8);
        linkedList.insert(2, 66);
        linkedList.remove(3);
        System.out.println(Arrays.toString(linkedList.printList()));

        LinkedListImpl linkedList1 = linkedList.reverse(linkedList);
        System.out.println("reverse LinkedList: " + Arrays.toString(linkedList1.printList()));


    }
}
