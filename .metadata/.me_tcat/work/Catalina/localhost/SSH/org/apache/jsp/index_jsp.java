package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>ç»é</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"style/reset.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"style/main.css\">\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/DD_belatedPNG_0.0.8a-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ie6Fixpng.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"headerBar\">\r\n");
      out.write("\t<div class=\"logoBar login_logo\">\r\n");
      out.write("\t\t<div class=\"comWidth\">\r\n");
      out.write("\t\t\t<div class=\"logo fl\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"images/logo.jpg\" alt=\"æè¯¾ç½\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<h3 class=\"welcome_title\">æ¬¢è¿ç»é</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<form action=\"frame.html\" method=\"post\">\r\n");
      out.write("<div class=\"loginBox\">\r\n");
      out.write("\t<div class=\"login_cont\">\r\n");
      out.write("\t\t<ul class=\"login\">\r\n");
      out.write("\t\t\t<li class=\"l_tit\">ç¨æ·å</li>\r\n");
      out.write("\t\t\t<li class=\"mb_10\"><input type=\"text\" class=\"login_input user_icon\"></li>\r\n");
      out.write("\t\t\t<li class=\"l_tit\">å¯ç </li>\r\n");
      out.write("\t\t\t<li class=\"mb_10\"><input type=\"text\" class=\"login_input user_icon\"></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li><input type=\"submit\" value=\"\" class=\"login_btn\"></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div class=\"login_partners\">\r\n");
      out.write("\t\t\t<p class=\"l_tit\">ä½¿ç¨åä½æ¹è´¦å·ç»éç½ç«</p>\r\n");
      out.write("\t\t\t<ul class=\"login_list clearfix\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">QQ</a></li>\r\n");
      out.write("\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">ç½æ</a></li>\r\n");
      out.write("\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">æ°æµªå¾®å</a></li>\r\n");
      out.write("\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">è¾è®¯å¾®è</a></li>\r\n");
      out.write("\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">æ°æµªå¾®å</a></li>\r\n");
      out.write("\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">è¾è®¯å¾®è</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div class=\"hr_25\"></div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<p><a href=\"#\">æè¯¾ç®ä»</a><i>|</i><a href=\"#\">æè¯¾å¬å</a><i>|</i> <a href=\"#\">æçº³è´¤å£«</a><i>|</i><a href=\"#\">èç³»æä»¬</a><i>|</i>å®¢æç­çº¿ï¼400-675-1234</p>\r\n");
      out.write("\t<p>Copyright &copy; 2006 - 2014 æè¯¾çæææ&nbsp;&nbsp;&nbsp;äº¬ICPå¤09037834å·&nbsp;&nbsp;&nbsp;äº¬ICPè¯B1034-8373å·&nbsp;&nbsp;&nbsp;æå¸å¬å®å±XXåå±å¤æ¡ç¼å·ï¼123456789123</p>\r\n");
      out.write("\t<p class=\"web\"><a href=\"#\"><img src=\"images/webLogo.jpg\" alt=\"logo\"></a><a href=\"#\"><img src=\"images/webLogo.jpg\" alt=\"logo\"></a><a href=\"#\"><img src=\"images/webLogo.jpg\" alt=\"logo\"></a><a href=\"#\"><img src=\"images/webLogo.jpg\" alt=\"logo\"></a></p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
