package com.training.turkcell.dp.example;

public class Phone {
	private final String name;
	private final String number;

	public Phone(String nameParam, String numberParam) {
		super();
		this.name = nameParam;
		this.number = numberParam;
	}

	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}

	public static PhoneWithBuilderHelper getBuilder() {
		return new PhoneWithBuilderHelper();
	}

	public static class PhoneWithBuilderHelper {
		private String name;
		private String number;

		public PhoneWithBuilderHelper() {
		}

		public String getName() {
			return name;
		}
		public PhoneWithBuilderHelper withName(String nameParam) {
			this.name = nameParam;
			return this;
		}
		public String getNumber() {
			return number;
		}
		public PhoneWithBuilderHelper withDesc(String numberParam) {
			this.number = numberParam;
			return this;
		}
		
		public Phone buildType() {
			Phone builderLoc = new Phone(this.name,this.number);
			return builderLoc;
        }
		
	}

}