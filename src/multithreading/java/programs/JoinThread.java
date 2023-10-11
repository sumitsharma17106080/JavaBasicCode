package multithreading.java.programs;

public class JoinThread {

	public static void main(String[] args) {
		MyThread t1=new MyThread();

		MyRunnable r=new MyRunnable();
		Thread t2 =new Thread(r);
		
		t1.start();
		
		  try
	        { 
	            System.out.println("Current Thread: " + Thread.currentThread().getName()); 
	            t1.join(); 
	        } 
	  
	        catch(Exception ex) 
	        { 
	            System.out.println("Exception has been caught" + ex); 
	        } 
	  
	        // t2 starts 
	        t2.start(); 
	  
	        // starts t3 after when thread t2 has died. 
	        try
	        { 
	            System.out.println("Current Thread: "+ Thread.currentThread().getName()); 
	            t2.join(); 
	        } 
	        catch(Exception ex) 
	        { 
	            System.out.println("Exception has been caught" + ex); 
	        } 
	  

	}

}
