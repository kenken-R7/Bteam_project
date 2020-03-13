package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public MenuServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext appl=this.getServletContext();
		boolean isLogin=(boolean)appl.getAttribute("isLogin");
		if(isLogin) {
			RequestDispatcher dis=request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis=request.getRequestDispatcher("/WebSougou/");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			}

}
