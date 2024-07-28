package multithreading;

import java.sql.SQLException;

public class ThreadCreation extends Thread{
   public void run() {
       for (int i=0;i<10;i++){
           System.out.println("thread is running:"+ i);
       }
   }

    public static void main(String[] args) throws InterruptedException {
        ThreadCreation t1=new ThreadCreation();
        ThreadCreation t2=new ThreadCreation();
        ThreadCreation t3=new ThreadCreation();
        t1.start();
        t2.start();
        t3.start();
    }
}
