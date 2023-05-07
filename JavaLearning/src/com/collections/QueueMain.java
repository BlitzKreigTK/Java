package com.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class DescOrder implements Comparator<String> {
	@Override
	public int compare(String val1, String val2) {
		return Integer.compare(val1.length(), val2.length());
	}
}

public class QueueMain {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>(new DescOrder());
		queue.addAll(List.of("Apple", "Mango", "Pear", "Banana", "Watermelon"));
		queue.add("Cane");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
