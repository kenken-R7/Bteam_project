package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		//アカウント管理画面をフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accountManagement.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータを取得
		String id_ch = request.getParameter("id");
		String password_ch = request.getParameter("password");
		String name_ch = request.getParameter("name");

		//DAOの生成
		UserDAO dao = new UserDAO();

		//検索用IDを用意する
		HttpSession session = request.getSession();
		UserBean u = (UserBean) session.getAttribute("user");
		String seachId = u.getId();

		try {
			// DAOの利用
			boolean b = dao.accountChange(id_ch,password_ch,name_ch,seachId);

			if(b == true){
				//アカウント変更成功画面をフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accountChangeResult.jsp");
				dispatcher.forward(request, response);
			}else {
				//アカウント変更失敗画面をフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accountChangeFailure.jsp");
				dispatcher.forward(request, response);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
