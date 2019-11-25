<%-- 
    Document   : index
    Created on : Nov 24, 2019, 7:24:55 PM
    Author     : ntd27
--%>
<% 
    session.setAttribute("view", "/index"); 
%>
<jsp:include page="banner.jsp"></jsp:include>
    <!--content-->
    <div class="content">
        <div class="container">
            <div class="content-mid">
                <h3>New Items</h3>
                <label class="line"></label>
                <div class="mid-popular">
                <c:forEach var="product" items="${newProducts.subList(0,4)}">
                    <div class="col-md-3 item-grid simpleCart_shelfItem">
                        <div class=" mid-pop">
                            <div class="pro-img">
                                <img src="${product.getAnh1()}" class="img-responsive" alt="">
                                <div class="zoom-icon ">
                                    <a class="picture" href="${product.getAnh1()}" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                                    <a href="<c:url value='product?${product.getIdsp()}'/>"><i class="glyphicon glyphicon-menu-right icon"></i></a>
                                </div>
                            </div>
                            <div class="mid-1">
                                <div class="women">
                                    <div class="women-top">
                                        <span>${product.getLoai()}</span>
                                        <h6><a href="<c:url value='product?${product.getIdsp()}'/>">${product.getTenSanPham()}</a></h6>
                                    </div>
                                    <div class="img item_add">
                                        <a href="<c:url value='addToCart?${product.getIdsp()}'/>"><img src="images/ca.png" alt=""></a>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="mid-2">
                                    <p><em class="item_price">$${product.getGiaTien()}</em></p>
                                    <div class="block">
                                        <div class="starbox small ghosting"> </div>
                                    </div>

                                    <div class="clearfix"></div>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="clearfix"></div>
            </div>
            <div class="mid-popular">
                <c:forEach var="product" items="${newProducts.subList(4,8)}">
                    <div class="col-md-3 item-grid simpleCart_shelfItem">
                        <div class=" mid-pop">
                            <div class="pro-img">
                                <img src="${product.getAnh1()}" class="img-responsive" alt="">
                                <div class="zoom-icon ">
                                    <a class="picture" href="${product.getAnh1()}" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                                    <a href="<c:url value='product?${product.getIdsp()}'/>"><i class="glyphicon glyphicon-menu-right icon"></i></a>
                                </div>
                            </div>
                            <div class="mid-1">
                                <div class="women">
                                    <div class="women-top">
                                        <span>${product.getLoai()}</span>
                                        <h6><a href="<c:url value='product?${product.getIdsp()}'/>">${product.getTenSanPham()}</a></h6>
                                    </div>
                                    <div class="img item_add">
                                        <a href="<c:url value='addToCart?${product.getIdsp()}'/>"><img src="images/ca.png" alt=""></a>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="mid-2">
                                    <p><em class="item_price">$${product.getGiaTien()}</em></p>
                                    <div class="block">
                                        <div class="starbox small ghosting"> </div>
                                    </div>

                                    <div class="clearfix"></div>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="clearfix"></div>
            </div>
        </div>
        <!--products-->
        <div class="content-mid">
            <h3>Trending Items</h3>
            <label class="line"></label>
            <div class="mid-popular">
                <c:forEach var="product" items="${trendProducts.subList(0,4)}">
                    <div class="col-md-3 item-grid simpleCart_shelfItem">
                        <div class=" mid-pop">
                            <div class="pro-img">
                                <img src="${product.getAnh1()}" class="img-responsive" alt="">
                                <div class="zoom-icon ">
                                    <a class="picture" href="${product.getAnh1()}" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                                    <a href="<c:url value='product?${product.getIdsp()}'/>"><i class="glyphicon glyphicon-menu-right icon"></i></a>
                                </div>
                            </div>
                            <div class="mid-1">
                                <div class="women">
                                    <div class="women-top">
                                        <span>${product.getLoai()}</span>
                                        <h6><a href="<c:url value='product?${product.getIdsp()}'/>">${product.getTenSanPham()}</a></h6>
                                    </div>
                                    <div class="img item_add">
                                        <a href="<c:url value='addToCart?${product.getIdsp()}'/>"><img src="images/ca.png" alt=""></a>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="mid-2">
                                    <p><em class="item_price">$${product.getGiaTien()}</em></p>
                                    <div class="block">
                                        <div class="starbox small ghosting"> </div>
                                    </div>

                                    <div class="clearfix"></div>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="clearfix"></div>
            </div>
            <div class="mid-popular">
                <c:forEach var="product" items="${trendProducts.subList(4,8)}">
                    <div class="col-md-3 item-grid simpleCart_shelfItem">
                        <div class=" mid-pop">
                            <div class="pro-img">
                                <img src="${product.getAnh1()}" class="img-responsive" alt="">
                                <div class="zoom-icon ">
                                    <a class="picture" href="${product.getAnh1()}" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                                    <a href="<c:url value='product?${product.getIdsp()}'/>"><i class="glyphicon glyphicon-menu-right icon"></i></a>
                                </div>
                            </div>
                            <div class="mid-1">
                                <div class="women">
                                    <div class="women-top">
                                        <span>${product.getLoai()}</span>
                                        <h6><a href="<c:url value='product?${product.getIdsp()}'/>">${product.getTenSanPham()}</a></h6>
                                    </div>
                                    <div class="img item_add">
                                        <a href="<c:url value='addToCart?${product.getIdsp()}'/>"><img src="images/ca.png" alt=""></a>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="mid-2">
                                    <p><em class="item_price">$${product.getGiaTien()}</em></p>
                                    <div class="block">
                                        <div class="starbox small ghosting"> </div>
                                    </div>

                                    <div class="clearfix"></div>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="clearfix"></div>
            </div>
        </div>
        <!--//products-->
    </div>
</div>
<jsp:include page="brand.jsp"></jsp:include>
<!--//content-->
<!--light-box-files -->
<script src="js/jquery.chocolat.js"></script>
<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8">
<!--light-box-files -->
<script type="text/javascript" charset="utf-8">
    $(function () {
        $('a.picture').Chocolat();
    });
</script>
