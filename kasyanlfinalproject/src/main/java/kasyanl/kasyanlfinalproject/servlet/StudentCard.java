package kasyanl.kasyanlfinalproject.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentCard extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = 0;
        Student s = Student.total.get(i);
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                " <meta charset=\"UTF-8\">\n" +
                " <title>timer</title>\n" +
                "</head>\n" +
                "<body align=\"center\">\n" +
                "<h1> This one will never change! </h1>\n" +
                "<table align=\"center\">\n" +
                " <tr>\n" +
                " <td>\n" +
                " <img src=\"https://upload.wikimedia.org /wikipedia/commons/a/a0/Reuni%C3%A3o_com_o_ator_norteamericano_Keanu_Reeves_%28cropped%29.jpg\"\n" +
                " width=\"150px\"\n" +
                " height=\"150px\"/>\n" +
                " </td>\n" +
                " <td>" + s.getName() + " " + s.getLastName() + " <br/>" + s.getEmail() + "</td>\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");
    }
}

