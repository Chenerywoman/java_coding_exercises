package com.techreturners.exercise002;

public class Person {
    
    private String firstName;
    private String lastName;
    private String city;
    private int age;

    public Person(String first_name, String last_name, String person_city, int person_age){
        this.firstName = first_name;
        this.lastName = last_name;
        this.city = person_city;
        this.age = person_age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCity(){
        return city;
    }

    public int getAge(){
        return age;
    }
}