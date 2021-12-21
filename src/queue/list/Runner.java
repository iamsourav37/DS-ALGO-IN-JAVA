package queue.list;

public class Runner {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        queue.enqueue(23);
        queue.enqueue(12);
        queue.enqueue(21);
        queue.enqueue(30);
        queue.enqueue(37);
        queue.enqueue(77);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.show();
        System.out.println("Peek element : "+ queue.peek());
    }
}
