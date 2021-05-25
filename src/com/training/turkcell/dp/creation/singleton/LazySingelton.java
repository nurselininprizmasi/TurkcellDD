package com.training.turkcell.dp.creation.singleton;

public class LazySingelton {
	private static volatile LazySingelton instance; // global heapte durur ,volatile = global hepteki islemleri globalde tut
													

	private LazySingelton() {
		// cache
	}

	public static LazySingelton getInstance() {
		if (instance == null) {
			synchronized (LazySingelton.class) {
				if (LazySingelton.instance == null) {
					LazySingelton.instance = new LazySingelton();
				}
			}

		}
		return LazySingelton.instance;
	}
	
	public void hello() {
		System.out.println("hello from lazy singleton"	);
	}
}
