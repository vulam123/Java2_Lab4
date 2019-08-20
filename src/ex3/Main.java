package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		Thread t1 = new Thread() {
			public void run() {
				demo.print();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				demo.printType();
			}
		};
		t1.start();
		t2.start();
	}
}
