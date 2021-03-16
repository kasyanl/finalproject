package kasyanl.kasyanlfinalproject.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class AddStudent extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        LocalDateTime time = LocalDateTime.now();
        out.println(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        " <meta charset=\"UTF-8\">\n" +
                        " <title>timer</title>\n" +
                        "</head>\n" +
                        "<body align=\"center\">\n" +
                        "<h1> time is passing </h1>\n" +
                        "<form action=\"/mytime/students/add\" method=\" post\" >\n" +
                        " <input name=\"name\" placeholder=\"name\" type=\"text\"/> <br />\n" +
                        " <input name=\"lastName\" placeholder=\" lastName\" type=\"text\"/> <br />\n" +
                        " <input name=\"age\" placeholder=\"age\" type=\"text\"/> <br />\n" +
                        " <input name=\"email\" placeholder=\" email\" type=\"text\"/> <br />\n" +
                        " <input type=\"submit\" value=\"Save\">\n" +
                        "</form>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Student student = Student.builder()
                .name(request.getParameter("name"))
                .lastName(request.getParameter("lastName"))
                .email(request.getParameter("email"))
                .age(Integer.valueOf(request.getParameter("age")))
                .id(Long.valueOf(Student.total.size()))
                .build();
        Student.total.add(student);
    }
}