package com.training.turkcell.basic.str;

import java.security.SecureRandom;

public class StrPlayGround {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder(512);
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("nursen ");
            stringBuilder.append("id:");
            stringBuilder.append(random.nextInt());
        }

        String str1 = ""; //hatalı kullanım
        for (int i = 0; i < 100; i++) {
            str1 += "nursen altinbas " + random.nextInt();
        }

        StringBuilder builderLoc2 = new StringBuilder(50);
        builderLoc2.append("osman");
        builderLoc2.append("id:");
        builderLoc2.append(random.nextInt());
        builderLoc2.append("dsfsd");

        String str2 = "osman id:" + random.nextInt() + " djshfsd ";
        str2 += " dsfsd";
    }
}
