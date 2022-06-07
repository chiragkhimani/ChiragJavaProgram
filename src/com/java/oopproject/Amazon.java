package com.java.oopproject;

public class Amazon {

    Person person;
    boolean isSaleOn;

    Amazon(Person person){
        System.out.println("====== Welcome  "+ person.name +" to Amazon =====================");
        this.person = person;
    }

    public void placeOrder(int quantity, Item item){
        int priceOfItem = item.getPrice();
        int totalCost = quantity * priceOfItem;
        person.getBankAccount().withdraw(totalCost);
        System.out.println("=========== Thank you for placing order in Amazon ============");
        System.out.println("Order has been placed for item "+item.getItemName());
        System.out.println("Total bill has been deducted "+totalCost);
        System.out.println("Total balance after order is "+person.getBankAccount().balance);
    }

}
