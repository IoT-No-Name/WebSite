/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2017-03-26 21:38:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Nazar/.m2/repository/org/springframework/spring-webmvc/4.0.1.RELEASE/spring-webmvc-4.0.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1390903082000L));
    _jspx_dependants.put("file:/C:/Users/Nazar/.m2/repository/org/springframework/spring-webmvc/4.0.1.RELEASE/spring-webmvc-4.0.1.RELEASE.jar", Long.valueOf(1490390816399L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"UTF-8\">\r\n");
      out.write("      <title>Registration Form</title>\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"resources/custom.css\">\r\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js\"></script>\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("      <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("      <link href=\"http://netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("      <div class=\"testbox\">\r\n");
      out.write("         <h1>Registration</h1>\r\n");
      out.write("         ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/pages/registration.jsp(16,9) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("USER");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <hr>\r\n");
          out.write("            <div class=\"accounttype\">\r\n");
          out.write("               <input type=\"radio\" value=\"Customer\" id=\"radioOne\" name=\"typeOfUser\" checked/>\r\n");
          out.write("               <label for=\"radioOne\" class=\"radio\" chec>Customer</label>\r\n");
          out.write("               <input type=\"radio\" value=\"Freelancer\" id=\"radioTwo\" name=\"typeOfUser\" />\r\n");
          out.write("               <label for=\"radioTwo\" class=\"radio\">Freelancer</label>\r\n");
          out.write("            </div>\r\n");
          out.write("            <hr>\r\n");
          out.write("            <label id=\"icon\" for=\"name\"><i class=\"icon-envelope \"></i></label>\r\n");
          out.write("            <input path=\"email\" type=\"text\" email=\"email\" id=\"name\" placeholder=\"Email\" required/>\r\n");
          out.write("            <label id=\"icon\" for=\"name\"><i class=\"icon-user\"></i></label>\r\n");
          out.write("            <input path=\"name\" input type=\"text\" name=\"name\" id=\"name\" placeholder=\"Name\" required/>\r\n");
          out.write("            <label id=\"icon\" for=\"name\"><i class=\"icon-user\"></i></label>\r\n");
          out.write("            <input path=\"age\" input type=\"text\" age=\"age\" id=\"name\" placeholder=\"Age\" required/>\r\n");
          out.write("            <label id=\"icon\" for=\"name\"><i class=\"icon-shield\"></i></label>\r\n");
          out.write("            <input path=\"password\" input type=\"password\" password=\"password\" id=\"name\" placeholder=\"Password\" required/>\r\n");
          out.write("            <div class=\"gender\">\r\n");
          out.write("               <input type=\"radio\" value=\"Male\" id=\"radioOne1\" name=\"sex\" checked/>\r\n");
          out.write("               <label for=\"radioOne1\" class=\"radio\" chec>Male</label>\r\n");
          out.write("               <input type=\"radio\" value=\"Female\" id=\"radioTwo2\" name=\"sex\" />\r\n");
          out.write("               <label for=\"radioTwo2\" class=\"radio\">Female</label>\r\n");
          out.write("            </div>\r\n");
          out.write("            <p>By clicking Register, you agree on our <a href=\"#\">terms and condition</a>.</p>\r\n");
          out.write("            <name=\"form1\" id=\"form1\" >\r\n");
          out.write("            <a href=\"accounts\"</a>\r\n");
          out.write("                <a input type=\"submit\" class=\"button\" href=\"accounts\">Register</a>\r\n");
          out.write("\r\n");
          out.write("            </form>\r\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fcommandName.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}