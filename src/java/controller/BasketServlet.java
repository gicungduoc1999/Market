/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.ProductDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Item;
import model.Order;
import model.Product;

/**
 *
 * @author Mr D
 */
public class BasketServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int id;
        String size = request.getParameter("size").toString();
        if (request.getParameter("id") != null) {
            id = Integer.parseInt(request.getParameter("id"));
            ProductDao pdao = new ProductDao();
            //get all product
            List<Product> list = pdao.getAll();
            //get name by id
            String name = "";
            for (Product product : list) {
                if (id == product.getId()) {
                    name = product.getName();
                }
            }
            //get product by name ,size
            Product p = new Product();
            for (int i = 0; i < list.size(); i++) {
                if (name.equals(list.get(i).getName())) {
                    if (list.get(i).getSize().trim().equals(size)) {
                        p = list.get(i);
                    }
                }
            }
            //get quality
            int quality = 1;
            if (request.getParameter("quality") != null) {
                quality = Integer.parseInt(request.getParameter("quality"));
            }
            HttpSession session = request.getSession();
            //check item in basket
            if (session.getAttribute("order") == null) {
                //create basket
                Order order = new Order();
                float total = p.getPrice() * quality;
                List<Item> listItem = new ArrayList<>();
                Item t = new Item();
                t.setPrice(p.getPrice());
                t.setQuality(quality);
                t.setTotal(total);
                t.setProduct(p);
                listItem.add(t);
                //Subtotal
                float Subtotal = 0;
                for (Item item : listItem) {
                    Subtotal += item.getTotal();
                }
                //cont order
                int count = 0;
                for (Item item : listItem) {
                    count += item.getQuality();
                }
                order.setCount(count);
                order.setSubtotal(Subtotal);
                order.setItem(listItem);
                session.setAttribute("order", order);

            } else {
                //add basket
                Order order = (Order) session.getAttribute("order");
                if (order.getItem() == null) {
                    // if have customer but have item
                    float total = p.getPrice() * quality;
                    List<Item> listItem = new ArrayList<>();
                    Item t = new Item();
                    t.setPrice(p.getPrice());
                    t.setQuality(quality);
                    t.setTotal(total);
                    t.setProduct(p);
                    listItem.add(t);
                    //Subtotal
                    float Subtotal = 0;
                    for (Item item : listItem) {
                        Subtotal += item.getTotal();
                    }
                    //cont order
                    int count = 0;
                    for (Item item : listItem) {
                        count += item.getQuality();
                    }
                    order.setCount(count);
                    order.setSubtotal(Subtotal);
                    order.setItem(listItem);
                    session.setAttribute("order", order);

                } else {
                    List<Item> listItem = order.getItem();
                    //check diffent product
                    boolean checkAddQuality = false;
                    for (Item item : listItem) {
                        if (p.getId() == item.getProduct().getId()) {
                            item.setQuality(item.getQuality() + 1);
                            float total = p.getPrice() * item.getQuality();
                            item.setTotal(total);
                            //Subtotal
                            float Subtotal = 0;
                            for (Item item1 : listItem) {
                                Subtotal += item.getTotal();
                            }
                            order.setSubtotal(Subtotal);
                            //count
                            int count = 0;
                            for (Item item1 : listItem) {
                                count += item1.getQuality();
                            }
                            order.setCount(count);

                            checkAddQuality = true;
                        }
                    }
                    if (checkAddQuality == false) {
                        Item t = new Item();
                        t.setPrice(p.getPrice());
                        t.setProduct(p);
                        t.setQuality(quality);
                        float total = p.getPrice() * t.getQuality();
                        t.setTotal(total);
                        listItem.add(t);
                        //Subtotal
                        float Subtotal = 0;
                        for (Item item : listItem) {
                            Subtotal += item.getTotal();
                        }
                        order.setSubtotal(Subtotal);
                        //count
                        int count = 0;
                        for (Item item : listItem) {
                            count += item.getQuality();
                        }
                        order.setCount(count);
                        // order.setItem(listItem);
                    }
                    session.setAttribute("order", order);
                }
            }
            request.getRequestDispatcher("home").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
