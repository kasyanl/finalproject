package kasyanl.kasyanlfinalproject.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Index extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        " <meta charset=\"UTF-8\">" +
                        " <title>Timer Index</title>" +
                        "</head>\n" +
                        "<body align=\"center\">" +
                        "<h1> time is passing </h1>" +
                        "<a href=\"/students\">all students</a> | <a href=\"/students/add\">add student</a>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }
}
