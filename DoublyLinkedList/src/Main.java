import LinkedLists.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addHead(1);
        doublyLinkedList.addTail(2);
        doublyLinkedList.write();
        doublyLinkedList.endWrite();
        doublyLinkedList.insertion(3, 5);
        doublyLinkedList.write();
        doublyLinkedList.insertion(1,10);
        doublyLinkedList.write();
    }

}
