package hw_191224.Task;

import hw_191224.TaskE3.Address;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
     int id;
     String firstName;
     String lastName;
     String email;
     String phoneNumber;

 public Customer() {
 }

 public Customer(int id, String firstName, String lastName, String email, String phoneNumber) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
  this.phoneNumber = phoneNumber;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 @Override
 public String toString() {
  return "Customer{" +
          "id=" + id +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", email='" + email + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          '}';
 }

// с условия задачи 4 класса Е3:
    ArrayList<Address> addresses = new ArrayList<>();

    public void addAddress(Address address){
       addresses.add(address);
    }


}
