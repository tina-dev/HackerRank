package net.tina.HackerRank;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomQueue<Item> implements Iterable<Item> {
    private int size;
    private Item[] items;
    private int first;
    private int last;

    private void resize(int capacity) {
        assert capacity >= size;
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = items[(first + i) % items.length];
        }

        items = temp;

        first = 0;
        last  = size;
    }

    public RandomQueue() {
        this(2);
    }

    public RandomQueue(int capacity) {
        items = (Item[])new Object[capacity];
        size = 0;
        first = 0;
        last = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //adding an element
    public void enqueue(Item item) {
        if (size == items.length) {
            resize(items.length * 2);
        }

        items[last++] = item;

        if (last == items.length) {
            last = 0;
        }

        size++;
    }
    //removing an element
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        Item item = items[first];
        items[first] = null;
        size--;
        first++;

        if (first == items.length) {
            first = 0;
        }

        if (size > 0 && size == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    private void swap(int left, int right) {
        Item temp = items[right];
        items[right] = items[left];
        items[left] = temp;
    }


    public Item sample() {
        if (isEmpty())
            throw new java.util.NoSuchElementException();

        int index = (int) (Math.random() * size);
        return items[index];
    }

    public int size() {
        return size;
    }

    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int i = 0;
        public boolean hasNext()  {
            return i < size;
        }
        public void remove()      {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = items[(i + first) % items.length];
            i++;

            return item;
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Item item : this) {
            str.append(item);
            str.append(' ');
        }
        return str.toString();
    }


    public static void main(String[] args) {
        RandomQueue<String> queue = new RandomQueue<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");


        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());

        queue.enqueue("h");
        queue.enqueue("i");
        System.out.println("enqueue: h");
        System.out.println("enqueue: i" );

        System.out.println("Print Queue: " + queue.toString());

    }
}