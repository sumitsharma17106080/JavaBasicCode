package multithreading.java.programs;

public class DaemonThread {

	public static void main(String[] args) {
		MyThread t1=new MyThread();

		MyRunnable r=new MyRunnable();
		Thread t2 =new Thread(r);
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		System.out.println("t1 is daemon :"+t1.isDaemon());
		System.out.println("t2 is daemon :"+t2.isDaemon());
		

	}

}
