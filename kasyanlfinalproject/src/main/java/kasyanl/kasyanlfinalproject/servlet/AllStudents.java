package kasyanl.kasyanlfinalproject.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllStudents extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                " <meta charset=\"UTF-8\">\n" +
                " <title>timer</title>\n" +
                "</head>\n" +
                "<body align=\"center\">\n" +
                "<h1> time is passing. people changed </h1>\n" +
                "<table align=\"center\">\n" +
                " <tr>\n" +
                " <th>id</th>\n" +
                " <th>name</th>\n" +
                " <th>lastName</th>\n" +
                " <th>email</th>\n" +
                " <th>age</th>\n" +
                " </tr>\n");
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
        out.print("" +
                " <tr>\n" +
                " <th>id</th>\n" +
                " <th>name</th>\n" +
                " <th>lastName</th>\n" +
                " <th>email</th>\n" +
                " <th>age</th>\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");

    }

}
