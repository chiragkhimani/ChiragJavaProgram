package com.java.class42;


enum DaysOfWeek{

    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    int num;

    DaysOfWeek(int num){
        this.num = num;
    }

    public int getValue(){
        return num;
    }

}


public class EnumWithCustomValue{
    public static void main(String[] args) {
        System.out.println(Constants.fromAccount);
    }
}
