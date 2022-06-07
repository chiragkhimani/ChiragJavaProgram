package com.java.class35;

abstract class Engineer{
    // Abstract method
    public abstract void work();

    // Concrete Method
    public void sleep(){
        System.out.println("No Sleep!");
    }
}

abstract class ComputerEngineer extends Engineer{

}

class Programmer extends ComputerEngineer{

    public void work() {
        System.out.println("Coding without any idea how it works!");
    }
}

class ElectronicsEngineer extends Engineer{
    public void work(){
        System.out.println("Work with wires and get shocked");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        Programmer chirag = new Programmer();
        ElectronicsEngineer ee = new ElectronicsEngineer();
        chirag.sleep();
        chirag.work();
        ee.sleep();
        ee.work();
    }
}
