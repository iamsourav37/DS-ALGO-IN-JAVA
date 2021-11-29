package singly.linked.list;

public class Runner {
    public static void main(String[] args) {
        SinglyLinkedList<String> strList = new SinglyLinkedList<>();

        strList.insertFirst("Sourav");
        strList.insertFirst("Ratul");
        strList.insertFirst("Arindom da");
        strList.insertLast("Amartya");
        strList.show();

        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();

        intList.insertFirst(12);
        intList.insertFirst(21);
        intList.insertFirst(31);
        intList.insertLast(99);
        intList.show();
    }
}
