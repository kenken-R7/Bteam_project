package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;


@WebServlet("/GameProgress")

public class GameProgress extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public GameProgress() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//ServletContextインスタンスの取得
		HttpSession session=request.getSession();
		//アプリケーションスコープからインスタンスを取得
		UserBean userbean = (UserBean) session.getAttribute("user");
		int level = userbean.getLevel();

		String fowardPath = null;

		switch(level) {

		case 0:

			fowardPath = "/WEB-INF/jsp/OP.jsp";

			break;
		default:

			fowardPath = "/WEB-INF/jsp/gameStart.jsp";

			break;
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(fowardPath);
		dispatcher.forward(request, response);
	}
}
