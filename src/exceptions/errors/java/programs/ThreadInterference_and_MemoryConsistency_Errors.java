package exceptions.errors.java.programs;


	class Num{
		int i;
		
		public Num(int i) {
			this.i=i;
		}
		public Num () {
			
		}
		public void increment() {
			for(int x=0;x<100;x++) {
			i++; System.out.println(i);}
		}
		public void decrement() {
			for(int x=0;x<100;x++) {i--;
			 System.out.println(i);}
		}
	}
	
	class Thread1 extends Thread{
		Num n1=new Num(10);
		public void run() {
			n1.increment();
		}
	}
	class Thread2 extends Thread{
		Num n2=new Num(10);
		public void run() {
			n2.decrement();
			n2.increment();
		}
	}
	public class ThreadInterference_and_MemoryConsistency_Errors {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		
		/*
		 In multithreading, there can be possibilities that the changes made by one thread might not
		  be visible to the other threads and they all have inconsistent views of the same shared data. 
		  This is known as memory consistency error.

			Memory consistency is more of an architecture-based concept than Java-based.
			 Accesses to main memory might not occur in the same order in which the CPU initiated them, 
			 especially for write operations which often go through hardware write buffers so that the
			  CPU need not wait for them. CPUs guarantee that the order of writes to a single memory
			   location is maintained from the perspective of all CPUs, even if CPUs perceive the write
			    time of other CPUs differently than the actual time. This sometimes leads to memory
			     inconsistency due to lack of visibility of the correct data.
		 */

	}

}
