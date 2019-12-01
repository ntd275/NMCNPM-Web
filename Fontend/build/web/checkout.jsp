<%-- 
    Document   : checkout
    Created on : Nov 24, 2019, 8:01:20 PM
    Author     : ntd27
--%>

<jsp:include page="banner-top.jsp"></jsp:include>
    <script>$(document).ready(function (c) {
            $('.close1').on('click', function (c) {
                $('.cart-header').fadeOut('slow', function (c) {
                    $('.cart-header').remove();
                });
            });
        });
    </script>
    <script>$(document).ready(function (c) {
            $('.close2').on('click', function (c) {
                $('.cart-header1').fadeOut('slow', function (c) {
                    $('.cart-header1').remove();
                });
            });
        });
    </script>
    <script>$(document).ready(function (c) {
            $('.close3').on('click', function (c) {
                $('.cart-header2').fadeOut('slow', function (c) {
                    $('.cart-header2').remove();
                });
            });
        });
    </script>
    <div class="check-out">
        <div class="container">
              Thank you!
        </div>
    </div>

<jsp:include page="brand.jsp"></jsp:include>