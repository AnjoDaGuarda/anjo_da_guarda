package main;

import AnjoDaGuarda.AnjoDaGuarda;

public final class Main {

	public static void main(String[] args) throws Exception {
		AnjoDaGuarda anjo = new AnjoDaGuarda();
		anjo.initialize();
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(86400000);// 24h
				} catch (InterruptedException ie) {
				}
			}
		};
		t.start();
		System.out.println("Started");
	}

}
