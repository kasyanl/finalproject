<%@ page import="java.util.*" %>
<%@ page import="kasyanl.kasyanlfinalproject.servlet.Student" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>timer</title>
    <link href="./css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body align="center">
<h1> time is passing. people changed </h1>
<table align="center">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>lastName</th>
        <th>email</th>
        <th>age</th>
    </tr>
    <%
        for (Student s : Student.total) {
            out.print("<a href=\"mytime/student/" + s.getId() + "\">" +
                    " <tr>\n" +
                    " <td><a href=\"/mytime/student/?id=" + s.getId() + "\">" + s.getId() + "</a></td>\n" +
                    " <td><a href=\"/mytime/student/?id=" + s.getId() + "\">" + s.getName() + "</a></td>\n" +
                    " <td><a href=\"/mytime/student/?id=" + s.getId() + "\">" + s.getLastName() + "</a></td>\n" +
                    " <td><a href=\"/mytime/student/?id=" + s.getId() + "\">" + s.getEmail() + "</a></td></a>\n" +
                    " <td><a href=\"/mytime/student/?id=" + s.getId() + "\">" + s.getAge() + "</a></td>\n" +
                    " </tr>\n");
        }
    %>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>lastName</th>
        <th>email</th>
        <th>age</th>
    </tr>
</table>
</body>
</html>