package multithreading;

public class SampleThread implements Runnable{
    int sum=0;
    public void run(){
        sum++;
        System.out.println(sum);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadCreation threadCreation = new ThreadCreation();
        for(int i=1;i<=100;i++) {
            Thread thread=new Thread(threadCreation);
            thread.start();
            thread.join();
        }
    }
}
