import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns={"/patients"},loadOnStartup = 1)

public class MyServlet extends HttpServlet{

    //override HttpServlet’s implementation of the doGet method
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
    IOException{
        resp.setContentType("text/html");
        resp.getWriter().write("Hello, world!");
        req.getServletPath();
    }

    //override HttpServlet’s implementation of the doPost method
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
    IOException{
    }
}