<%-- 
    Document   : login
    Created on : Nov 24, 2019, 7:47:24 PM
    Author     : ntd27
--%>


<jsp:include page="banner-top.jsp"></jsp:include>
<!--login-->
<div class="container">
    <div class="login">
        <form>
            <div class="col-md-6 login-do">
                <div class="login-mail">
                    <input type="text" placeholder="Email" required="">
                    <i  class="glyphicon glyphicon-envelope"></i>
                </div>
                <div class="login-mail">
                    <input type="password" placeholder="Password" required="">
                    <i class="glyphicon glyphicon-lock"></i>
                </div>
                <a class="news-letter " href="#">
                    <label class="checkbox1"><input type="checkbox" name="checkbox" ><i> </i>Forget Password</label>
                </a>
                <label class="hvr-skew-backward">
                    <input type="submit" value="login">
                </label>
            </div>
            <div class="col-md-6 login-right">
                <h3>Completely Free Account</h3>

                <p>Pellentesque neque leo, dictum sit amet accumsan non, dignissim ac mauris. Mauris rhoncus, lectus tincidunt tempus aliquam, odio 
                    libero tincidunt metus, sed euismod elit enim ut mi. Nulla porttitor et dolor sed condimentum. Praesent porttitor lorem dui, in pulvinar enim rhoncus vitae. Curabitur tincidunt, turpis ac lobortis hendrerit, ex elit vestibulum est, at faucibus erat ligula non neque.</p>
                <a href="register.html" class=" hvr-skew-backward">Register</a>

            </div>

            <div class="clearfix"> </div>
        </form>
    </div>

</div>
<!--//login-->
<!--brand-->
<jsp:include page="brand.jsp"></jsp:include>
<!--//brand-->
<!--//content-->
