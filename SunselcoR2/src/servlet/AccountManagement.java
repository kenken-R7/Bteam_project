package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean;
import model.dao.UserDAO;

//アカウント管理画面をフォワードするサーブレット
@WebServlet("/AccountManagement")
public class AccountManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AccountManagement() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//アカウント管理画面をフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AccountManagement.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータを取得
		String id_ch = request.getParameter("id_AM");
		String password_ch = request.getParameter("password_AM");
		String name_ch = request.getParameter("name_AM");

		//DAOの生成
		UserDAO dao = new UserDAO();

		//検索用IDを用意する
		UserBean userbean = new UserBean();
		String seachId = userbean.getId();

		try {
			// DAOの利用
			boolean b = dao.accountDelete(id_ch,password_ch,name_ch,seachId);

			if(b == true){
				//アカウント変更成功画面をフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AccountChangeResulte.jsp");
				dispatcher.forward(request, response);
			}else {
				//アカウント変更失敗画面をフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AccountChangeFailure.jsp");
				dispatcher.forward(request, response);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
