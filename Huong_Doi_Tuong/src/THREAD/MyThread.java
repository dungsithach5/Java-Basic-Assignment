package THREAD;

public class MyThread extends Thread{
	public void run(){
		for(int i = 0; i<20;i++) {
			long threadId = Thread.currentThread().getId();
			System.out.println("Thread" + threadId + "running");
		}
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
//		for (int i = 0; i < 20; i++) {
//			System.out.println("Main program running");		
//		}
		try{
			t1.start();
			t1.join();
			t2.join();
			t2.start();
		}catch(InterruptedException e){
			System.out.println("Main thread is interrupted");
		}
	}
}
