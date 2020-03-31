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

//アカウントを削除するサーブレット
@WebServlet("/AccountDelete")
public class AccountDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AccountDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//アカウント削除画面をフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accountDelete.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//DAOの生成
		UserDAO dao = new UserDAO();

		//検索用IDを用意する
		HttpSession session = request.getSession();
		UserBean u = (UserBean) session.getAttribute("user");
		String seachId = u.getId();

		try {
			// DAOの利用
			boolean b = dao.accountDelete(seachId);

			if(b == true){
				//アカウント削除成功のフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accountDeleteResult.jsp");
				dispatcher.forward(request, response);
			}else {
				//アカウント削除失敗のフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/accountDeleteFailure.jsp");
				dispatcher.forward(request, response);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
