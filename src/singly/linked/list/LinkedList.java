package singly.linked.list;

public interface LinkedList<E> {
    void insertFirst(E value);
    void insertLast(E value);
    void add(E value);
    void add(int index, E value) throws Exception;
    E deleteFirst();
    E deleteLast();
    E remove(int index);
    void remove(E value);
}
