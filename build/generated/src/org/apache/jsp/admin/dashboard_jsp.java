package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.dao.UserDao;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        <!-- plugins:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"node_modules/mdi/css/materialdesignicons.min.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- plugin css for this page -->\n");
      out.write("        <!-- End plugin css for this page -->\n");
      out.write("        <!-- inject:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/favicon.png\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"body-wrapper\">\n");
      out.write("            <!-- partial:partials/_sidebar.html -->\n");
      out.write("            <aside class=\"mdc-persistent-drawer mdc-persistent-drawer--open\">\n");
      out.write("                <nav class=\"mdc-persistent-drawer__drawer\">\n");
      out.write("                    <div class=\"mdc-persistent-drawer__toolbar-spacer\">\n");
      out.write("                        <a href=\"dashboard.jsp\" class=\"brand-logo\">\n");
      out.write("                            <img src=\"assets/images/logo.svg\" alt=\"logo\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdc-list-group\">\n");
      out.write("                        <nav class=\"mdc-list mdc-drawer-menu\">\n");
      out.write("                            <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                <a class=\"mdc-drawer-link\" href=\"dashboard.jsp\">\n");
      out.write("                                    <i class=\"material-icons mdc-list-item__start-detail mdc-drawer-item-icon\" aria-hidden=\"true\">desktop_mac</i>\n");
      out.write("                                    Dashboard\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                    <i class=\"material-icons mdc-list-item__start-detail mdc-drawer-item-icon\" aria-hidden=\"true\">track_changes</i>\n");
      out.write("                                    Create Event \n");
      out.write("                                </a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"mdc-list-item mdc-drawer-item\" href=\"#\" data-toggle=\"expansionPanel\" target-panel=\"ui-sub-menu\">\n");
      out.write("                                <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                    <i class=\"material-icons mdc-list-item__start-detail mdc-drawer-item-icon\" aria-hidden=\"true\">dashboard</i>\n");
      out.write("                                    UI Features\n");
      out.write("                                    <i class=\"mdc-drawer-arrow material-icons\">arrow_drop_down</i>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"mdc-expansion-panel\" id=\"ui-sub-menu\">\n");
      out.write("                                    <nav class=\"mdc-list mdc-drawer-submenu\">\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                                Buttons\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                                Typography\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                    <i class=\"material-icons mdc-list-item__start-detail mdc-drawer-item-icon\" aria-hidden=\"true\">grid_on</i>\n");
      out.write("                                    Tables\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                    <i class=\"material-icons mdc-list-item__start-detail mdc-drawer-item-icon\" aria-hidden=\"true\">pie_chart_outlined</i>\n");
      out.write("                                    Charts\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-list-item mdc-drawer-item\" href=\"#\" data-toggle=\"expansionPanel\" target-panel=\"sample-page-submenu\">\n");
      out.write("                                <a class=\"mdc-drawer-link\" href=\"#\">\n");
      out.write("                                    <i class=\"material-icons mdc-list-item__start-detail mdc-drawer-item-icon\" aria-hidden=\"true\">pages</i>\n");
      out.write("                                    Sample Pages\n");
      out.write("                                    <i class=\"mdc-drawer-arrow material-icons\">arrow_drop_down</i>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"mdc-expansion-panel\" id=\"sample-page-submenu\">\n");
      out.write("                                    <nav class=\"mdc-list mdc-drawer-submenu\">\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/blank-page.html\">\n");
      out.write("                                                Blank Page\n");
      out.write("                                            </a>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/403.html\">\n");
      out.write("                                                403\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/404.html\">\n");
      out.write("                                                404\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/500.html\">\n");
      out.write("                                                500\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/505.html\">\n");
      out.write("                                                505\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/login.html\">\n");
      out.write("                                                Login\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-list-item mdc-drawer-item\">\n");
      out.write("                                            <a class=\"mdc-drawer-link\" href=\"pages/samples/register.html\">\n");
      out.write("                                                Register\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </aside>\n");
      out.write("            <!-- partial -->\n");
      out.write("            <!-- partial:partials/_navbar.html -->\n");
      out.write("            <header class=\"mdc-toolbar mdc-elevation--z4 mdc-toolbar--fixed\">\n");
      out.write("                <div class=\"mdc-toolbar__row\">\n");
      out.write("                    <section class=\"mdc-toolbar__section mdc-toolbar__section--align-start\">\n");
      out.write("                        <a href=\"#\" class=\"menu-toggler material-icons mdc-toolbar__menu-icon\">menu</a>\n");
      out.write("                        <span class=\"mdc-toolbar__input\">\n");
      out.write("                            <div class=\"mdc-text-field\">\n");
      out.write("                                <input type=\"text\" class=\"mdc-text-field__input\" id=\"css-only-text-field-box\" placeholder=\"Search anything...\">\n");
      out.write("                            </div>\n");
      out.write("                        </span>\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"mdc-toolbar__section mdc-toolbar__section--align-end\" role=\"toolbar\">\n");
      out.write("                        <div class=\"mdc-menu-anchor\">\n");
      out.write("                            <a href=\"#\" class=\"mdc-toolbar__icon toggle mdc-ripple-surface\" data-toggle=\"dropdown\" toggle-dropdown=\"notification-menu\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                <i class=\"material-icons\">notifications</i>\n");
      out.write("                                <span class=\"dropdown-count\">3</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"mdc-simple-menu mdc-simple-menu--right\" tabindex=\"-1\" id=\"notification-menu\">\n");
      out.write("                                <ul class=\"mdc-simple-menu__items mdc-list\" role=\"menu\" aria-hidden=\"true\">\n");
      out.write("                                    <li class=\"mdc-list-item\" role=\"menuitem\" tabindex=\"0\">\n");
      out.write("                                        <i class=\"material-icons mdc-theme--primary mr-1\">email</i>\n");
      out.write("                                        One unread message\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"mdc-list-item\" role=\"menuitem\" tabindex=\"0\">\n");
      out.write("                                        <i class=\"material-icons mdc-theme--primary mr-1\">group</i>\n");
      out.write("                                        One event coming up\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"mdc-list-item\" role=\"menuitem\" tabindex=\"0\">\n");
      out.write("                                        <i class=\"material-icons mdc-theme--primary mr-1\">cake</i>\n");
      out.write("                                        It's Aleena's birthday!\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mdc-menu-anchor\">\n");
      out.write("                            <a href=\"#\" class=\"mdc-toolbar__icon mdc-ripple-surface\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                <i class=\"material-icons\">widgets</i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mdc-menu-anchor mr-1\">\n");
      out.write("                            <a href=\"#\" class=\"mdc-toolbar__icon toggle mdc-ripple-surface\" data-toggle=\"dropdown\" toggle-dropdown=\"logout-menu\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                <i class=\"material-icons\">more_vert</i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"mdc-simple-menu mdc-simple-menu--right\" tabindex=\"-1\" id=\"logout-menu\">\n");
      out.write("                                <ul class=\"mdc-simple-menu__items mdc-list\" role=\"menu\" aria-hidden=\"true\">\n");
      out.write("                                    <li class=\"mdc-list-item\" role=\"menuitem\" tabindex=\"0\">\n");
      out.write("                                        <i class=\"material-icons mdc-theme--primary mr-1\">settings</i>\n");
      out.write("                                        Settings\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"mdc-list-item\" role=\"menuitem\" tabindex=\"0\">\n");
      out.write("                                        <i class=\"material-icons mdc-theme--primary mr-1\">power_settings_new</i>\n");
      out.write("                                        Logout\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- partial -->\n");
      out.write("            <div class=\"page-wrapper mdc-toolbar-fixed-adjust\">\n");
      out.write("                <main class=\"content-wrapper\">\n");
      out.write("                    <div class=\"mdc-layout-grid\">\n");
      out.write("                        <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                            <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8\">\n");
      out.write("                                <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                                    <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                                        <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                                            <div class=\"mdc--tile mdc--tile-danger rounded\">\n");
      out.write("                                                <i class=\"mdi mdi-account-settings text-white icon-md\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-wrapper pl-1\">\n");
      out.write("                                                <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">300</h3>\n");
      out.write("                                                <p class=\"font-weight-normal mb-0 mt-0\">New Users Added This Month</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                                        <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                                            <div class=\"mdc--tile mdc--tile-success rounded\">\n");
      out.write("                                                <i class=\"mdi mdi-basket text-white icon-md\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-wrapper pl-1\">\n");
      out.write("                                                <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">783</h3>\n");
      out.write("                                                <p class=\"font-weight-normal mb-0 mt-0\">Total Users</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                                        <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                                            <div class=\"mdc--tile mdc--tile-warning rounded\">\n");
      out.write("                                                <i class=\"mdi mdi-ticket text-white icon-md\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-wrapper pl-1\">\n");
      out.write("                                                <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">69</h3>\n");
      out.write("                                                <p class=\"font-weight-normal mb-0 mt-0\">Volunteers</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                                        <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                                            <div class=\"mdc--tile mdc--tile-primary rounded\">\n");
      out.write("                                                <i class=\"mdi mdi-account-star text-white icon-md\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"text-wrapper pl-1\">\n");
      out.write("                                                <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">5785</h3>\n");
      out.write("                                                <p class=\"font-weight-normal mb-0 mt-0\">New Visitors</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4\">\n");
      out.write("                                <div class=\"mdc-card d-flex flex-column\">\n");
      out.write("                                    <div class=\"mdc-layout-grid__inner flex-grow-1\">\n");
      out.write("                                        <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3\"></div>\n");
      out.write("                                        <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex align-item-center flex-column\">\n");
      out.write("                                            <h2 class=\"mdc-card__title mdc-card__title--large text-center mt-2 mb-2\">Recent Event</h2>\n");
      out.write("                                            <div id=\"currentBalanceCircle\" class=\"w-100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                                        <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                                            <section class=\"mdc-card__action-footer mt-4 bg-red w-100\">\n");
      out.write("                                                <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                                    <i class=\"mdi mdi-store icon-md\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                                    <i class=\"mdi mdi-phone-plus icon-md\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                                    <i class=\"mdi mdi-share-variant icon-md\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                                    <i class=\"mdi mdi-autorenew icon-md\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </section>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                                <div class=\"mdc-card table-responsive\">\n");
      out.write("                                    <div class=\"table-heading px-2 px-1 border-bottom\">\n");
      out.write("                                        <h1 class=\"mdc-card__title mdc-card__title--large\">User List</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th class=\"text-left\">Name</th>\n");
      out.write("                                                <th class=\"text-left\">Email</th>\n");
      out.write("                                                <th class=\"text-left\">Username</th>\n");
      out.write("                                                <th class=\"text-left\">Mobile</th>\n");
      out.write("                                                <th class=\"text-left\">Gender</th>\n");
      out.write("                                                <th class=\"text-left\">Age</th>\n");
      out.write("                                                <th class=\"text-left\">City</th>\n");
      out.write("                                                <th class=\"text-left\">State</th>\n");
      out.write("                                                <th class=\"text-left\">Address</th>\n");
      out.write("                                                <th >Actions</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");

                                                UserDao userDao = new UserDao();
                                                ResultSet rs = userDao.selectAll();
                                                while (rs.next()) {
                                                    if (Integer.parseInt(rs.getString("type")) != 1) {
                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("name"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("email"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("username"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("mobile"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("age"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("gender"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("cityId"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("stateId"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"text-left\">\n");
      out.write("                                                    ");
      out.print( rs.getString("address"));
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td >\n");
      out.write("                                                    <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                                                        <i class=\"mdi mdi-heart text-blue\" onclick=\"#\" >\n");
      out.write("                                                            Delete User\n");
      out.write("                                                        </i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                    }
                                                }
                                            
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("                <!-- partial:partials/_footer.html -->\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"mdc-layout-grid\">\n");
      out.write("                        <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                            <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                                <span class=\"text-muted\">Copyright © 2019 Ajava10. All rights reserved.</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex justify-content-end\">\n");
      out.write("                                <span class=\"mt-0 text-right\">Hand-crafted &amp; made with bootstrap<i class=\"mdi mdi-heart text-red\"></i></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- partial -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- body wrapper -->\n");
      out.write("        <!-- plugins:js -->\n");
      out.write("        <script src=\"node_modules/material-components-web/dist/material-components-web.min.js\"></script>\n");
      out.write("        <script src=\"node_modules/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- Plugin js for this page-->\n");
      out.write("        <script src=\"node_modules/chart.assets/js/dist/Chart.min.js\"></script>\n");
      out.write("        <script src=\"node_modules/progressbar.assets/js/dist/progressbar.min.js\"></script>\n");
      out.write("        <!-- End plugin js for this page-->\n");
      out.write("        <!-- inject:js -->\n");
      out.write("        <script src=\"assets/js/misc.js\"></script>\n");
      out.write("        <script src=\"assets/js/material.js\"></script>\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- Custom js for this page-->\n");
      out.write("        <script src=\"assets/js/dashboard.js\"></script>\n");
      out.write("        <!-- End custom js for this page-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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