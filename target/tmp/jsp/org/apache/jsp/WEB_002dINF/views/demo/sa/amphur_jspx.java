package org.apache.jsp.WEB_002dINF.views.demo.sa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amphur_jspx extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("Amphur");
      out.write("</legend>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"amphur\" class=\"col-md-4 control-label\">");
      out.write("Amphur");
      out.write("</label>");
      out.write("<div class=\"col-md-4 input-group\">");
      out.write("<input class=\"form-control\" type=\"text\" id=\"amphur\" />");
      out.write("<div class=\"input-group-btn\">");
      out.write("<span class=\"input-group-btn\">");
      out.write("<button type=\"button\" onclick=\"findAmphur()\" class=\"btn btn-info\">");
      out.write("Find");
      out.write("</button>");
      out.write("<button type=\"button\" onclick=\"findProvince()\" class=\"btn btn-success\" data-target=\"#myModal\" data-toggle=\"modal\">");
      out.write("Add");
      out.write("</button>");
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div role=\"dialog\" class=\"modal fade\" id=\"myModal\">");
      out.write("<div class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<h4 class=\"modal-title\">");
      out.write("Add Amphur");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<form class=\"form-horizontal\">");
      out.write("<fieldset>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"amphurName\" class=\"col-md-4 control-label\">");
      out.write("Amphur");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<input class=\"form-control input-md\" placeholder=\"Name\" type=\"text\" name=\"amphurName\" id=\"amphurName\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"province\" class=\"col-md-4 control-label\">");
      out.write("Province");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<select class=\"form-control\" name=\"pr\" id=\"province\">");
      out.write("<option disabled=\"disabled\" selected=\"selected\" value=\"\">");
      out.write("Province");
      out.write("</option>");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"postalcode\" class=\"col-md-4 control-label\">");
      out.write("Postal Code");
      out.write("</label>");
      out.write("<div class=\"col-md-4\">");
      out.write("<input class=\"form-control input-md\" placeholder=\"Postal Code\" type=\"text\" name=\"Price\" id=\"postalcode\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("</fieldset>");
      out.write("</form>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<button onclick=\"addAmphur()\" data-dismiss=\"modal\" class=\"btn btn-success\" type=\"button\">");
      out.write("Add");
      out.write("</button>");
      out.write("<button data-dismiss=\"modal\" class=\"btn btn-default\" type=\"button\">");
      out.write("Close");
      out.write("</button>");
      out.write("</div>");
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
      out.write("<table class=\"table\" id=\"tbAmphur\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write('#');
      out.write("</th>");
      out.write("<th>");
      out.write("Amphur");
      out.write("</th>");
      out.write("<th>");
      out.write("Province");
      out.write("</th>");
      out.write("<th>");
      out.write("Postal Code");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"idAmphur\">");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
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
      out.write("        function findAmphur(){\n");
      out.write("            var amphur = $('#amphur').val();\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"findamphur\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                data: {\n");
      out.write("                    amphur: amphur\n");
      out.write("                },\n");
      out.write("                statusCode: {\n");
      out.write("                    200: function(data) {\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        console.log(obj)\n");
      out.write("                        $('#idAmphur').empty()\n");
      out.write("                        $.each(obj,function(i){\n");
      out.write("                            var newRowContent = \"<tr class=\\\"active\\\"><th>\"+ obj[i].id +\"</th><th>\"+ obj[i].name +\"</th><th>\"+ obj[i].province.name +\"</th><th>\"+ obj[i].postal_code +\"</th></tr>\";\n");
      out.write("                            $(newRowContent).appendTo($('#tbAmphur'))\n");
      out.write("                        })\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function addAmphur(){\n");
      out.write("            var amphur = $('#amphurName').val();\n");
      out.write("            var province = $('#province').children(\":selected\").attr(\"id\");\n");
      out.write("            var postalcode = $('#postalcode').val();\n");
      out.write("\n");
      out.write("            sweetAlert(amphur + \" \" + province + \" \" + postalcode)\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"addamphur\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                data: {\n");
      out.write("                    amphur: amphur,\n");
      out.write("                    province: province,\n");
      out.write("                    postalcode: postalcode\n");
      out.write("                },\n");
      out.write("                statusCode: {\n");
      out.write("                    200: function(data) {\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        $('#tbAmphur').empty()\n");
      out.write("                        $.each(obj,function(i){\n");
      out.write("                            var newRowContent = \"<tr class=\\\"active\\\"><th>\"+ obj[i].id +\"</th><th>\"+ obj[i].name +\"</th><th>\"+ obj[i].province.name +\"</th><th>\"+ obj[i].postal_code +\"</th></tr>\";\n");
      out.write("                            $(newRowContent).appendTo($('#tbAmphur'))\n");
      out.write("                        })\n");
      out.write("                        sweetAlert(\"Success\")\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function findProvince(){\n");
      out.write("            var province =\"$\"\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"findprovince\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                data: {\n");
      out.write("                    province: province\n");
      out.write("                },\n");
      out.write("                statusCode: {\n");
      out.write("                    200: function(data) {\n");
      out.write("                        console.log(data)\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        $('#province').empty()\n");
      out.write("                        $.each(obj,function(i){\n");
      out.write("                            var opt = new Option(obj[i].name);\n");
      out.write("                            opt.setAttribute(\"id\",obj[i].id)\n");
      out.write("                            $('#province').append(opt)\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
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
          out.write("<option id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.id}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAmphur}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("amphur");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr class=\"active\">");
          out.write("<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${amphur.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>");
          out.write("<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${amphur.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>");
          out.write("<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${amphur.province.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>");
          out.write("<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${amphur.postal_code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>");
          out.write("</tr>");
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
}
