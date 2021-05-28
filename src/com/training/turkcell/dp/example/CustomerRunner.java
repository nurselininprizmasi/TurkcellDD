package com.training.turkcell.dp.example;

public class CustomerRunner {

    public static void main(final String[] args) {
        Customer buildLoc = Customer.getBuilder()
                .withName("gunes")
                .withSurname("altinbas")
                .withAddress("addre1")
                .withCity("ankara")
                .withPhone()
                .withPhoneName("ev")
                .withPhoneNumber(8080)
                .add()
                .withPhone()
                .withPhoneName("office")
                .withPhoneNumber(8081)
                .add()
                .build();

        System.out.println(buildLoc.toString());

    }

}
