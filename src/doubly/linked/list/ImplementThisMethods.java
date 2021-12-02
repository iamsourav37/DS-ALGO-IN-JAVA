package doubly.linked.list;

public interface ImplementThisMethods {
    void addFirst(int data);
    void addLast(int data);
    void addAt(int index, int data) throws Exception;
    int deleteFirst() throws Exception;
    int deleteLast() throws Exception;
    int deleteAt(int index) throws Exception;
}
