package ex1;

public class Main {
	public static void main(String[] args) {
		MyThread1 thread1= new MyThread1();
//		thread1.start();
		thread1.setPriority(Thread.MAX_PRIORITY);
		MyThread1 thread2= new MyThread1();
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
	}
}
