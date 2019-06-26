package com.cvaleriano.curso.thread;

/**
 * @author cvaleriano
 *
 */
public class ExtendsThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println("ExtendsThread: " + i);
				Thread.sleep(25L);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
