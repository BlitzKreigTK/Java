package com.cocurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMain {
	public static void main(String[] args) {
		// ConcurrentHashMap is used for thread safety and LongAdder class acts as a
		// counter which provides increment method just like Atomic classes
		ConcurrentMap<Character, LongAdder> occurrance = new ConcurrentHashMap<>();
		String str = "ABCD DEFG ABCD";
		// Logic here is to convert String to character array --> If char occurred once
		// then increment by 1 (occurrance is null if a char occurred once) Create new
		// object of LongAdder and increment()
		for (char ch : str.toCharArray()) {
			// computeIfAbsent is a method which we can use as same in functional
			// programming which is working same logic as that of previous logic
			// occurrance.computeIfAbsent(ch, character -> new LongAdder()).increment();
			LongAdder longadd = occurrance.get(ch);
			if (longadd == null) {
				longadd = new LongAdder();
			}
			longadd.increment();
			occurrance.put(ch, longadd);
		}
		System.out.println(occurrance);
	}
}
