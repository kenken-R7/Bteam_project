package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accountDelete")
public class accountDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public accountDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String accountId = id;

		//DELETE文を指定する
		String sql = "DELETE FROM accountTable "
				+ "WHERE id = accountId";

		try {
			//変更するDBのパラメータとSQL文を指定する。
			PreparedStatement ps = conn.prepareStatement(sql);

			//UPDATE文を実行する
			int i = ps.executeUpdate();

			//コミット
			conn.commit();

		}catch (Exception ex) {

			conn.rollback();      //ロールバック
			ex.printStackTrace(); //エラー内容を表示する

		}finally {

			//トップ画面をフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
			dispatcher.forward(request, response);

			}
		}
	}

}
