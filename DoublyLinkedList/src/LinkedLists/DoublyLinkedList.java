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

    public void insertion(int indis, int x) {
        Node element = new Node(x);

        if (head == null) {
            head = element;
            tail = element;
        } else if (head != null && indis == 0) {
            element.next = head;
            head.prev = element;
            head = element;
        } else {
            int linkedListCounter = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                linkedListCounter++;
            }

            temp = head;

            if (indis > linkedListCounter - 1) { // son indis'e eşitse yani tail'e ekleme yapıyorsak tail'in ilerisine ekleme yapacağız.
                tail.next = element;
                element.prev = tail;
                tail = element;
            } else {
                int i = 0;

                while (indis != i) {
                    temp = temp.next;
                    i++;
                }
                element.prev = temp.prev;
                temp.prev.next = element;
                element.next = temp;
                temp.prev = element;

            }
        }
    }

}
