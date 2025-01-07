package hw_191224.Task;

import java.util.ArrayList;
import java.util.List;

public class Customer {
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private String phoneNumber;
   private Address addresses; // с условия задачи 4 класса Е3


   private List<Address> addresses2; // с условия задачи 4 класса Е3

 public Customer() {
 }

 public Customer(int id, String firstName, String lastName, String email, String phoneNumber) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
  this.phoneNumber = phoneNumber;
 }

 // Конструктор с параметрами с условия задачи 4 класса Е3


 public Customer(int id, String firstName, String lastName, String email, String phoneNumber, Address addresses) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
  this.phoneNumber = phoneNumber;
  this.addresses = addresses;
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
          ", addresses=" + addresses + '}';
 }

// с условия задачи 4 класса Е3:

    public void addAddress(Address address){
       this.addresses2.add(address);
    }


}
