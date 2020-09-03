/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mr D
 */
public class Customer {
    private int id ;
    private String Name ;
    private String Company ;
    private String Address1 ;
    private  String Address2;
    private String Zip ;
    private String City ;
    private String State ;
    private int Phone ;
    private String Country ;
    private String Email ;
    private String Comment ;

    public Customer() {
    }

    public Customer( String Name, String Company, String Address1, String Address2, String Zip, String City, String State, int Phone, String Country, String Email, String Comment) {
      
        this.Name = Name;
        this.Company = Company;
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.Zip = Zip;
        this.City = City;
        this.State = State;
        this.Phone = Phone;
        this.Country = Country;
        this.Email = Email;
        this.Comment = Comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
    
    
    
}
