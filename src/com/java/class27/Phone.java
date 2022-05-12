package com.java.class27;

public class Phone {

    double memory;
    String camera;
    String color;
    boolean isTouchScreen;
    char typeOfChargingPort;
    String model;
    String os;

    void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void text(String phoneNumber, String text) {
        System.out.println("Sending text " + text + " to " + phoneNumber + " ");
    }

    void connetToInternet(String connection, String password) {
        System.out.println("Connecting....");
        System.out.println("Connected! Do not spend more time on facebook :D");
    }

    String takePictures() {
        System.out.println("Taking pictures with camera "+ camera);
        return "12_05_2022_cal.png";
    }

    String recordVideos() {
        System.out.println("Recording videos with camera "+ camera);
        return "12_05_2022_las_vgs.mp4";
    }

    void charge(char typeOfChargingPort) {
        if(os.equalsIgnoreCase("Android")){
            if(typeOfChargingPort == 'c'){
                System.out.println("Charging with type C and Android");
            }else{
                System.out.println("Charging with type B and Android");
            }
        }else{
            System.out.println("Charging with cable which breaks a lot and it's expensive");
        }
    }


}
