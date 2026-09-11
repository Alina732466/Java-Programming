
<%@ page import="javax.servlet.http.Cookie" %>

<%
String username = request.getParameter("username");

Cookie cookie = new Cookie("username", username);
cookie.setMaxAge(60 * 60 * 24);

response.addCookie(cookie);

response.sendRedirect("getCookie.jsp");
%>