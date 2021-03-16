package kasyanl.kasyanlfinalproject.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        LocalDateTime time = LocalDateTime.now();
        out.println("<html>" +
                " <body>" +
                "<h1 align=center> The simplest servlet</h1>" +
                "<p align=center><b>" + time +
                "</b></p>" +
                "</body>" +
                "</html>");
    }
}
