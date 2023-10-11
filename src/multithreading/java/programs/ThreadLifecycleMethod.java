package multithreading.java.programs;

class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.print("Thread :"+i+",");
		}
	}
}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Runnable :"+i+",");
		}
	}
}
public class ThreadLifecycleMethod {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();

		MyRunnable r=new MyRunnable();
		Thread t2 =new Thread(r);
		
		t1.start();
		t2.start();

	}

}
