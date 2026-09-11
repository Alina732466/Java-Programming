<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Cookie</title>
</head>

<body>

<h2>Display Cookie</h2>

<%
String username = null;
Cookie[] cookies = request.getCookies();

if (cookies != null) {
    for (Cookie cookie : cookies) {
        if ("username".equals(cookie.getName())) {
            username = cookie.getValue();
            break;
        }
    }
}

if (username != null) {
%>

<h2>Welcome, <%= username %>!</h2>

<%
} else {
%>

<h2>Username cookie not found.</h2>

<%
}
%>

</body>
</html>