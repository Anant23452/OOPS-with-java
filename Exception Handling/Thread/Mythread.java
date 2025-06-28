public class Mythread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Mythread t1 = new Mythread();// Creating a thread
        t1.start(); // Starting the thread
    }
    // run() contain code for thread 
    //start()tell java to start thread
}
