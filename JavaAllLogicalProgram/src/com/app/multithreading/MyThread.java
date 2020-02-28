package com.app.multithreading;

public class MyThread  extends Thread {

	public void run() {
		System.out.println("No argu run");
	}


	public void run1() {
		System.out.println("int argu run");
	}

	public static void main(String[] args) {

		MyThread m=new MyThread();
		m.start();
	}
}




