package stackandqueue.queueusingstack;

import java.util.Stack;

public class queueUsingStack {
    private Stack <Integer> enqueuestack=new Stack<>();
    private Stack <Integer> dequeuestack=new Stack<>();

    public queueUsingStack(){
        this.enqueuestack=new Stack<>();
        this.dequeuestack=new Stack<>();

    }
    public void enqueue(int value){
        enqueuestack.push(value);
    }
    public int dequeue(){
        if(dequeuestack.isEmpty()){
            while(!enqueuestack.isEmpty()){
                dequeuestack.push(enqueuestack.pop());
            }
        }
        if(dequeuestack.isEmpty()){
            throw new RuntimeException("both queues are empty");
        }

        return dequeuestack.pop();
    }

    public boolean isEmpty(){
        return enqueuestack.isEmpty() && dequeuestack.isEmpty();
    }

    public int peek(){
        if(dequeuestack.isEmpty()){
            while(!enqueuestack.isEmpty()){
                dequeuestack.push(enqueuestack.pop());
            }
        }
        if(dequeuestack.isEmpty()){
            throw new RuntimeException("queues are empty");
        }
        return dequeuestack.peek();
    }

}

