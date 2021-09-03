import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingServlet", value = "/guess")
public class GuessingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     int userGuessNumber = Integer.parseInt(request.getParameter("guessed_number"));

     Random random = new Random();
     int min = 1;
     int max = 3;

     int randomInt = random.nextInt(max - min + 1) + min;

     if(randomInt == userGuessNumber){
response.sendRedirect("/right");
     }else{
         response.sendRedirect("/wrong");
     }
    }
}
