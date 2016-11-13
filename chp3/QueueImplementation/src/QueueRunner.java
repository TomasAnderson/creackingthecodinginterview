/**
 * Created by zhouyou on 13/11/16.
 */
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

class Queue {
    Node first, last;
    void enqueue(Object item) {
        if (first == null) {
            last = new Node((Integer) item);
            first = last;
        } else {
            last.next = new Node((Integer) item);
            last = last.next;
        }
    }

    Object dequeue() {
        if (first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }

}


public class QueueRunner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.print(q.dequeue());
    }
}
