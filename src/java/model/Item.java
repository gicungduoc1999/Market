/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Product;

/**
 *
 * @author Mr D
 */
public class Item {
    
  private int id ;
  private   Product product;
  private   int quality ;
  private   float price ;
  private   float total ;

    public Item() {
    }

    public Item(int id, Product product, int quality, float price, float total) {
        this.id = id;
        this.product = product;
        this.quality = quality;
        this.price = price;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
  
  
  
     
     
}
