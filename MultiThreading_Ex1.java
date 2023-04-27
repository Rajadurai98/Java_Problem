package basicjava.com;

public class MultiThreading_Ex1 implements Runnable {
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		MultiThreading_Ex1 me=new MultiThreading_Ex1();
		Thread th1=new Thread(me);
		th1.start();

	}

}
