package com.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
}

public class CallableMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("Executor service started");

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> WelcomeStr = executorService.submit(new CallableTask("Tulsi Kant"));
		String wlcmStr = WelcomeStr.get();
		System.out.println(wlcmStr);
		System.out.println("Executor service completed");

		System.out.println("Main Method started");
		executorService.shutdown();
	}
}
