package LinkedLists;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    public void addHead(int data) {
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

    public void addTail(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }

   public void write() {
        Node temp = head;
        if (head == null) {
            System.out.println("Bağlı liste boş.");
            return;
        }
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            if (temp == null) {
                System.out.println("null");
            }
        }
    }

    public void endWrite() {
        Node temp = tail;
        if (temp == null) {
            System.out.println("Bağlı liste boş.");
            return;
        }
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
            if (temp == null) {
                System.out.println("null");
            }
        }
    }
    
}
