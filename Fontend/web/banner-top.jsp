<%-- 
    Document   : banner-top
    Created on : Nov 24, 2019, 7:45:14 PM
    Author     : ntd27
--%>
<!--banner-->
<div class="banner-top">
	<div class="container">
            <h1><%= request.getAttribute("title") %></h1>
		<em></em>
		<h2><a href="index.jsp">Home</a><label>/</label><%= request.getAttribute("title") %></h2>
	</div>
</div>
