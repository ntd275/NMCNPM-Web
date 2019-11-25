/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cart.ShoppingCart;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.SanPham;
import session_bean.ProductSessionBean;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ControllerServlet",
        urlPatterns = {"/ControllerServlet",
            "/category",
            "product",
            "/addToCart",
            "/viewCart",})
public class ControllerServlet extends HttpServlet {

    @EJB
    private ProductSessionBean ProductSB;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        if (userPath.equals("/category")) {
            String categoryId = request.getQueryString();
            //System.out.println(userPath);
            if(categoryId.equals("Sale")){
                List<SanPham> categoryProducts;
                categoryProducts = (List<SanPham>) ProductSB.findRange(new int[]{0,9});
                session.setAttribute("categoryProducts", categoryProducts);
                request.setAttribute("title", categoryId);
            }
            else
            if (categoryId != null) {
                List<SanPham> categoryProducts;
                categoryProducts = (List<SanPham>) ProductSB.FindByCategory(categoryId);
                session.setAttribute("categoryProducts", categoryProducts);
                request.setAttribute("title", categoryId);
            }
            
            
        }

        if (userPath.equals("/product")) {
            String productId = request.getQueryString();
            if (productId != null) {
                SanPham product;
                product = (SanPham) ProductSB.find(productId);
                session.setAttribute("product", product);
                request.setAttribute("title", "Product");
            }
        }

        if (userPath.equals("/viewCart")) {
            String clear = request.getParameter("clear");
            request.setAttribute("title", "View Cart");
            if ((clear != null) && clear.equals("true")) {
                ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
                cart.clear();
            }
        }

        if (userPath.equals("/addToCart")) {
            // if user is adding item to cart for first time
            // create cart object and attach it to user session
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            

            if (cart == null) {
                cart = new ShoppingCart();
                session.setAttribute("cart", cart);
            }
            // get user input from request
            String productId = request.getQueryString();
            if (!productId.isEmpty()) {
                SanPham product = ProductSB.find(productId);
                cart.addItem(product);
                request.setAttribute("title",product.getLoai());
            }
            String userView = (String) session.getAttribute("view");
            
            userPath = userView;
        }
        
        if (userPath.equals("/update")) {
            // if user is adding item to cart for first time
            // create cart object and attach it to user session
            request.setAttribute("title", "View Cart");
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

            if (cart == null) {
                cart = new ShoppingCart();
                session.setAttribute("cart", cart);
            }
            // get user input from request
            String productId = request.getQueryString();
            if (!productId.isEmpty()) {
                SanPham product = ProductSB.find(productId);
                cart.update(product, "0");
            }
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        }

        String url = userPath + ".jsp";
        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
           ex.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
