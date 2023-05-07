package com.MultiThreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableT implements Callable<String> {
	private String name;

	public CallableT(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(100);
		return "Hello " + name;
	}
}

public class MultipleCallableMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableT> names = List.of(new CallableT("Tulsi Kant"), new CallableT("Satya Prakash"),
				new CallableT("Shahrukh Khan"));
		List<Future<String>> welcomeStr = executorService.invokeAll(names);
		for (Future<String> wlcm : welcomeStr) {
			System.out.println(wlcm.get());
		}
		executorService.shutdown();
	}
}
