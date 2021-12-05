package stack.linked.list;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(32);
        stack.push(12);
        stack.push(90);
        stack.push(9);
        stack.push(10);
        stack.push(-56);
        stack.push(21);

        System.out.println("Pop element: "+stack.pop());
        System.out.println("Pop element: "+stack.pop());

        System.out.println("Peek element is : "+ stack.peek());


        stack.display();

    }
}
