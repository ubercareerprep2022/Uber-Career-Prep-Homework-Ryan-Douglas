import java.util.ArrayList;

public class part3 {
    public class stack{
        ArrayList<Integer> stack = new ArrayList<Integer>();
        public stack(){

        }
         void push(int x){
            stack.add(x);
        }
        Integer pop(){
            if(stack.size() > 0){
            Integer x = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return x;
            }
            return -1;
        }
        Integer top(){
            if(stack.size() >0){
            return stack.get(stack.size()-1);
            }
            return -1;
        }
        boolean isEmpty(){
            if(stack.size() ==0){
                return true;
            }
            return false;
        }
        Integer size(){
            return stack.size();
        }
    }
        public class queue{
            ArrayList<Integer> queue = new ArrayList<Integer>();
            public queue(){

            }
            void enqueue(int x){
                queue.add(x);
            }
            Integer dequeue(){
                if(queue.size()>0){
               return queue.remove(0);
                }
                return -1;
            }
            Integer rear(){
                if(queue.size()>0){
                return queue.get(queue.size()-1);
                }
                return -1;
            }
            Integer front(){
                if(queue.size()>0){
                return queue.get(0);
                }
                return -1;
            }
            Integer size(){
                return queue.size();
            }
            boolean isEmpty(){
                if(queue.size() == 0){
                    return true;
                }
                return false;
            }

        }

    

    public static void main(String [] args){
        part3 obj = new part3();
        part3.stack myStack = obj.new stack();

        myStack.push(34);
        myStack.push(8);
        System.out.println("Top of the stack: "+ myStack.top());//should be 8
        System.out.println("Popped value: "+ myStack.pop());//should be 8
        System.out.println("Size of the stack: "+ myStack.size());//should be 1
        System.out.println("Top of the stack: "+ myStack.top());//should be 34
        myStack.pop();
        System.out.println("Is stack empty? "+ myStack.isEmpty());//should be true
        System.out.println("Popped value on empty stack: " +myStack.pop());//should be -1
        System.out.println("Top value on empty stack: " +myStack.top());//should be -1

        System.out.println();

        part3 obj2 = new part3();
        part3.queue myQueue = obj2.new queue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println("Size of the queue: "+ myQueue.size());//should be 3
        System.out.println("Front of the queue: "+ myQueue.front());//should be 1
        System.out.println("Rear of the queue: "+ myQueue.rear());//should be 3
        myQueue.dequeue();
        System.out.println("Dequeued item "+ myQueue.dequeue());//should be 2
        System.out.println("Is queue empty? "+ myQueue.isEmpty());//should be false
        myQueue.dequeue();
        System.out.println("Dequeued item on empty queue: " +myQueue.dequeue());//should be -1
        System.out.println("Front value on empty queue: " +myQueue.front());//should be -1

    }
    
}
