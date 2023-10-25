package firstWeb;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("User name =" +request.getParameter("name")+"Password ="+request.getParameter("password"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if("scott".equals(name) && "tiger".equals(password)) {
			request.setAttribute("message", "Hi Scott.... now have you been");
		}
		else {
			request.setAttribute("message", "Hi Scott.... is a Valid User");
		}
		request.getRequestDispatcher("Loginresult.jsp").forward(request, response);
	}

}
