/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Item;
import model.Order;
import model.Product;

/**
 *
 * @author Mr D
 */
public class ProductDao extends DBContext {

    public List<Product> getAllProduct() {
        //connection
        Connection con = null;
        try {
            con = getConnection();
            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("err connection : " + e);
        }
        List<Product> list = new ArrayList<>();
        String sql = "select *\n"
                + "from Product";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float Price = rs.getFloat(3);
                String Size = rs.getString(4);
                String Description = rs.getString(5);
                String Delivery = rs.getString(6);
                String image = rs.getString(7);
                Product p = new Product(id, name, Price, Size, Description, Delivery, image);
                list.add(p);
                //get all
            }
        } catch (Exception e) {
            System.out.println("sql" + e);
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getName().equals(list.get(j).getName())) {
                    list.remove(j);
                }
            }
        }
        return list;
    }

    public List<Product> getAll() {
        //connection
        Connection con = null;
        try {
            con = getConnection();
            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("err connection : " + e);
        }
        List<Product> list = new ArrayList<>();
        String sql = "select *\n"
                + "from Product";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float Price = rs.getFloat(3);
                String Size = rs.getString(4);
                String Description = rs.getString(5);
                String Delivery = rs.getString(6);
                String image = rs.getString(7);
                Product p = new Product(id, name, Price, Size, Description, Delivery, image);
                list.add(p);
                //get all
            }
        } catch (Exception e) {
            System.out.println("sql" + e);
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return list;
    }

    public List<String> getSizeProduct(String nameProduct) {
        //connection
        Connection con = null;
        try {
            con = getConnection();
            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("err connection : " + e);
        }
        List<String> listSize = new ArrayList<>();
        String sql = " select Size\n"
                + " from Product\n"
                + " where Name = ?";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            st.setString(1, nameProduct);
            rs = st.executeQuery();
            Product p = new Product();
            while (rs.next()) {
                String size = rs.getString(1);
                listSize.add(size);
            }
        } catch (Exception e) {
            System.out.println("sql" + e);
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //get value of list
        return listSize;
    }

    public List<Product> getListByPage(int page, List<Product> list) {
        List<Product> listPage = new ArrayList<>();
        int start, end;
        // firt page 
        if (list.size() <= 9) {
            start = 0;
            end = list.size();
        } else {
            start = (page - 1) * 9;
            end = start + 9;
            if (list.size() < end) {
                end = list.size();
            }
        }
        for (int i = start; i < end; i++) {
            listPage.add(list.get(i));
        }
        return listPage;
    }
    //Check out
      //get id of Order
    public int getIdOfOrder(Customer c,Connection con) {
        int id = 0;
        String sql = " select *\n"
                + "from [Order]\n"
                + "where CustomerID = ?";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            st.setInt(1, c.getId());
            rs = st.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("sql" + e);
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
               
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //get value of list
        return id;
    }

    //get id  of Customer
    public int getIDOfCustomer(Customer c,Connection con) {
       
        int id = 0;
        String sql = " select *\n"
                + "from Customer\n"
                + "where Name =? and Phone =?";
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            st.setString(1, c.getName());
            st.setInt(2, c.getPhone());
            rs = st.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("sql" + e);
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
               
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //get value of list
        return id;
    }
    

    //check out 
    public void insertOrder(Customer c,Order order,Connection con) {
       
         String sqlOrder = "insert into [Order]\n"
                + "values(?,GETDATE(),?)";
         PreparedStatement stOrder = null;
        try {
            stOrder = con.prepareStatement(sqlOrder);
            //insert order
            stOrder.setInt(1, c.getId());
            stOrder.setFloat(2, order.getSubtotal());
            stOrder.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, e);
            try {
                con.rollback();
                stOrder.close();

            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                
                 stOrder.close();

            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    //insert Order
    public void insertCustomer(Customer c,Order order,Connection con) {
       
        String sqlC = "insert into Customer \n"
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stC = null;
        try {
            //insert customer
            stC = con.prepareStatement(sqlC);
            stC.setString(1, c.getName());
            stC.setString(2, c.getCompany());
            stC.setString(3, c.getAddress1());
            stC.setString(4, c.getAddress2());
            stC.setString(5, c.getZip());
            stC.setString(6, c.getCity());
            stC.setString(7, c.getState());
            stC.setInt(8, c.getPhone());
            stC.setString(9, c.getCountry());
            stC.setString(10, c.getEmail());
            stC.setString(11, c.getComment());
            stC.executeUpdate();
        } catch (Exception e) {
            System.out.println("sql : " + e);
            try {
                con.rollback();
                stC.close();

            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
               
                stC.close();

            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    public void insertOrderDetail( List<Item> listItem, Order order,Connection con) {
       
        String sqlOrderDetail = "insert into OrderDetail\n"
                + "values(?,?,?,?,?)";
        PreparedStatement stOrderDetail = null;
        try {
           stOrderDetail =con.prepareStatement(sqlOrderDetail);
            //insert order detail
            con.setAutoCommit(false);
            for(int i = 0 ; i < listItem.size() ; i++){
                 stOrderDetail.setInt(1, order.getId());
                stOrderDetail.setInt(2, listItem.get(i).getProduct().getId());
                stOrderDetail.setInt(3, listItem.get(i).getQuality());
                stOrderDetail.setFloat(4, listItem.get(i).getPrice());
                stOrderDetail.setFloat(5, listItem.get(i).getTotal());
                stOrderDetail.addBatch();
            }
                 stOrderDetail.executeBatch();
                stOrderDetail.clearBatch();
               con.commit();
        } catch (Exception e) {
            System.out.println("sql" + e);
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                stOrderDetail.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void main(String[] args) {
        ProductDao pdao = new ProductDao();
        List<Item> list = new ArrayList<>();
        Product p = new Product();
        p.setId(1);
        Product p2 = new Product();
        p2.setId(2);
        Product p3 = new Product();
        p3.setId(3);
        Customer c = new Customer("d", "d", "d", "d", "d", "d", "d", 0, "d", "d", "d");
        Item i1 = new Item(1, p, 1, 1, 1);
        Item i2 = new Item(1, p2, 1, 1, 1);
        Item i3 = new Item(1, p3, 1, 1, 1);
        list.add(i1);
        list.add(i2);
        list.add(i3);
        //   int id = pdao.getID(c);
        //  c.setId(id);
        //   pdao.insertData(c, list);

    }

}
