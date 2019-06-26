package com.cvaleriano.curso.thread;

/**
 * @author cvaleriano
 *
 */
public class RunThreads {
	
	public static void main(String[] args) {
		ExtendsThread exThread = new ExtendsThread();
		Thread threadImpl = new Thread(new ThreadImpl());
		exThread.start();
		threadImpl.start();
	}

}
