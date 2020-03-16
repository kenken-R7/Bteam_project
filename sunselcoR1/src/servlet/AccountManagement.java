package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;

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

		//アカウント管理画面をフォワードする
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
			PreparedStatement ps = conn.prepareStatement(sql);

			//UPDATE文を実行する
			int i = ps.executeUpdate();

			//コミット
			conn.commit();

			//画面分岐
			boolean b = true;

		}catch (Exception ex) {

			conn.rollback();      //ロールバック
			ex.printStackTrace(); //エラー内容を表示する
			boolean b = false;

		}finally {

			if(
					b == true){
				//アカウント変更成功画面をフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AccountChangeResulte.jsp");
				dispatcher.forward(request, response);
			}else {
				//アカウント変更失敗画面をフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AccountChangeFailure.jsp");
				dispatcher.forward(request, response);
			}
		}

	}

}
