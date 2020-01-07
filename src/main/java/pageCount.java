import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
@WebServlet(name = "pageCount", urlPatterns = "/count")
public class pageCount extends HttpServlet {
    private int hitCount;
    public void init(){
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String clearPage = request.getParameter("clearCount");
        if (clearPage != null && clearPage.equalsIgnoreCase("True")){
            hitCount=0;
        }
        hitCount++;
        out.printf("<h1>Page Viewed: %s</h1>%n",hitCount);
    }

}
