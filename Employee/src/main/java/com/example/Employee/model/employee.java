package com.example.Employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int Id;
     private String FirstName;
     private String LastName;
     private String Email;


     public employee(){

     }


    public employee(int id, String firstName, String lastName, String email) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }


    public String getFirstName() {
        return FirstName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public String getLastName() {
        return LastName;
    }


    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public static boolean isPresent() {
        return false;
    }


    public int getId() {
        return 0;
    }
     
     




    
}
