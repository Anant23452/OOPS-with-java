package Exception Handling.Thread;

public class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Thread is running");
        }
    public static void main(String[] args){
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();

}
}
