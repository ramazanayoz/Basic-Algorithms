package hw_binary_search_tree;

public class hw_binary_search_tree {

    public static void main( String[] args) {


        BinarySearchTree BinarySearchTree = new BinarySearchTree();
        System.out.println(BinarySearchTree.insert(new Node(5)));
        System.out.println(BinarySearchTree.insert(new Node(5)));
        System.out.println(BinarySearchTree.insert(new Node(4)));
        System.out.println(BinarySearchTree.insert(new Node(3)));
        System.out.println(BinarySearchTree.insert(new Node(10)));
        System.out.println(BinarySearchTree.insert(new Node(1)));
        System.out.println(BinarySearchTree.parent.leftChild.leftChild.leftChild.value);
    }
}
class  Node  {
    int  value;
    Node  leftChild;
    Node  rightChild;

    public Node (){
    }

    public Node (int value ){
        this.value = value;

    }

}

class BinarySearchTree {
    Node parent = null ;

    public BinarySearchTree( ){
        this.parent = null;
    }

    public String  insert(Node newNode){
        if(parent==null){
            parent = newNode;
            return "this number added to parent";
        }
        Node current = parent;
            Node  changer = null;
        while(true){
            changer = current;
            //left less
            if(newNode.value<current.value){
                current = current.leftChild;
                if(current==null){
                    changer.leftChild = newNode;
                    return "this number added to leftchild";
                }
                //right greater
            }if(newNode.value>current.value){
                current = current.rightChild;
                if(current==null){
                    changer.rightChild = newNode;
                    return  "this number added to righttchild";
                }
            }
            if(newNode.value==current.value) {
              return "this number can not adding ";
            }
        }
    }

}




