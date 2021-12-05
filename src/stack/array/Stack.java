package stack.array;

public class Stack {
    private final int CAPACITY;
    private int top;
    private int[] stack;

    public Stack(int capacity){
        this.CAPACITY = capacity;
        this.top = -1;
        this.stack = new int[this.CAPACITY];
    }

    private boolean isFull(){
        return this.top == this.CAPACITY-1;
    }
    private boolean isEmpty(){
        return this.top == -1;
    }
    public void push(int data){
        if(this.isFull()){
            System.out.println("Stack is overflow");
            return;
        }
        this.top++;
        this.stack[this.top] = data;
    }
    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }

        int temp = this.stack[this.top];
        this.top--;
        return temp;
    }
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        return this.stack[this.top];
    }
    public void display(){
        if(this.isEmpty()){
            System.out.println("Stack is underflow");
            return;
        }
        for(int i=this.top; i>=0; i--){
            System.out.println(this.stack[i]);
        }
    }
}
