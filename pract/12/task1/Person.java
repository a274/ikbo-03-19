package com.company.task1;

public class Person {
    private String lastName;
    private String firstName = "";
    private String fathersName = "";

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(String lastName, String firstName, String fathersName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fathersName = fathersName;
    }

    public String formattedName() {
        if (firstName.equals("") || fathersName.equals("")) return lastName;
        return lastName + " " +  firstName.charAt(0) + "." + fathersName.charAt(0) + ". " ;
    }
}
