package t0916;

public class MyThread1 extends Thread  {
	
	private int count = 5; //各个实例之间不能共享该变量

	public void run() {
	
		for (int i = 0; i < 7; i++) {
		if (count > 0) {
		                System.out.println(Thread.currentThread().getName()+"：count= " + count--);
		            }
		        }
		    }

		public static void main(String[] args) {
			MyThread1 h1 = new MyThread1();
			MyThread1 h2 = new MyThread1();
			MyThread1 h3 = new MyThread1();
			h1.start();
			h2.start();
			h3.start();
		}


}
