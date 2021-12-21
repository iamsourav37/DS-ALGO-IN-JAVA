package queue.array;

public class Queue {
    private final int[] queue;
    private final int capacity;
    private int front, rear;

    public Queue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty(){
        return this.rear == -1;
    }
    private boolean isFull(){
        return this.rear == this.capacity-1;
    }

    public void enqueue(int data){
        if (this.isFull()){
            System.out.println("Queue is full");
            return;
        }
        this.rear++;
        this.queue[this.rear] = data;

    }
    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = this.queue[this.front];
        for(int i=0; i<this.rear; i++){
            this.queue[i] = this.queue[i+1];
        }
        this.rear--;
        return result;
    }
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return this.queue[this.front];
    }

    public void display(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        StringBuilder element = new StringBuilder();

        for(int i=0; i<=this.rear; i++)
            element.append(this.queue[i]).append(" ");
        System.out.println(element);
    }
}
