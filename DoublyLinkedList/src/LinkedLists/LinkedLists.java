package LinkedLists;

public class LinkedLists {
    Node head = null;
    Node tail = null;

    void basaEkle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }
}
