package stack.linked.list;

public class Stack {
    private Node head;
    private int size;

    public Stack(){
        this.head = null;
        this.size = 0;
    }
    private boolean isEmpty(){
        return this.head == null;
    }
    public void push(int data){
        this.head = new Node(data, this.head);
        this.size++;
    }
    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        Node temp = this.head; 
        this.head = temp.getNext();
        return temp.getData();
    }
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
       return this.head.getData();
    }
    public int size(){
        return this.size;
    }

    public void display(){
        if(this.isEmpty()){
            System.out.println("Stack is underflow");
            return;
        }

        Node temp = this.head;

        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
