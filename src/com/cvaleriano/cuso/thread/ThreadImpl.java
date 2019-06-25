package com.cvaleriano.cuso.thread;

/**
 * @author cvaleriano
 *
 */
public class ThreadImpl implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println("\t\tThreadImpl: " + i);
				Thread.sleep(50L);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
