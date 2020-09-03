/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.CheckOutBO;
import entity.ProductDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Order;

/**
 *
 * @author Mr D
 */
public class CheckoutServlet extends HttpServlet {

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

        String name = request.getParameter("name") + "";
        String company = request.getParameter("company") + "";
        String address1 = request.getParameter("address1") + "";
        String address2 = request.getParameter("address2") + "";
        String zip = request.getParameter("zip") + "";
        String state = request.getParameter("state") + "";
        int phone = Integer.parseInt(request.getParameter("phone"));
        String city = request.getParameter("city") + "";
        String email = request.getParameter("email") + "";
        String comment = request.getParameter("comment") + "";
        Customer c = new Customer(name, company, address1, address2, zip, city, state, phone, city, email, comment);

        HttpSession session = request.getSession();
        //no user
        if (session.getAttribute("order") == null) {
            Order order = new Order();
            order.setCustomer(c);
            session.setAttribute("order", order);
            String mess = "Save infomation sucess";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("home").forward(request, response);
        } //have user
        else {
            Order order = (Order) session.getAttribute("order");
            if (order.getSubtotal() == 0) {
                //no have product
                order.setCustomer(c);
                String mess = "Please choice prodcut";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Checkout.jsp").forward(request, response);

            } else {
                //choice product
                order.setCustomer(c);
               CheckOutBO bo = new CheckOutBO();
               bo.checkout(order, c);
                String mess = "Order sucess";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Checkout.jsp").forward(request, response);

            }

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
