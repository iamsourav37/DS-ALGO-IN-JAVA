package singly.linked.list;

public class Runner {
    public static void main(String[] args) {
        SinglyLinkedList<String> strList = new SinglyLinkedList<>();

        strList.insertFirst("Sourav");
        strList.insertFirst("Ratul");
        strList.insertFirst("Arindom da");
        strList.show();
    }
}
