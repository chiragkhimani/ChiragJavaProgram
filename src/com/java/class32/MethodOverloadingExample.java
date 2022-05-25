package com.java.class32;


class FlightBooking{
    public void bookTicket(){
        System.out.println("Booking with your username");
    }

    public void bookTicket(String name){
        System.out.println("Booking with your name"+name);
    }

    public void bookTicket(int seatNumber, String name){
        System.out.println("Booking with your seat"+seatNumber);
    }

    public void bookTicket(String name, int price){
        System.out.println("Booking with your name"+name);
    }

    public void bookTicket(int price){
            System.out.println("Booking with your seat"+price);
        }
}


public class MethodOverloadingExample {
    public static void main(String[] args) {

    }
}
