package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//アカウント管理画面をフォワードするサーブレット
@WebServlet("/AccountManagement")
public class AccountManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AccountManagement() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AccountManagement.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータを取得
		String id_ch = request.getParameter("id_AM");
		String password_ch = request.getParameter("password_AM");
		String name_ch = request.getParameter("name_AM");

		//UPDATE文を指定する
		String sql = "UPDATE accountTable "
				+ "SET id = id_ch,password = password_ch,name = name_ch";

		try {
			//変更するDBのパラメータとSQL文を指定する。
			ps = conn.prepareStatement(sql);

			//UPDATE文を実行する
			int i = ps.executeUpdate();

			//コミット
			conn.commit();
		}catch (Exception ex) {

			conn.rollback();      //ロールバック
			ex.printStackTrace(); //エラー内容を表示する

		}finally {

		}

	}

}
