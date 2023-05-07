package com.generics;

import java.util.ArrayList;

public class GenericList<T> {
	ArrayList<T> list = new ArrayList<>();

	public T addEle(T ele) {
		list.add(ele);
		return ele;
	}

	public T removeEle(T ele) {
		list.remove(ele);
		return ele;
	}

	public T get(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return "GenericList [list=" + list + "]";
	}
}
