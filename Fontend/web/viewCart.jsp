<%-- 
    Document   : checkout
    Created on : Nov 24, 2019, 8:01:20 PM
    Author     : ntd27
--%>
<%@page import="java.util.List"%>
<%@page import="entity.SanPham"%>
<%@page import="cart.ShoppingCart"%>
<%@page import="cart.ShoppingCartItem"%>

<%    
    session.setAttribute("view", "/viewCart");
%>

<jsp:include page="banner-top.jsp"></jsp:include>
    <div class="check-out">
        <div class="container">

            <div class="bs-example4" data-example-id="simple-responsive-table">
                <div class="table-responsive">
                    <table class="table-heading simpleCart_shelfItem">
                        <tr>
                            <th class="table-grid">Item</th>

                            <th>Prices</th>
                            <th >Quantity </th>
                            <th> Subtotal</th>
                        </tr>
                    <%
                        if (cart != null) {
                            List<ShoppingCartItem> items = cart.getItems();
                            for (ShoppingCartItem item : items) {
                    %>
                    <tr class="cart-header">

                        <td class="ring-in"><a href="product?<%= item.getProduct().getIdsp()%>" class="at-in"><img src="<%= item.getProduct().getAnh1()%>" class="img-responsive" alt=""></a>
                            <div class="sed">
                                <h5><a href="product?<%= item.getProduct().getIdsp()%>"> <%= item.getProduct().getTenSanPham()%> </a></h5>
                                <p><%= item.getProduct().getMoTa()%> </p>

                            </div>
                            <div class="clearfix"> </div>
                        </td>
                        <td>$<%= item.getProduct().getGiaTien()%></td>
                        <td><%= item.getQuantity()%></td>
                        <td class="item_price">$<%= item.getTotal()%></td>
                        <td class="add-check"><a class="item_add hvr-skew-backward" href="update?<%= item.getProduct().getIdsp()%>">Delete</a></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                </table>
            </div>
        </div>
        <% 
            if (cart.getNumberOfItems() != 0) {
        %>
        <div class="produced">
            <a href="<c:url value='viewCart?clear=true'/>" class="hvr-skew-backward">Produced To Buy</a>
        </div>
        <%
            }
        %>
    </div>
</div>

<jsp:include page="brand.jsp"></jsp:include>