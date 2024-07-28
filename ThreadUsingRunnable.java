package multithreading;

public class ThreadUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ThreadUsingRunnable t1=new ThreadUsingRunnable();
        Thread thread=new Thread(t1);
        thread.start();

    }
}
