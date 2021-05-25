package com.training.turkcell.dp.creation.singleton;

public enum FinalSingelton {
	INSTANCE1("test instance"), INSTANCE2("live instance") {
		@Override
		public void hello() {
			System.out.println("hello from final instance 2 singleton");
		}

	};

	private final String str;

	private FinalSingelton(final String stringParam) {
		this.str = stringParam;
	}

	public String getStr() {
		return this.str;
	}

	public void hello() {
		System.out.println("hello from final singleton");
	}
}
