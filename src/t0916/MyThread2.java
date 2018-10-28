package t0916;

public class MyThread2 implements Runnable{
	private int count =10;
	
	//public synchronized  void run() {	
		public  void run() {

		for (int i = 0; i < 10; i++) {
			synchronized(this){
			
				if (count > 0) {
				
					System.out.println(Thread.currentThread().getName()+"£ºcount= " + count--);
            	}
				//System.out.println(Thread.currentThread().getName()+"£ºcount= " + count--);
				}
                
			}
		
		
		
		
		
		//httlclient send http request
    }
		
		public synchronized void psynTest(String a){
		//public  void psynTest(String a){
			System.out.println("1");
		
			System.out.println("2");
	
			
			System.out.println("3");
			
		}

public static void main(String[] args) {
	MyThread2 my = new MyThread2();
	new Thread(my, "Thread 1").start();//session
	new Thread(my, "Thread 2").start();
	new Thread(my, "Thread 3").start();
	
	//for(int i=0;i<100;i++){
	//	new Thread(my, "Thread "+i).start();
	//}
	
	
    }



}

