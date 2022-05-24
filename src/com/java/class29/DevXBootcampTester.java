package com.java.class29;

public class DevXBootcampTester {
    public static void main(String[] args) {
        BootcampStudent becky = new BootcampStudent();
        BootcampStudent rendy = new BootcampStudent();
        BootcampStudent hosna = new BootcampStudent();

        becky.instructorName = "Chirag";
        becky.mentorName = "Tim";

        rendy.instructorName = "Mike";
        rendy.mentorName = "James";

        hosna.mentorName = "Dana";
        hosna.instructorName = "Rob";

        System.out.println(BootcampStudent.instructorName);
        System.out.println(BootcampStudent.mentorName);

    }
}
