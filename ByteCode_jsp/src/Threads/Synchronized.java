package Threads;
class BankAccount {
	int balance=1000;
	public synchronized void withdraw(int amount){
		if (balance>=amount) {
			System.out.println(Thread.currentThread().getName()+"withdraw the amount - "+amount);
			balance-=amount;
			System.out.println(Thread.currentThread().getName()+"withdraw the remaining balance -"+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+"insufficent balance");
		}	
	}
}
class User extends Thread{
	BankAccount acc;
	User(BankAccount acc){
        this.acc=acc;
	}
public void run() {
	acc.withdraw(700);
  }
}
public class Synchronized {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		User t1=new User(obj);
		User t2=new User(obj);
		t1.start();
		t2.start();    
	}
}
