package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread { // Constructor to execute multiple threads
	private int num;

	public Task(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println("Task " + num + " started");
		for (int i = num * 100; i <= ((num * 100) + 9); i++)
			System.out.print(i + " ");
		System.out.println("\nTask " + num + " completed");
	}
}

public class ExecutorServiceMain {

	public static void main(String[] args) {
		// Single thread for each thread
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(new Task(6));
		executorService1.execute(new Task(7));

		ExecutorService executorService2 = Executors.newFixedThreadPool(5);
		executorService2.execute(new Task(1));
		executorService2.execute(new Task(2));
		executorService2.execute(new Task(3));
		executorService2.execute(new Task(4));
		executorService2.execute(new Task(5));

		// Main Execution
		System.out.println("Task 3 started");
		for (int i = 21; i <= 30; i++)
			System.out.print(i + " ");
		System.out.println("\nTask 3 completed");

		// Shutdown executor otherwise it will keep running
		executorService1.shutdown();
		executorService2.shutdown();

	}
}
