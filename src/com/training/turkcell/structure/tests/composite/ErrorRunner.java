package com.training.turkcell.structure.tests.composite;

public class ErrorRunner {
    public static void main(String[] args) {
        Error error = new Error().setMicroService("MS1")
                .setBoundedContext("B1")
                .setErrorDesc("Başka MS cagrilirken sorun olustu")
                .setErrorCause(100)
                .addSubError(new Error().setMicroService("MS2")
                        .setBoundedContext("B1")
                        .setErrorDesc("Validasyon Erorü")
                        .setErrorCause(120)
                        .addSubError(new Error().setMicroService("MS2")
                                .setBoundedContext("B1")
                                .setErrorDesc("Name yanlışgeldi")
                                .setErrorCause(121)
                                .addSubError(new Error().setMicroService("MS2")
                                        .setBoundedContext("B1")
                                        .setErrorDesc("Surname yanlışgeldi")
                                        .setErrorCause(121))));

        System.out.println("Errors : " + error.toFormattedStr(""));
    }
}
