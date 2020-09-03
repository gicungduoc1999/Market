/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import connect.DBContext;
import entity.ProductDao;
import java.sql.Connection;
import model.Customer;
import model.Order;

/**
 *
 * @author Mr D
 */
public class CheckOutBO {

    Connection con;
    DBContext db;

    public CheckOutBO() {
        //connection
        try {
            db = new DBContext();
            con = db.getConnection();
            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("err connection : " + e);
        }

    }

    public void checkout(Order order, Customer c) {
        ProductDao pdao = new ProductDao();
        //insert customer 
        pdao.insertCustomer(c, order,con);
        //get id of Customer
        int id = pdao.getIDOfCustomer(c,con);
        c.setId(id);
        //insert Order
        pdao.insertOrder(c, order,con);
        //get id of Order
        int OrderId = pdao.getIdOfOrder(c,con);
        order.setId(id);
        //insert order detail
        pdao.insertOrderDetail(order.getItem(), order,con);
    }
    public static void main(String[] args) {
         CheckOutBO bo = new CheckOutBO();
          ProductDao pdao = new ProductDao();
        //insert customer 
        Order order = new Order();
        Customer c = new Customer();
      //  pdao.insertCustomer(c, order, con);
    }

}
