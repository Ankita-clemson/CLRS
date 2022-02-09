public class ThreadInterfaceImplementation implements Runnable{
    @Override
    public void run() {
        System.out.println("My thread got a job to do....");
    }

    public static void main(String args[])
    {
        Thread obj = new Thread(new ThreadInterfaceImplementation());
        obj.start();
    }
}
