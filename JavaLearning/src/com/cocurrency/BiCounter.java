package com.cocurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
	private int i;
	private int j;

	Lock lockI = new ReentrantLock();
	Lock lockJ = new ReentrantLock();

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public void incrementI() {
		// get Lock for i
		lockI.lock();
		i++;
		// release lock for i
		lockI.unlock();
	}

	public void incrementJ() {
		// get Lock for j
		lockJ.lock();
		j++;
		// release lock for j
		lockJ.unlock();
	}
}
