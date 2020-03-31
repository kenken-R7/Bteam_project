package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDAO;

@WebServlet("/CreateAccount")

public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public CreateAccount() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/createAccount.jsp");
    dispatcher.forward(request, response);



	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
UserDAO dao=new UserDAO();
try {
dao.accountMake(id, password, name);
boolean isLogin=dao.loginCheck(id, password);
if(isLogin) {


		//アカウント登録成功画面をフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/createResult.jsp");
		dispatcher.forward(request,response);

		}else {
		//アカウント登録失敗画面をフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateFailure.jsp");
		dispatcher.forward(request, response);
		}

	}catch(SQLException e) {
		e.printStackTrace();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateFailure.jsp");
		dispatcher.forward(request, response);
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateFailure.jsp");
		dispatcher.forward(request, response);
	}finally {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/CreateFailure.jsp");
		dispatcher.forward(request, response);
	}
	}
	}
