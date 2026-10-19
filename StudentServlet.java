import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Student Details</title></head><body>");
        out.println("<h2>Student Details Form - Servlet</h2>");

        out.println("<form method='post' action='StudentServlet'>");
        out.println("Name: <input type='text' name='name' required><br><br>");
        out.println("Register Number: <input type='text' name='regno' required><br><br>");
        out.println("Department: <input type='text' name='dept' required><br><br>");
        out.println("Email: <input type='email' name='email' required><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String regno = request.getParameter("regno");
        String dept = request.getParameter("dept");
        String email = request.getParameter("email");

        out.println("<html><head><title>Student Information</title></head><body>");

        out.println("<h2>Submitted Student Details</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Register Number:</b> " + regno + "</p>");
        out.println("<p><b>Department:</b> " + dept + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");

        out.println("<br><a href='StudentServlet'>Back</a>");
        out.println("</body></html>");
    }
}