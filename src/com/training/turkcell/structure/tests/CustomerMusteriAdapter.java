package com.training.turkcell.structure.tests;

public class CustomerMusteriAdapter extends Customer {
    private Musteri musteri;

    public CustomerMusteriAdapter(Musteri musteri) {
        this.musteri = musteri;
    }

    @Override
    public String getName() {
        return this.musteri.getIsim();
    }

    @Override
    public String getSurname() {
        return this.musteri.getSoyisim();
    }

    @Override
    public String getGender() {
        return this.musteri.getCinsiyet();
    }
}
