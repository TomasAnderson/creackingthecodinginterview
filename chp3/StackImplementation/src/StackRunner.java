/**
 * Created by zhouyou on 13/11/16.
 */


class Stack {
    Node top;

    Object pop () {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node((Integer) item);
        t.next = top;
        top = t;
    }

    Object peek() {
        return top.data;
    }
}


class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}


public class StackRunner {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        System.out.println(s.peek());
    }
}
