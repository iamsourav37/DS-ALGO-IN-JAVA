package doubly.linked.list;

public class Runner {
    public static void main(String[] args) throws Exception {
        System.out.println("Doubly Linked List");

        DoublyLinkedList dlist = new DoublyLinkedList();

        dlist.addFirst(12);
        dlist.addFirst(21);
        dlist.addLast(1212);
        dlist.addFirst(7);
        dlist.addFirst(9);

        dlist.addLast(33);
        System.out.println(dlist.deleteLast());
        System.out.println(dlist.deleteFirst());
        System.out.println(dlist.deleteLast());
        dlist.addAt(2, 111);
        dlist.addAt(1, 3333);
        dlist.addAt(4, 55);
        dlist.addAt(3, 3030);

        System.out.println(dlist.deleteAt(1));
        System.out.println(dlist.deleteAt(3));

        dlist.show();
    }
}
