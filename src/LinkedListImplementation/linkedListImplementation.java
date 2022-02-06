package LinkedListImplementation;

import java.util.LinkedList;

class linkedListImplementation
{
    Node head;


void add(int val)
{
    Node newNode = new Node();
    newNode.data=val;

    if(head==null)
    {
        head = newNode;
    }
    else
    {
        Node n = head;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=newNode;
    }

}
void printList()
{
    System.out.println("Printing LinkedList (head --> last) ");
    Node current = head;
    while (current != null) {
        current.displayNodeData();
        current = current.next;
    }
    System.out.println();
}

void reverseList()
{   Node pointer= head;
    Node current = null;
    Node previous = null;

    while(pointer!=null)
    {
        current = pointer;
        pointer = pointer.next;

        //reverse the link
        current.next= previous;
        previous = current;
        head = current;



    }
}
    public static void main(String args[])
    {
        linkedListImplementation list = new linkedListImplementation();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
            list.reverseList();
        list.printList();


    }
}
