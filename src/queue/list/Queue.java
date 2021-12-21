package queue.list;

public class Queue {
    private Node head;

    public Queue(){
        this.head = null;
    }

    public void enqueue(int data){
        if (this.head == null){
            this.head = new Node(data, null);
        }else{
            Node temp = this.head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(data, null));
        }
    }

    public int dequeue() throws Exception{
        if(this.head == null){
            throw new Exception("Queue is empty");
        }else{
            Node deleteNode = this.head;
            this.head = this.head.getNext();
            return deleteNode.getData();
        }
    }

    public int peek() throws Exception{
        if (this.head == null){
            throw new Exception("Queue is empty");
        }else{
            return this.head.getData();
        }
    }
    public void show(){
        if(this.head == null){
            System.out.println("Queue is empty");
        }else{
            StringBuilder element = new StringBuilder();
            Node temp = this.head;
            while(temp != null){
                element.append(temp.getData()+" ");
                temp = temp.getNext();
            }
            System.out.println(element);
        }
    }
}
