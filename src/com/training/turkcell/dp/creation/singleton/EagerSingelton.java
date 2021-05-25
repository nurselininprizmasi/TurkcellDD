package com.training.turkcell.dp.creation.singleton;

public class EagerSingelton {
	private static EagerSingelton instance = new EagerSingelton();
	
	private EagerSingelton() {
		//cache
	}

	public static EagerSingelton getInstance() {
		return EagerSingelton.instance;
	}
	
	public void hello() {
		System.out.println("hello from eager singleton"	);
	}
}
