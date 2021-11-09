package com.niit.collection;

public class Resident {

    public String getFullName() {
        return fullName;
    }

    //declare the variables
    public String fullName;
    public int socialSecurityNumber;
    public char gender;



    //getter setter

    //constructor

    public Resident(String fullName, int socialSecurityNumber, char gender) {

    }

    //override toString method
    public String toString()
    {
        return "Full Name--"+fullName+"--SecurityNumber--"+socialSecurityNumber+"--Gender--"+gender;
    }

}
