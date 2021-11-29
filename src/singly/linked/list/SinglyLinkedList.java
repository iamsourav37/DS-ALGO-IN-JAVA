package singly.linked.list;



public class SinglyLinkedList<E> implements LinkedList<E> {
    private int size;
    private Node<E> head;

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }

    @Override
    public void insertFirst(E value) {
        this.head = new Node<>(value, this.head);
        this.size++;
    }

    @Override
    public void insertLast(E value) {
        if(this.head == null){
            insertFirst(value);
            return;
        }
        Node<E> node = new Node<>(value, null); // next is null because it is the last node
        Node<E> temp, prev;
        temp = prev = this.head;

        while(temp != null){
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(node);
        this.size++;
    }

    @Override
    public void add(E value) {

    }

    @Override
    public void add(int index, E value) {

    }

    @Override
    public E deleteFirst() {
        return null;
    }

    @Override
    public E deleteLast() {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void remove(E value) {

    }

    public void show(){
        if(this.head==null){
            System.out.println("List is empty");
            return;
        }

        StringBuilder listElements = new StringBuilder();
        Node<E> temp = this.head;
        while(temp!=null){
            listElements.append(temp.getValue()).append(" ---> ");
            temp = temp.getNext();
        }
        listElements.append("NULL");
        System.out.println(listElements);
    }
}