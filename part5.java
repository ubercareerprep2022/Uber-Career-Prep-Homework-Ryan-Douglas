import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//import part5.stack;

public class part5 {
    /*
    public class Node{
        int data;
        Node next;
        LinkedList<Node> nodeList = new LinkedList<Node>();

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        */
    LinkedList<Integer> list = new LinkedList<Integer>();

    LinkedList<Integer> reverseLL1(LinkedList<Integer> input){
        LinkedList<Integer> reversed = new LinkedList<Integer>();
        for(int i =input.size()-1; i >= 0; i--){
            reversed.add(input.get(i));
        }
        return reversed;

    }
    LinkedList<Integer> reverseLL2(LinkedList<Integer> input){
        Stack<Integer> stack = new Stack<Integer>();
        LinkedList<Integer> reversed = new LinkedList<Integer>();
        for(int i =0; i < input.size(); i++){
            stack.push(input.get(i));
        }
        while(!stack.isEmpty()){
            reversed.add(stack.pop());
        }
        return reversed;

    }
    LinkedList<Integer> reverseLL3(List<Integer> input){
        LinkedList<Integer> reversed = new LinkedList<Integer>();
        if(input.size() == 0){
            return null;
        }
       reversed = reverseLL3(input.subList(0, input.size()-2));
     return reversed;
    }
//}
    public static void main(String[] args){
        part5 obj = new part5();
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(obj.reverseLL1(list));
        System.out.println(obj.reverseLL2(list));
        System.out.println(obj.reverseLL3(list));

        
    
    }

}
