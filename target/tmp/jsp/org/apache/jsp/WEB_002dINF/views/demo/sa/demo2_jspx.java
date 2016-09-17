package org.apache.jsp.WEB_002dINF.views.demo.sa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo2_jspx extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>");
      out.write("<head>");
      out.write("<title>");
      out.write("Demo");
      out.write("</title>");
      out.write("</head>");
      out.write("<body>");
      out.write("<form class=\"form-horizontal\">");
      out.write("<fieldset>");
      out.write("<legend>");
      out.write("Test Pizza");
      out.write("</legend>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"Name\" class=\"col-md-4 control-label\">");
      out.write("Name");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<input class=\"form-control input-md\" placeholder=\"Name\" type=\"text\" name=\"Name\" id=\"Name\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"Price\" class=\"col-md-4 control-label\">");
      out.write("Price");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<input class=\"form-control input-md\" placeholder=\"Price\" type=\"text\" name=\"Price\" id=\"Price\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"appendedtext\" class=\"col-md-4 control-label\">");
      out.write("Find topping");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<div class=\"input-group\">");
      out.write("<input type=\"text\" placeholder=\"Topping\" class=\"form-control\" name=\"appendedtext\" id=\"appendedtext\" />");
      out.write("<span class=\"input-group-addon\">");
      out.write("find");
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"checkboxes\" class=\"col-md-4 control-label\">");
      out.write("Topping");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<div class=\"checkbox\">");
      out.write("<label for=\"checkboxes-0\">");
      out.write("<input value=\"1\" id=\"checkboxes-0\" name=\"checkboxes\" type=\"checkbox\" />");
      out.write("\n");
      out.write("                            topping 1\n");
      out.write("                        ");
      out.write("</label>");
      out.write("</div>");
      out.write("<div class=\"checkbox\">");
      out.write("<label for=\"checkboxes-1\">");
      out.write("<input value=\"2\" id=\"checkboxes-1\" name=\"checkboxes\" type=\"checkbox\" />");
      out.write("\n");
      out.write("                            topping 2\n");
      out.write("                        ");
      out.write("</label>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"topping\" class=\"col-md-4 control-label\">");
      out.write("Topping");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<div class=\"table-responsive\">");
      out.write("<table class=\"table\">");
      out.write("<tbody>");
      out.write("<tr class=\"active\">");
      out.write("<th>");
      out.write("topping1");
      out.write("</th>");
      out.write("</tr>");
      out.write("<tr class=\"active\">");
      out.write("<th>");
      out.write("topping2");
      out.write("</th>");
      out.write("</tr>");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"Base\" class=\"col-md-4 control-label\">");
      out.write("Base");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<select class=\"form-control\" name=\"Base\" id=\"Base\">");
      out.write("<option value=\"1\">");
      out.write("Pan");
      out.write("</option>");
      out.write("<option value=\"2\">");
      out.write("Thin");
      out.write("</option>");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"Egde\" class=\"col-md-4 control-label\">");
      out.write("Egde");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<select class=\"form-control\" name=\"Egde\" id=\"Egde\">");
      out.write("<option value=\"1\">");
      out.write("Chessy");
      out.write("</option>");
      out.write("<option value=\"2\">");
      out.write("Sausage");
      out.write("</option>");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("</fieldset>");
      out.write("</form>");
      out.write("</body>");
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
}
