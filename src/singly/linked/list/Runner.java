package singly.linked.list;

public class Runner {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList<String> strList = new SinglyLinkedList<>();

        strList.insertFirst("Sourav");
        strList.insertFirst("Ratul");
        strList.insertFirst("Arindom");
        strList.insertLast("Amartya");

        strList.add(3, "Rocket");
        strList.add(1, "Animesh");
        strList.show();

        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();

        intList.insertFirst(12);
        intList.insertFirst(21);
        intList.insertFirst(31);
        intList.insertLast(99);
        intList.add(3, 333);
        System.out.println("Int list size : "+ intList.size());
        intList.add(0, 4545);

        System.out.println(intList.deleteFirst());
        intList.show();
    }
}
