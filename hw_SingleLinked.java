
public class hw_SingleLinked{

    public static void main( String[] args) {
        SingleLinked linled = new SingleLinked() ;

        linled.insert(new Node(4));
        linled.insert(new Node(5));
        linled.insert(new Node(6));
        linled.insert(new Node( 7));
        System.out.println( linled.insert(new Node( 8)));
        System.out.println(linled.head.next.next.next.next.next.value);
    }
}
class SingleLinked {

    Node head;
    Node lastnode;
    Node lastnodePrevious;

    public SingleLinked(){
        this.head = null;
    }


    public int insert(Node newNode){
        if(head==null) {
            head = newNode;
            lastnode = newNode; //c++ da pointerlar gibi//shallow copy/reference sematic
            head.next = null;
            //this.head.value=newNode.value;
            return head.value ;}
        else{
            lastnodePrevious=lastnode;//for previous of last
            lastnode.next=newNode;
            lastnode =newNode;
            lastnode.next= lastnodePrevious;

        }
        return lastnodePrevious.value;
    }

}

class Node {
    int value;
    Node next;

    public Node(){

    }

    public Node (int value){
        this.value=value;

    }
}