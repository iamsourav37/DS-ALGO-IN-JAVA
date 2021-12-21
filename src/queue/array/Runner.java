package queue.array;

public class Runner {
    public static void main(String...args){
        Queue q = new Queue(5);

        q.enqueue(12);
        q.enqueue(23);
        q.enqueue(32);
        q.enqueue(345);
        q.enqueue(45);

        System.out.println("Dequeue : "+ q.dequeue());
        System.out.println("Dequeue : "+ q.dequeue());
        System.out.println("Dequeue : "+ q.dequeue());

        q.enqueue(77);

        System.out.println("Dequeue : "+ q.dequeue());
        System.out.println("Dequeue : "+ q.dequeue());
        System.out.println("Dequeue : "+ q.dequeue());

        q.display();
    }
}
