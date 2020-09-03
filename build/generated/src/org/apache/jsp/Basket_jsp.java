package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Basket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Css/Basket.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Basket</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"all\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <!-----header---->\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    <h1>Handmade by Catherine</h1>\n");
      out.write("                    <p>Welcome to My Online Store </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!----menu=---->\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <a href=\"Home.jsp\">Online Store</a>\n");
      out.write("                <a href=\"About.jsp\">About </a>\n");
      out.write("                <a href=\"Contact.jsp\">Contact</a>\n");
      out.write("            </div>\n");
      out.write("            <!-----body---->\n");
      out.write("            <div class=\"body\">\n");
      out.write("                <table >\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <h1 style=\"margin-left: 20px;\">Your Basket</h1>\n");
      out.write("                        </td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <div class=\"buttonNomal\">\n");
      out.write("                                <button><a href=\"\" >Buy more</a></button>\n");
      out.write("                                <button><a href=\"\" >Checkout</a></button>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <!----tite----->\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width: 450px;\" >\n");
      out.write("                            <h3 style=\"margin-left: 20px;\" >Product</h3>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"width: 120px;\">\n");
      out.write("                            <h3>Price</h3>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"width: 120px;\">\n");
      out.write("                            <h3>Quality</h3>\n");
      out.write("                        </td >\n");
      out.write("                        <td style=\"width: 120px;\" >\n");
      out.write("                            <h3>Total</h3>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <!---line-->\n");
      out.write("                    <tr style=\"margin-top: 200px;\" >\n");
      out.write("                        <td colspan=\"4\">\n");
      out.write("                            <div class=\"line\">\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <!----item---->\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <!---item content--->\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"Image/1.jpg\" alt=\"\"/>\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <a href=\"\">Product 1</a>\n");
      out.write("                                    <p>Delivery 1-2</p>\n");
      out.write("                                    <p>business days</p>\n");
      out.write("                                    <p>Size : one size</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td ><p style=\"margin-top: -55px;\">8.00usd</p></td>\n");
      out.write("                        <td ><p style=\"margin-top: -55px;\">1</p></td>\n");
      out.write("                        <td >\n");
      out.write("                            <div class=\"total\">\n");
      out.write("                                <p style=\"margin-top: -55px;\">8.00usd</p>\n");
      out.write("                                <button style=\"margin-top: -55px;\" ><a href=\"\" >x</a></button>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <!----item---->\n");
      out.write("                    <!----item---->\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <!---item content--->\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"Image/1.jpg\" alt=\"\"/>\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <a href=\"\">Product 1</a>\n");
      out.write("                                    <p>Delivery 1-2</p>\n");
      out.write("                                    <p>business days</p>\n");
      out.write("                                    <p>Size : one size</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td ><p style=\"margin-top: -55px;\">8.00usd</p></td>\n");
      out.write("                        <td ><p style=\"margin-top: -55px;\">1</p></td>\n");
      out.write("                        <td >\n");
      out.write("                            <div class=\"total\">\n");
      out.write("                                <p style=\"margin-top: -55px;\">8.00usd</p>\n");
      out.write("                                <button style=\"margin-top: -55px;\" ><a href=\"\" >x</a></button>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <!----item---->\n");
      out.write("                     <!----item---->\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <!---item content--->\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"Image/1.jpg\" alt=\"\"/>\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <a href=\"\">Product 1</a>\n");
      out.write("                                    <p>Delivery 1-2</p>\n");
      out.write("                                    <p>business days</p>\n");
      out.write("                                    <p>Size : one size</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td ><p style=\"margin-top: -55px;\">8.00usd</p></td>\n");
      out.write("                        <td ><p style=\"margin-top: -55px;\">1</p></td>\n");
      out.write("                        <td >\n");
      out.write("                            <div class=\"total\">\n");
      out.write("                                <p style=\"margin-top: -55px;\">8.00usd</p>\n");
      out.write("                                <button style=\"margin-top: -55px;\" ><a href=\"\" >x</a></button>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <!----item---->\n");
      out.write("                    <!----line---->\n");
      out.write("                    <tr style=\"margin-top: 200px;\" >\n");
      out.write("                        <td colspan=\"4\">\n");
      out.write("                            <div class=\"line2\">\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td ><p>Subtotal</p></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><p>16.000usd</p></td>\n");
      out.write("                            \n");
      out.write("                    </tr>\n");
      out.write("                    <tr  >\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><p>Shipping</p></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><p>16.000usd</p></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <!----line---->\n");
      out.write("                    <tr  >\n");
      out.write("                        <td colspan=\"4\">\n");
      out.write("                            <div class=\"line3\">\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr >\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><h3 style=\"margin-top: -5px;\">Total</h3></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><p style=\"margin-top: -5px;\" >16.000usd</p></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!----footer---->\n");
      out.write("            <div class=\"footerSpace\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"lineFooter\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <p>This website was created with Simple site</p>\n");
      out.write("                <a href=\"\">Get your own FREE website.Click here!</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
