package com.training.turkcell.dp.creation.singleton;

public class SingletonRun {

	public static void main(String[] args) {
		EagerSingelton.getInstance().hello();
		LazySingelton.getInstance().hello();
		FinalSingelton.INSTANCE1.hello();
		FinalSingelton.INSTANCE2.hello();

	}

}
