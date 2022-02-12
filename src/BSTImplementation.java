class Node
{
    int value;
    Node left;
    Node right;


    Node(int value)
    {
        this.value=value;
        left=null;
        right=null;

    }
    public void displayNodeData() {
        System.out.println("{ " + value + " } ");
    }
}



public class BSTImplementation {

    Node root;

  Node addRecursive(Node current,int value)
    {
        if(current == null)
        {
            return new Node(value);
        }
        if(value< current.value)
        {
            current.left =addRecursive(current.left,value);
        }
        else if(value> current.value)
        {
            current.right=addRecursive(current.right,value);
        }
        else
        {
            return current;
        }
        return current;
    }

    public void add(int value)
    {
        root= addRecursive(root,value);
    }

    public boolean containsNodeRecursive(Node current,int value)
    {
        if(current == null)
        {
            return false;
        }
        if(value==current.value)
        {
            return true;
        }
        return value < current.value
                ?containsNodeRecursive(current.left,value)
                :containsNodeRecursive(current.right,value);
    }
    public boolean containsNode(int value)
    {
       return containsNodeRecursive(root,value);
    }
    public static void main(String args[])
    {
        BSTImplementation obj = new BSTImplementation();
        obj.add(6);
        obj.add(4);
        obj.add(8);
        obj.add(3);
        obj.add(5);
        obj.add(7);
        obj.add(9);

        System.out.println(obj.containsNode(8));

    }
}
