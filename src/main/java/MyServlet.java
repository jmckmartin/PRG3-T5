import java.io.*;
import java.util.stream.Collectors;
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
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reqBody=req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        resp.setContentType("text/html");
        resp.getWriter().write("Thank you client! "+reqBody);
    }
}