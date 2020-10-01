package net.tina.HackerRank.DataStructure;
//LinkedList
public class StackImpl {
    private Node top;
    private Node bottom;
    private int length;


    public StackImpl() {
        top = null;
        bottom = null;
        length = 0;
    }

    public String peek()
    {
        if(length > 0) {
            return String.valueOf(top.value);
        }
        return null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            top = newNode;
            bottom = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
        this.length++;
    }

    public void pop() {
        if(length > 0) {
            top = top.next;

            if(length == 1) {
                bottom = null;
            }
            length--;
        }

    }

    public String getLastElement() {
        if(length > 0) {
            return String.valueOf(bottom.value);
        }
        return null;
    }


    public static void main(String [] args) {

        StackImpl queue = new StackImpl();
        queue.push(3);
        queue.push(6);
        queue.push(5);
        queue.push(9);
        queue.pop();
        queue.pop();
        System.out.println(queue.peek());
        //System.out.println(queue.getLastElement());
    }
}