package com.java.class27;

public class PhoneTester {
    public static void main(String[] args) {

        Phone p = new Phone();

        p.memory = 128.12;
        p.camera = "16Mpx";
        p.color = "white";
        p.isTouchScreen = true;
        p.typeOfChargingPort = 'C';
        p.model = "Apple iPhone 6";
        p.os = "iOS";

        System.out.println(p.memory);
        System.out.println(p.camera);
        System.out.println(p.color);
        System.out.println(p.isTouchScreen);
        System.out.println(p.typeOfChargingPort);
        System.out.println(p.model);
        System.out.println(p.os);

        p.call("12345");
        String name = p.takePictures();
        System.out.println(name);

    }
}
