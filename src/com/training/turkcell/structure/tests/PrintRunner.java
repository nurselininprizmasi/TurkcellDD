package com.training.turkcell.structure.tests;

//proxy pattern
public class PrintRunner {
    public static void main(String[] args) {
        PrintSystem printSystem = new PrintSystemProxy();
        Customer customer = new Customer();
        customer.setName("nursen");
        customer.setSurname("altinbas");
        customer.setGender("kadın");
        //printSystem.print(customer);


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
