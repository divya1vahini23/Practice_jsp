package Threads;
class print{
	public static synchronized void print_data(int num){
		System.out.println(Thread.currentThread().getName()+"is running");
		for(int i=0;i<num;i++) {
			System.out.println(i);
		}
}
	class User1 extends Thread{
		public void run() {
			print.print_data(5);
		}
		class User2 extends Thread{
			public void run() {
				print.print_data(10);
			}
		}
	}
}
public class Main {
	public static void main(String[] args) {
		User1 u1=new User1();
		u1.SetName("User1");
		User2 u2=new User2();
		u2.SetName("User2");
		u1.start();
		u2.start();    
	}

}
