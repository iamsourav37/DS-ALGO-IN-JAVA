package queue.list;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);


        while(true){
            switch (menu()){
                case 1:
                    System.out.println("Enter data : ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    System.out.println("Dequeue element : "+ queue.dequeue());
                    break;
                case 3:
                    System.out.println("Peek element : "+ queue.peek());
                    break;
                case 4:
                    queue.show();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");

            }
        }


    }
    public static int menu(){
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Show");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }
}
