package com.training.turkcell.dp.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String surname;
    private final LocalDate birthdate;
    private final List<Phone> phoneList;
    private final Address address;

    public Customer(final String nameParam, final String surnameParam, final LocalDate birthdateParam, final List<Phone> phoneListParam,
                    final Address addressParam) {
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

    public static CustomerHelper getBuilder() {
        return new CustomerHelper();
    }
    public static class Phone {

        private String name;
        private int    number;

        public Phone() {
        }

        public String getName() {
            return this.name;
        }

        public int getNumber() {
            return this.number;
        }

        public static PhoneBuilder getBuilder(final CustomerHelper customerParam) {
            return new PhoneBuilder(customerParam);
        }

        public static class PhoneBuilder {

            private final Phone           phone = new Phone();
            private final CustomerHelper customer;

            public PhoneBuilder(final CustomerHelper customerParam) {
                super();
                this.customer = customerParam;
            }

            public String getName() {
                return this.phone.name;
            }

            public PhoneBuilder withPhoneName(final String nameParam) {
                this.phone.name = nameParam;
                return this;
            }

            public int getNumber() {
                return this.phone.number;
            }

            public PhoneBuilder withPhoneNumber(final int numberParam) {
                this.phone.number = numberParam;
                return this;
            }

            public CustomerHelper add() {
                this.customer.addPhone(this.phone);
                return this.customer;
            }
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Phone{");
            sb.append("name='").append(name).append('\'');
            sb.append(", number=").append(number);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class Address {

        private String address;
        private String city;

        public String getAddress() {
            return this.address;
        }

        public String getCity() {
            return this.city;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Address{");
            sb.append("address='").append(address).append('\'');
            sb.append(", city='").append(city).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public static class CustomerHelper {
        private String name;
        private String surname;
        private LocalDate birthdate;
        private List<Phone> phoneList = new ArrayList<>();
        private Address address;

        public CustomerHelper() {

        }

        public String getName() {
            return this.name;
        }

        public CustomerHelper withName(final String nameParam) {
            this.name = nameParam;
            return this;
        }

        public String getSurname() {
            return this.surname;
        }

        public CustomerHelper withSurname(final String surnameParam) {
            this.surname = surnameParam;
            return this;
        }

        public LocalDate getBirthdate() {
            return this.birthdate;
        }

        public CustomerHelper withBirthdate(final LocalDate birthdateParam) {
            this.birthdate = birthdateParam;
            return this;
        }

        public List<Phone> getPhoneList() {
            return this.phoneList;
        }

        public Phone.PhoneBuilder withPhone() {
            return Phone.getBuilder(this);
        }
        public Phone withPhoneName(final String name) {
            return new Phone();
        }

        public Address getAddress() {
            return this.address;
        }
        public CustomerHelper withAddress(String addressParam) {
            if (this.address == null) {
                this.address = new Address();
            }
            this.address.address = addressParam;
            return this;
        }

        public CustomerHelper withCity(final String city) {
            if (this.address == null) {
                this.address = new Address();
            }
            this.address.city = city;
            return this;

        }

        public void addPhone(final Phone phone) {
            this.phoneList.add(phone);
        }

        public Customer build() {
            Customer builderLoc = new Customer(this.name, this.surname, this.birthdate, this.phoneList, this.address);
            return builderLoc;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthdate=").append(birthdate);
        sb.append(", phoneList=").append(phoneList);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
