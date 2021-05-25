package com.training.turkcell.dp.example;

public class Address {
    private final String address;
    private final String city;

    public Address(String addressParam, String cityParam) {
        super();
        this.address = addressParam;
        this.city = cityParam;
    }

    public String getName() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public static AddressWithBuilderHelper getBuilder() {
        return new AddressWithBuilderHelper();
    }

    public static class AddressWithBuilderHelper {
        private String address;
        private String city;

        public AddressWithBuilderHelper() {
        }


        public String getAddress() {
            return address;
        }

        public AddressWithBuilderHelper withAddress(String adressParam) {
            this.address = adressParam;
            return this;
        }

        public String getCity() {
            return city;
        }

        public AddressWithBuilderHelper withCity(String cityParam) {
            this.city = cityParam;
            return this;
        }

        public Address buildType() {
            Address builderLoc = new Address(this.address, this.city);
            return builderLoc;
        }

    }

}