public class Main {
    public static void main(String[] args) {
        ListStructure linkedList = new ListStructure();

        linkedList.add(44);
        linkedList.add(46);
        linkedList.add(34);
        linkedList.add(24);
        linkedList.addHead(1);
        linkedList.addTail(33);
        linkedList.insertion(0, 2);
        linkedList.removeHead();
        linkedList.removeTail();
        linkedList.deleteInsertion(2);

        linkedList.print();
    }
}
