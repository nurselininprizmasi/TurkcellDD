package com.training.turkcell.dp.example;

import java.time.LocalDate;
import java.util.List;

public class Customer {
	private final String name;
	private final String surname;
	private final LocalDate birthdate;
	private final List<Phone> phoneList;
	private final Address address;

	public Customer(String nameParam, String surnameParam, LocalDate birthdateParam, List<Phone> phoneListParam,
			Address addressParam) {
		super();
		this.name = nameParam;
		this.surname = surnameParam;
		this.birthdate = birthdateParam;
		this.phoneList = phoneListParam;
		this.address = addressParam;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public List<Phone> getPhoneList() {
		return this.phoneList;
	}

	public Address getAddress() {
		return this.address;
	}

	public static CustomerWithBuilderHelper getBuilder() {
		return new CustomerWithBuilderHelper();
	}

	public static class CustomerWithBuilderHelper {
		private String name;
		private String surname;
		private LocalDate birthdate;
		private List<Phone> phoneList;
		private Address address;

		public CustomerWithBuilderHelper() {

		}

		public String getName() {
			return this.name;
		}

		public CustomerWithBuilderHelper withName(String nameParam) {
			this.name = nameParam;
			return this;
		}

		public String getSurname() {
			return this.surname;
		}

		public CustomerWithBuilderHelper withSurname(String surnameParam) {
			this.surname = surnameParam;
			return this;
		}

		public LocalDate getBirthdate() {
			return this.birthdate;
		}

		public CustomerWithBuilderHelper withBirthdate(LocalDate birthdateParam) {
			this.birthdate = birthdateParam;
			return this;
		}

		public List<Phone> getPhoneList() {
			return this.phoneList;
		}

		public CustomerWithBuilderHelper withPhoneList(List<Phone> phoneListParam) {
			this.phoneList = phoneListParam;
			return this;
		}

		public Address getAddress() {
			return this.address;
		}

		public CustomerWithBuilderHelper withAddress(Address addressParam) {
			this.address = addressParam;
			return this;
		}

		public Customer buildType() {
			Customer builderLoc = new Customer(this.name, this.surname, this.birthdate, this.phoneList, this.address);
			return builderLoc;
		}

	}

}
