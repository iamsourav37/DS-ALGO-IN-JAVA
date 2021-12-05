package stack.array;

public class Runner {
    public static void main(String[] args) {
        Stack s = new Stack(4);

        System.out.println(s.pop());

        s.push(24);
        s.push(54);
        s.push(12);
        s.push(90);
        s.display();
        System.out.println("Pop operation");

        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println("Stack elements : ");
        s.display();

        System.out.println("Peek element: "+ s.peek());
        s.push(43);
        s.push(78);
        s.push(90);
        s.display();
    }
}
