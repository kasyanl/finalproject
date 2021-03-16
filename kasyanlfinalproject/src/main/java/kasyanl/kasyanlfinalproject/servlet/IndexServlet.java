package kasyanl.kasyanlfinalproject.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        " <meta charset=\"UTF-8\">\n" +
                        " <title>Timer Index</title>\n" +
                        "</head>\n" +
                        "<body align=\"center\">\n" +
                        "<h1> time is passing </h1>\n" +
                        "<a href=\"/students\">all students</a> | <a href=\"/students/add\">add student</a>\n" +
                        "</body>\n" +
                        "</html>"
        );
        if(Student.total.size()==0) {
            Student.total.add(new Student(0L, "Maksim", "Shelkovich",
                    "my@email", 35));
        }
    }
}