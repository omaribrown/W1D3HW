package com.perscholas;

public class Main {

    public static void main(String[] args) {
        Student omari = new Student(001, "Omari", "Brown", "@gmail.com", "404-404-4040");

        System.out.println(omari.getFirstName());
        System.out.println(omari.getLastName());
        System.out.println(omari.getStudentID());
        System.out.println(omari.getEmail());
        System.out.println(omari.getPhone());
    }
}
