package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cart.ShoppingCart;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    double total = 0;
    ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
    if(cart != null) {
        total = cart.getSubtotal();
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Shop Online</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("        <!--theme-style-->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\r\n");
      out.write("        <!--//theme-style-->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"keywords\" content=\"Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, \r\n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <!--theme-style-->\r\n");
      out.write("        <link href=\"css/style4.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\r\n");
      out.write("        <!--//theme-style-->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <!--- start-rate---->\r\n");
      out.write("        <script src=\"js/jstarbox.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jstarbox.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\" />\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            jQuery(function () {\r\n");
      out.write("                jQuery('.starbox').each(function () {\r\n");
      out.write("                    var starbox = jQuery(this);\r\n");
      out.write("                    starbox.starbox({\r\n");
      out.write("                        average: starbox.attr('data-start-value'),\r\n");
      out.write("                        changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,\r\n");
      out.write("                        ghosting: starbox.hasClass('ghosting'),\r\n");
      out.write("                        autoUpdateAverage: starbox.hasClass('autoupdate'),\r\n");
      out.write("                        buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,\r\n");
      out.write("                        stars: starbox.attr('data-star-count') || 5\r\n");
      out.write("                    }).bind('starbox-value-changed', function (event, value) {\r\n");
      out.write("                        if (starbox.hasClass('random')) {\r\n");
      out.write("                            var val = Math.random();\r\n");
      out.write("                            starbox.next().text(' ' + val);\r\n");
      out.write("                            return val;\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!---//End-rate---->\r\n");
      out.write("        <link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--header-->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"head\">\r\n");
      out.write("                    <div class=\" logo\">\r\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"></a>\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-top\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"col-sm-5 col-md-offset-2  header-login\">\r\n");
      out.write("                        <ul >\r\n");
      out.write("                            <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                            <li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("                            <li><a href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">Checkout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-5 header-social\">\t\t\r\n");
      out.write("                        <ul >\r\n");
      out.write("                            <li><a href=\"#\"><i></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic1\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic2\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic3\"></i></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"ic4\"></i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"head-top\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-8 col-md-offset-2 h_menu4\">\r\n");
      out.write("                        <nav class=\"navbar nav_bottom\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                            <div class=\"navbar-header nav_2\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav nav_1\">\r\n");
      out.write("                                    <li><a class=\"color\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                                    <li><a class=\"color2\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">Top</a></li>\r\n");
      out.write("                                    <li><a class=\"color3\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">Bottom</a></li>                        \r\n");
      out.write("                                    <li><a class=\"color4\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\">Shoes</a></li>\r\n");
      out.write("                                    <li><a class=\"color5\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\">Sale</a></li>\r\n");
      out.write("                                    <li><a class=\"color6\" href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div><!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2 search-right\">\r\n");
      out.write("                        <ul class=\"heart\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"wishlist.jsp\" >\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-heart\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            <li><a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><i class=\"glyphicon glyphicon-search\"> </i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"cart box_1\">\r\n");
      out.write("                            <a href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                                <h3> <div class=\"total\">\r\n");
      out.write("                                        <span class=\"simpleCart_total\">$");
      out.print(total);
      out.write("</span></div>\r\n");
      out.write("                                    <img src=\"images/cart.png\" alt=\"\"/></h3>\r\n");
      out.write("                            </a>\r\n");
      out.write("                                        <p><a href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" class=\"simpleCart_empty\">Empty Cart</a></p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"> </div>\r\n");
      out.write("\r\n");
      out.write("                        <!----->\r\n");
      out.write("\r\n");
      out.write("                        <!---pop-up-box---->\t\t\t\t\t  \r\n");
      out.write("                        <link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("                        <script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                        <!---//pop-up-box---->\r\n");
      out.write("                        <div id=\"small-dialog\" class=\"mfp-hide\">\r\n");
      out.write("                            <div class=\"search-top\">\r\n");
      out.write("                                <div class=\"login-search\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"\">\r\n");
      out.write("                                    <input type=\"text\" value=\"Search..\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                                            this.value = 'Search..';\r\n");
      out.write("                                                        }\">\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>Shopin</p>\r\n");
      out.write("                            </div>\t\t\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            $(document).ready(function () {\r\n");
      out.write("                                $('.popup-with-zoom-anim').magnificPopup({\r\n");
      out.write("                                    type: 'inline',\r\n");
      out.write("                                    fixedContentPos: false,\r\n");
      out.write("                                    fixedBgPos: true,\r\n");
      out.write("                                    overflowY: 'auto',\r\n");
      out.write("                                    closeBtnInside: true,\r\n");
      out.write("                                    preloader: false,\r\n");
      out.write("                                    midClick: true,\r\n");
      out.write("                                    removalDelay: 300,\r\n");
      out.write("                                    mainClass: 'my-mfp-zoom-in'\r\n");
      out.write("                                });\r\n");
      out.write("\r\n");
      out.write("                            });\r\n");
      out.write("                        </script>\t\t\r\n");
      out.write("                        <!----->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </div>\t\r\n");
      out.write("            </div>\t\r\n");
      out.write("        </div>\r\n");
      out.write('\r');
      out.write('\n');
 
    session.setAttribute("view", "/index"); 

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\r\n");
      out.write("    <!--content-->\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"content-mid\">\r\n");
      out.write("                <h3>New Items</h3>\r\n");
      out.write("                <label class=\"line\"></label>\r\n");
      out.write("                <div class=\"mid-popular\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mid-popular\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--products-->\r\n");
      out.write("        <div class=\"content-mid\">\r\n");
      out.write("            <h3>Trending Items</h3>\r\n");
      out.write("            <label class=\"line\"></label>\r\n");
      out.write("            <div class=\"mid-popular\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mid-popular\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--//products-->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "brand.jsp", out, false);
      out.write("\r\n");
      out.write("<!--//content-->\r\n");
      out.write("<!--light-box-files -->\r\n");
      out.write("<script src=\"js/jquery.chocolat.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\r\n");
      out.write("<!--light-box-files -->\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('a.picture').Chocolat();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!--//footer-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"footer-middle\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\r\n");
      out.write("                <a href=\"index.html\"><img src=\"images/log.png\" alt=\"\"></a>\r\n");
      out.write("                <p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\r\n");
      out.write("                <h6>Information</h6>\r\n");
      out.write("                <ul class=\" in\">\r\n");
      out.write("                    <li><a href=\"404.html\">About</a></li>\r\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Returns</a></li>\r\n");
      out.write("                    <li><a href=\"contact.html\">Site Map</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"in in1\">\r\n");
      out.write("                    <li><a href=\"#\">Order History</a></li>\r\n");
      out.write("                    <li><a href=\"wishlist.html\">Wish List</a></li>\r\n");
      out.write("                    <li><a href=\"login.html\">Login</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\r\n");
      out.write("                <h6>Tags</h6>\r\n");
      out.write("                <ul class=\"tag-in\">\r\n");
      out.write("                    <li><a href=\"#\">Lorem</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Sed</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Ipsum</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Contrary</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Chunk</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Amet</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Omnis</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\r\n");
      out.write("                <h6>Newsletter</h6>\r\n");
      out.write("                <span>Sign up for News Letter</span>\r\n");
      out.write("                <form>\r\n");
      out.write("                    <input type=\"text\" value=\"Enter your E-mail\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                                                            this.value = 'Enter your E-mail';\r\n");
      out.write("                                                                        }\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Subscribe\">\t\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <ul class=\"footer-bottom-top\">\r\n");
      out.write("                <li><a href=\"#\"><img src=\"images/f1.png\" class=\"img-responsive\" alt=\"\"></a></li>\r\n");
      out.write("                <li><a href=\"#\"><img src=\"images/f2.png\" class=\"img-responsive\" alt=\"\"></a></li>\r\n");
      out.write("                <li><a href=\"#\"><img src=\"images/f3.png\" class=\"img-responsive\" alt=\"\"></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <p class=\"footer-class\">&copy; 2016 Shopin. All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--//footer-->\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!--<script src=\"js/simpleCart.min.js\"></script> -->\r\n");
      out.write("<!-- slide -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("viewCart");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("category?Top");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("category?Bottom");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("category?Shoes");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("category?Sale");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("viewCart");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("viewCart?clear=true");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newProducts.subList(0,4)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-md-3 item-grid simpleCart_shelfItem\">\r\n");
          out.write("                        <div class=\" mid-pop\">\r\n");
          out.write("                            <div class=\"pro-img\">\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" alt=\"\">\r\n");
          out.write("                                <div class=\"zoom-icon \">\r\n");
          out.write("                                    <a class=\"picture\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\r\n");
          out.write("                                    <a href=\"");
          if (_jspx_meth_c_url_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"mid-1\">\r\n");
          out.write("                                <div class=\"women\">\r\n");
          out.write("                                    <div class=\"women-top\">\r\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                        <h6><a href=\"");
          if (_jspx_meth_c_url_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getTenSanPham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h6>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"img item_add\">\r\n");
          out.write("                                        <a href=\"");
          if (_jspx_meth_c_url_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"><img src=\"images/ca.png\" alt=\"\"></a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"mid-2\">\r\n");
          out.write("                                    <p><em class=\"item_price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getGiaTien()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</em></p>\r\n");
          out.write("                                    <div class=\"block\">\r\n");
          out.write("                                        <div class=\"starbox small ghosting\"> </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_8.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("addToCart?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("product");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newProducts.subList(4,8)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-md-3 item-grid simpleCart_shelfItem\">\r\n");
          out.write("                        <div class=\" mid-pop\">\r\n");
          out.write("                            <div class=\"pro-img\">\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" alt=\"\">\r\n");
          out.write("                                <div class=\"zoom-icon \">\r\n");
          out.write("                                    <a class=\"picture\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\r\n");
          out.write("                                    <a href=\"");
          if (_jspx_meth_c_url_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"mid-1\">\r\n");
          out.write("                                <div class=\"women\">\r\n");
          out.write("                                    <div class=\"women-top\">\r\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                        <h6><a href=\"");
          if (_jspx_meth_c_url_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getTenSanPham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h6>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"img item_add\">\r\n");
          out.write("                                        <a href=\"");
          if (_jspx_meth_c_url_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\"><img src=\"images/ca.png\" alt=\"\"></a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"mid-2\">\r\n");
          out.write("                                    <p><em class=\"item_price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getGiaTien()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</em></p>\r\n");
          out.write("                                    <div class=\"block\">\r\n");
          out.write("                                        <div class=\"starbox small ghosting\"> </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_10.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_11.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_12.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("addToCart?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("product");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trendProducts.subList(0,4)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-md-3 item-grid simpleCart_shelfItem\">\r\n");
          out.write("                        <div class=\" mid-pop\">\r\n");
          out.write("                            <div class=\"pro-img\">\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" alt=\"\">\r\n");
          out.write("                                <div class=\"zoom-icon \">\r\n");
          out.write("                                    <a class=\"picture\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\r\n");
          out.write("                                    <a href=\"");
          if (_jspx_meth_c_url_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"mid-1\">\r\n");
          out.write("                                <div class=\"women\">\r\n");
          out.write("                                    <div class=\"women-top\">\r\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                        <h6><a href=\"");
          if (_jspx_meth_c_url_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getTenSanPham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h6>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"img item_add\">\r\n");
          out.write("                                        <a href=\"");
          if (_jspx_meth_c_url_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\"><img src=\"images/ca.png\" alt=\"\"></a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"mid-2\">\r\n");
          out.write("                                    <p><em class=\"item_price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getGiaTien()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</em></p>\r\n");
          out.write("                                    <div class=\"block\">\r\n");
          out.write("                                        <div class=\"starbox small ghosting\"> </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_url_13.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_url_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_url_14.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_url_15.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("addToCart?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("product");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trendProducts.subList(4,8)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-md-3 item-grid simpleCart_shelfItem\">\r\n");
          out.write("                        <div class=\" mid-pop\">\r\n");
          out.write("                            <div class=\"pro-img\">\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" alt=\"\">\r\n");
          out.write("                                <div class=\"zoom-icon \">\r\n");
          out.write("                                    <a class=\"picture\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getAnh1()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\r\n");
          out.write("                                    <a href=\"");
          if (_jspx_meth_c_url_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"mid-1\">\r\n");
          out.write("                                <div class=\"women\">\r\n");
          out.write("                                    <div class=\"women-top\">\r\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getLoai()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                        <h6><a href=\"");
          if (_jspx_meth_c_url_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getTenSanPham()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h6>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"img item_add\">\r\n");
          out.write("                                        <a href=\"");
          if (_jspx_meth_c_url_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\"><img src=\"images/ca.png\" alt=\"\"></a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"mid-2\">\r\n");
          out.write("                                    <p><em class=\"item_price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getGiaTien()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</em></p>\r\n");
          out.write("                                    <div class=\"block\">\r\n");
          out.write("                                        <div class=\"starbox small ghosting\"> </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("\r\n");
          out.write("                                    <div class=\"clearfix\"></div>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_url_16.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_url_17.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_url_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_url_18.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("addToCart?${product.getIdsp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }
}
