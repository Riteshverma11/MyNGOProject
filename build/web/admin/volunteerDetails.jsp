<%-- 
    Document   : volunteerDetails
    Created on : 4 Nov, 2019, 11:40:04 AM
    Author     : Ritesh Verma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.VolunteerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Volunteer Details</title>
    </head>
    <body>
        <jsp:include page="blocks/nav.jsp"></jsp:include>

            <div class="body-wrapper">
            <jsp:include page="blocks/nav.jsp"></jsp:include>
            <jsp:include page="blocks/header.jsp"></jsp:include>
                <div class="body-wrapper">
                    <div class="page-wrapper mdc-toolbar-fixed-adjust">
                        <main class="content-wrapper">
                            <div class="mdc-layout-grid">
                                <div class="mdc-layout-grid__inner">
                                    <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8">
                                        <div class="mdc-layout-grid__inner">
                                        </div>
                                    </div>
                                    <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                                        <div class="mdc-card table-responsive">
                                            <div class="table-heading px-2 px-1 border-bottom">
                                                <h1 class="mdc-card__title mdc-card__title--large">Volunteer List</h1>
                                            </div>
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th class="text-left">Name</th>
                                                        <th class="text-left">Email</th>
                                                        <th class="text-left">Username</th>
                                                        <th class="text-left">Mobile</th>
                                                        <th class="text-left">Gender</th>
                                                        <th class="text-left">Age</th>
                                                        <th class="text-left">City</th>
                                                        <th class="text-left">State</th>
                                                        <th class="text-left">Address</th>
                                                        <th >Actions</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                <%
                                                    VolunteerDao volunteerDao = new VolunteerDao();
                                                    ResultSet rs = volunteerDao.selectVolunteer();
                                                    while (rs.next()) {
                                                %>

                                                <tr>
                                                    <td class="text-left">
                                                        <%= rs.getString("name")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("email")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("username")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("mobile")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("age")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("gender")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("cityId")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("stateId")%>
                                                    </td>
                                                    <td class="text-left">
                                                        <%= rs.getString("address")%>
                                                    </td>
                                                    <td >
                                                        <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                                                            <i class="mdi mdi-heart text-blue" onclick="#" >
                                                                Remove
                                                            </i>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </main>
                    <jsp:include page="blocks/footer.jsp"></jsp:include>
                    </div>
                </div>
            </div>
        <jsp:include page="blocks/header.jsp"></jsp:include>
    </body>
</html>
