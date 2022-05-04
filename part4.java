import java.util.LinkedList;

public class part4 {
    public class Node{
        int data;
        Node next;
        LinkedList<Node> nodeList = new LinkedList<Node>();

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        void push(Node node){
            if(nodeList.size() ==0){
            nodeList.add(node);//adds to the end
            }else{
                nodeList.add(node);
                nodeList.get(nodeList.size()-2).next = nodeList.getLast();
            }
        }
        Node pop(){
            if(nodeList.size() == 0){
        
            }else if (nodeList.size() == 1){
                return nodeList.remove(0);
            }
            nodeList.get(nodeList.size()-2).next =null;
            return nodeList.remove(nodeList.size()-1);
        }
        void insert(int index, Node node){
            if(index <= nodeList.size()-1){
                nodeList.get(index).next = node;
                nodeList.set(index, node);
                nodeList.get(index).next = nodeList.get(index+1);
            }else{
                System.out.println("Index is out of bounds");
            }
        }
        void remove(int index){
            if(index <= nodeList.size()-1){
                nodeList.remove(index);
            }else{
                System.out.println("Index is out of bounds");
            }

        }
        Node elementAt(int index){
            if(index <= nodeList.size()-1){
                return nodeList.get(index);
            }
            return null;

        }
        int size(){
            return nodeList.size();
        }
        void printList(){
            for(int i=0;i<nodeList.size(); i++){
                System.out.print(nodeList.get(i).data+" ");
            }

        }
    }

    public static void main(String [] args){
        part4 obj = new part4();
        part4.Node obj1 = obj.new Node(1);
        obj1.push(obj1);
        obj1.push(obj.new Node(2));
        obj1.push(obj.new Node(3));
        obj1.push(obj.new Node(4));
        
        obj1.printList();//should be 1 2 3 4
        System.out.println();

        System.out.println("Popped node: "+ obj1.pop().data);//should be 4
        obj1.printList();//should be 1 2 3
        System.out.println();
        obj1.remove(1);
        obj1.printList();//should be 1 3
        System.out.println();
        System.out.println("Size of list: "+ obj1.size());//should be 2
        System.out.println("First node: "+ obj1.elementAt(0).data);//should be 1
        obj1.remove(0);
        obj1.remove(0);
        obj1.remove(0);
        obj1.elementAt(0);




    }
    
}
