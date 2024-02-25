package THREAD;

public class MyRunnable implements Runnable{
	public void run() {
		for(int i = 0; i<20;i++) {
			long threadId = Thread.currentThread().getId();
			System.out.println("Thread" + threadId + "running");
		}
		
	}
	
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
//		Thread t1 = new Thread(runnable);
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		//t1.start();
//		t1.setPriority(Thread.MAX_PRIORITY); // ưu tiên tối đa có giá trị là 10
//		t1.setPriority(Thread.MIN_PRIORITY); // ưu tiên tối đa có giá trị là 1
//		t1.setPriority(Thread.NORM_PRIORITY); // ưu tiên tối đa có giá trị bình thường là 5
		//t2.start();
//		for(int i = 0; i<20;i++) {
//			System.out.println("Main programming");
//		}
		//System.out.println(t1.isAlive());
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
