package com.training.turkcell.structure.tests;

public class PrintRunner {
    public static void main(String[] args) {
        PrintSystem printSystem = new PrintSystem();
        Customer customer = new Customer();
        customer.setName("nurşen");
        customer.setSurname("altinbas");
        customer.setGender("kadın");
        printSystem.print(customer);


        Musteri musteri = new Musteri();
        musteri.setIsim("hamdi");
        musteri.setSoyisim("altinbas");
        musteri.setCinsiyet("erkek");
        musteri.setDogum("1982");

        //adapter pattern
        CustomerMusteriAdapter adapter = new CustomerMusteriAdapter(musteri);
        printSystem.print(adapter);
    }
}
