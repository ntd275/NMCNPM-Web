<%-- 
    Document   : product
    Created on : Nov 24, 2019, 8:03:46 PM
    Author     : ntd27
--%>


<%@page import="java.util.List"%>
<%@page import="entity.SanPham"%>
<%    session.setAttribute("view", "/category");
%>
<jsp:include page="banner-top.jsp"></jsp:include>
    <div class="product">
        <div class="container">
            <div class="col-md">
                <div class="mid-popular">
                <% List<SanPham> categoryProducts = (List<SanPham>) session.getAttribute("categoryProducts");
                    for (SanPham product : categoryProducts) {
                %>
                <div class="col-md-4 item-grid1 simpleCart_shelfItem">
                    <div class=" mid-pop">
                        <div class="pro-img">
                            <img src="<%=product.getAnh1()%>" class="img-responsive" alt="">
                            <div class="zoom-icon ">
                                <a class="picture" href="<%=product.getAnh1()%>" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                                <a href="product?<%=product.getIdsp()%>"><i class="glyphicon glyphicon-menu-right icon"></i></a>
                            </div>
                        </div>
                        <div class="mid-1">
                            <div class="women">
                                <div class="women-top">
                                    <span>${product.getLoai()}</span>
                                    <h6><a href="product?<%=product.getIdsp()%>"><%=product.getTenSanPham()%></a></h6>
                                </div>
                                <div class="img item_add">
                                    <a href="addToCart?<%=product.getIdsp()%>"><img src="images/ca.png" alt=""></a>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="mid-2">
                                <p ><em class="item_price">$<%=product.getGiaTien()%></em></p>
                                <div class="block">
                                    <div class="starbox small ghosting"> </div>
                                </div>

                                <div class="clearfix"></div>
                            </div>

                        </div>
                    </div>
                </div>
                <%
                    }
                %>
                <div class="clearfix"></div>
            </div>
                
        </div>
                
        <div class="clearfix"></div>
    </div>
    <div class="container">
        <jsp:include page="brand.jsp"></jsp:include>
    </div>
    <script src="js/jquery.chocolat.js"></script>
    <link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8">
    <!--light-box-files -->
    <script type="text/javascript" charset="utf-8">
                $(function () {
                    $('a.picture').Chocolat();
                });
    </script>

</div>
