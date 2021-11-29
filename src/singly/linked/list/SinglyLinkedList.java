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
    public void add(E value) { // added at last
        insertLast(value);
    }

    @Override
    public void add(int index, E value)throws Exception{
//        first check index is valid or not
        if(index<0 || index>=this.size){
            throw new Exception(index+" Index is out of range");
        }else if(index == 0){
            insertFirst(value);
            return;
        }
//
        Node<E> temp = this.head;
        int counter = 0;

        while(index-1 != counter){
            counter++;
            temp = temp.getNext();
        }
        Node<E> node = new Node<>(value, temp.getNext());
        temp.setNext(node);
        this.size++;
    }

    @Override
    public E deleteFirst() {
        if(this.head == null){
//          you may throw exception here

            System.out.println("List is empty");
            return null;
        }
        E value = this.head.getValue();
        this.head = this.head.getNext();
        this.size--;
        return value;
    }

    @Override
    public E deleteLast() {
        if(this.head == null){
//          you may throw exception here
            System.out.println("List is empty");
            return null;
        }else if(this.size == 1){
            E value = this.head.getValue();
            this.head = null;
            return value;
        }

        Node<E> temp, prev;
        temp = prev = this.head;

        while(temp.getNext() != null){
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
        this.size--;
        return temp.getValue();
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
