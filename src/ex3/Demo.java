package ex3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public int i = 0;
	boolean wait = false;

	public Demo() {

	}

	public synchronized void print() {
		while (i < 10) {
			if (wait) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
			wait = true;
			notify();
		}

	}

	public synchronized void printType() {
		while (i < 11) {
			if (!wait) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (i % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			i++;
			wait = false;
			notify();
		}

	}

}