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
public class Product {
    private int id ;
    private  String Name ;
    private  float  Price ;
    private String Size ;
    private String Description ;
    private  String Delivery ;
    private String image ;

    public Product() {
    }

    public Product(int id, String Name, float Price, String Size, String Description, String Delivery, String image) {
        this.id = id;
        this.Name = Name;
        this.Price = Price;
        this.Size = Size;
        this.Description = Description;
        this.Delivery = Delivery;
        this.image = image;
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

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDelivery() {
        return Delivery;
    }

    public void setDelivery(String Delivery) {
        this.Delivery = Delivery;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    
}
