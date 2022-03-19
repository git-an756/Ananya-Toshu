import java.io.InterruptedIOException;
import java.io.*;

public class Accounta {


		// TODO Auto-generated method stub
		private double balance;
	
		synchronized void addAmount(double amount) throws InterruptedException {
			balance=balance+amount;
			System.out.println("Balance is:"+balance);
		}
			
			
		synchronized void substractAmount(double amount) throws InterruptedException{
			balance=balance-amount;
			System.out.println("Balance is:"+balance);
		}
}
public class Account extends Thread{
	public static void main(String args[]) {
		final Accounta account =new Accounta();
		double amount;
		Runnable thread=new Runnable();
		{
			public void run () {
				try {
					
					account.addAmount( amount);
					account.substractAmount( amount);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
					
					
				}
			
			new Thread(thread,"Thread_one").start();
			new Thread(thread,"Thread_two").start();
			}
	}
			

	}

}
