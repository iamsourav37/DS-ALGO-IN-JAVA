package doubly.linked.list;

public class DoublyLinkedList implements ImplementThisMethods{
    private Node head;
    private int size;

    public DoublyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int getSize(){ return this.size; }

    @Override
    public void addFirst(int data) {
        this.head = new Node(data, null, this.head);
        this.size++;
    }

    @Override
    public void addLast(int data) {
        if(this.head == null){
            this.addFirst(data);
            return;
        }

        Node iter = this.head;
        while(iter.getNext() != null){
            iter = iter.getNext();
        }
        Node newNode = new Node(data, iter, null);
        iter.setNext(newNode);
        this.size++;
    }

    @Override
    public void addAt(int index, int data) throws Exception {
//        first verify the index
        if(index<0 || index>=this.size){
            throw new Exception("Invalid index");
        }else if(index == 0){
            this.addFirst(data);
            return;
        }

        Node iter = this.head;
        int counter = 0;

        while(counter != index-1){
            iter = iter.getNext();
            counter++;
        }

        Node newNode = new Node(data, iter, iter.getNext());
        iter.getNext().setPrev(newNode);
        iter.setNext(newNode);
        this.size++;
    }

    @Override
    public int deleteFirst() throws Exception {
        if(this.head == null){
            throw new Exception("List is null");
        }
        Node deletedNode = this.head;
        this.head = this.head.getNext();
        this.head.setPrev(null);
        this.size--;
        return deletedNode.getData();
    }

    @Override
    public int deleteLast() throws Exception {
        if(this.head == null){
            throw new Exception("List is null");
        }else if(this.size == 1){
            Node temp = this.head;
            this.head = null;
            return temp.getData();
        }
        Node iter = this.head;
        while (iter.getNext() != null)
            iter = iter.getNext();
        iter.getPrev().setNext(null);

        this.size--;
        return iter.getData();
    }

    @Override
    public int deleteAt(int index) throws Exception {
//        first verify the index
        if(index<0 || index>=this.size){
            throw new Exception("Invalid index");
        }else if(index == 0){
            return this.deleteFirst();
        }else if(index == this.size-1){
            return this.deleteLast();
        }

        Node iter = this.head;
        int counter = 0;

        while(counter != index){
            iter = iter.getNext();
            counter++;
        }
        iter.getPrev().setNext(iter.getNext());
        iter.getNext().setPrev(iter.getPrev());
        this.size--;

        return iter.getData();
    }

    public void show(){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        Node iter = this.head;
        StringBuilder dataList = new StringBuilder();
        while(iter != null){
            dataList.append(iter.getData()).append(" ---> ");
            iter = iter.getNext();
        }
        dataList.append("NULL");
        System.out.println(dataList);
    }
}
