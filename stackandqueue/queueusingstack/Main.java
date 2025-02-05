package stackandqueue.queueusingstack;

public class Main {
    public static void main(String[] args) {
        queueUsingStack q1 = new queueUsingStack();
        q1.enqueue(3);
        q1.enqueue(12);
        q1.enqueue(10);
        q1.enqueue(15);

        System.out.println(q1.dequeue()); //3
        System.out.println(q1.peek()); //12

        q1.enqueue(5);
        System.out.println(q1.dequeue()); //12
        System.out.println(q1.peek());    //10
        System.out.println(q1.dequeue()); //10



    }
}