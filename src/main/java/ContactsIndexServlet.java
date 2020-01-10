import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContactsIndexServlet", urlPatterns = "/contacts")
public class ContactsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("contacts", DaoFactory.getContactsDao().getContacts());
        request.getRequestDispatcher("/contacts/index.jsp").forward(request, response);
    }
}
