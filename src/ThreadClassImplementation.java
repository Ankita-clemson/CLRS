class ThreadClassImplementation extends Thread{
    public void run(){
        System.out.println("My thread has got a job to do...");
    }
    public static void main(String args[]){
        ThreadClassImplementation t1=new ThreadClassImplementation();
        t1.start();
    }
}
