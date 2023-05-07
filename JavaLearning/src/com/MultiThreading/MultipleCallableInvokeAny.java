package com.MultiThreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableTAny implements Callable<String> {
	private String name;

	public CallableTAny(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(100);
		return "Hello " + name;
	}
}

public class MultipleCallableInvokeAny {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTAny> names = List.of(new CallableTAny("Tulsi Kant"), new CallableTAny("Satya Prakash"),
				new CallableTAny("Shahrukh Khan"));
		String welcomeStr = executorService.invokeAny(names);
		System.out.println(welcomeStr);
		executorService.shutdown();
	}
}
