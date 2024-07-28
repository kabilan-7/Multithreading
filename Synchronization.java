package multithreading;
class Account{
    int balance;
    public Account(int balance){
       this.balance=balance;
    }
    public synchronized void withdraw(int amt) throws InterruptedException {
        Thread.sleep(2000);
        if(balance>amt) {
            balance = balance - amt;
        }else{
            System.out.println("There is no enough amount to withdraw");
        }
        System.out.println("Amount withdraw successfully");
        System.out.println("Balance amount:"+balance);
    }
}
public class Synchronization extends Thread{
    Account obj;
   public Synchronization(Account a){
       obj=a;
   }
   public void run(){
       try {
           obj.withdraw(800);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }

    public static void main(String[] args) {
        Account account = new Account(2000);
        Synchronization s1=new Synchronization(account);
        s1.start();
        Synchronization s2=new Synchronization(account);
        s2.start();
    }
}
