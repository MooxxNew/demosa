package org.apache.jsp.WEB_002dINF.views.demo.sa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class province_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("Province");
      out.write("</legend>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"province\" class=\"col-md-4 control-label\">");
      out.write("Province");
      out.write("</label>");
      out.write("<div class=\"col-md-4 input-group\">");
      out.write("<input class=\"form-control\" type=\"text\" id=\"province\" />");
      out.write("<div class=\"input-group-btn\">");
      out.write("<span class=\"input-group-btn\">");
      out.write("<button type=\"button\" onclick=\"findProvince()\" class=\"btn btn-info\">");
      out.write("Find");
      out.write("</button>");
      out.write("<button type=\"button\" onclick=\"addProvince()\" class=\"btn btn-success\">");
      out.write("Add");
      out.write("</button>");
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</fieldset>");
      out.write("</form>");
      out.write("<form class=\"form-horizontal\">");
      out.write("<fieldset>");
      out.write("<div class=\"form-group\">");
      out.write("<div class=\"col-md-12 col-md-offset-0\">");
      out.write("<div class=\"table-responsive\">");
      out.write("<table class=\"table\" id=\"tbProvince\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write('#');
      out.write("</th>");
      out.write("<th>");
      out.write("Province");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"idProvince\">");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</fieldset>");
      out.write("</form>");
      out.write("<script>");
      out.write("\n");
      out.write("        function addProvince(){\n");
      out.write("            var province = $('#province').val();\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"addprovince\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                data: {\n");
      out.write("                    province: province\n");
      out.write("                },\n");
      out.write("                statusCode: {\n");
      out.write("                    200: function(data) {\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        $('#idProvince').empty()\n");
      out.write("                        $.each(obj,function(i){\n");
      out.write("                            var newRowContent = \"<tr class=\\\"active\\\"><th>\"+ obj[i].id +\"</th><th>\"+ obj[i].name +\"</th></tr>\";\n");
      out.write("                            $(newRowContent).appendTo($('#tbProvince'))\n");
      out.write("                        })\n");
      out.write("                        sweetAlert(\"Success\")\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        function findProvince(){\n");
      out.write("            var province = $('#province').val();\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"findprovince\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                data: {\n");
      out.write("                    province: province\n");
      out.write("                },\n");
      out.write("                statusCode: {\n");
      out.write("                    200: function(data) {\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        $('#idProvince').empty()\n");
      out.write("                        $.each(obj,function(i){\n");
      out.write("                            var newRowContent = \"<tr class=\\\"active\\\"><th>\"+ obj[i].id +\"</th><th>\"+ obj[i].name +\"</th></tr>\";\n");
      out.write("                            $(newRowContent).appendTo($('#tbProvince'))\n");
      out.write("                        })\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    ");
      out.write("</script>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProvince}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("province");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr class=\"active\">");
          out.write("<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>");
          out.write("<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>");
          out.write("</tr>");
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
}
