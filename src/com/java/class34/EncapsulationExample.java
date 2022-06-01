package com.java.class34;

class Person {
    private int medication;

    // Getter
    public int getMedication(){
        return medication;
    }

    // Setter
    public void setMedication(int medication){
        if(medication > 100){
            System.out.println("Do not overload medication");
        }else{
            this.medication = medication;
        }
    }
}

public class EncapsulationExample{
    public static void main(String[] args) {
        Person chirag = new Person();

//        chirag.medication = 55;
//        chirag.setMedication(55);
    }
}