package com.MultiThreading;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task 1 started");
		for (int i = 0; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println("\nTask 1 completed");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Task 2 started");
		for (int i = 11; i <= 20; i++)
			System.out.print(i + " ");
		System.out.println("\nTask 2 completed");
	}
}

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// Thread execution
		Task1 task = new Task1();
		task.setPriority(1);
		task.start();

		Task2 task2 = new Task2();
		Thread threadTask2 = new Thread(task2);
		threadTask2.setPriority(10);
		threadTask2.start();

		task.join();
		threadTask2.join();

		// Main Execution
		System.out.println("Task 3 started");
		for (int i = 21; i <= 30; i++)
			System.out.print(i + " ");
		System.out.println("\nTask 3 completed");
	}

}
