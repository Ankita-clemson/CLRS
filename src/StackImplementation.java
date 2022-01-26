// implementation of stack

import java.util.ArrayList;

public class StackImplementation<T> {

    //create an Arraylist object
    ArrayList<T> al;

    //defining a top variable and assigning it value as -1
    int top =-1;
    //variable to store the size of the array
    int size;
    //constructor of this class
    public StackImplementation(int size)
    {
        this.size =size;
        this.al = new ArrayList<>(size);
    }
    //method to push the stack
   void  push(T x)
    {
        if(top+1==size)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top =top+1;
            al.add(x);
        }

    }
//method to pop the stack
    void  pop()
    {
        if(top == -1)
        {
            System.out.println("stack underflow");

        }
        else
        {
            top =top-1;


        }
    }
//method to print the stack
    public String toString()
    {
        String finalStack = "";
        for(int i=0;i<top;i++)
        {
            finalStack += String.valueOf(al.get(top));

        }

        return finalStack;
    }

}
