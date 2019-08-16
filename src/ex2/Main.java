package ex2;

import ex1.MyThread1;

public class Main {
	static  void printTable(int type) { // synchronized method
		if (type == 0) {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} else {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				printTable(0);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				printTable(1);

			}
		});
		t1.start();
		t2.start();
	}

}
