package com.java.class36;

interface Bank{

    // All variable in interface by default public, static, final
    int ROUTING_NUMBER = 454324;

    // All methods in interface are by default public and abstract
    void deposit(int amount);

    void withdraw(int amount);
}

interface PSUBank extends Bank{
    void createOffers();

    void additionalSecurity();
}

interface Building{

}

class ChaseBank implements PSUBank, Building{


    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void createOffers() {

    }

    @Override
    public void additionalSecurity() {

    }
}


public class InterfaceExample {


}
