public class StackClient {
    public static void main(String args[])
    {
        StackImplementation<Integer> obj = new StackImplementation<>(3);

        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println("After pushing the stack:\n" + obj.toString());

        obj.pop();

        System.out.println("After popping the stack:\n" + obj.toString());

    }
}
