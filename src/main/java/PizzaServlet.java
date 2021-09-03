import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response){

        String crust = request.getParameter("crust");
        String size = request.getParameter("size");
        String sauce = request.getParameter("sauce");
        String address = request.getParameter("address");
String [] toppings = request.getParameterValues("toppings");

        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        System.out.println(Arrays.toString(toppings));
        System.out.println(address);
    }

}
