public class Main {
    public static void main(String[] args) {
// root node
        Node root= new Node(1);


        Node leftNode= new Node(2);
        Node rightNode = new Node (3);
        root.left =  leftNode;
        root.right = rightNode;

        leftNode.left= new Node(55);
        rightNode.left=new Node(66);

        System.out.println(root.left.value);

    }
}