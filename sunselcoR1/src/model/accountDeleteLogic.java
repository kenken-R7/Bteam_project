package model;

import javax.servlet.RequestDispatcher;

public class accountDeleteLogic {

	//削除するアカウントのIDを格納
	String accountId = id;

	//DELETE文を指定する
	String sql = "DELETE FROM accountTable "
			+ "WHERE id = accountId"

	try {
		//変更するDBのパラメータとSQL文を指定する。
		ps = conn.prepareStatement(sql);

		//DELETE文を実行する
		int i = ps.executeUpdate();

		//コミット
		conn.commit();

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
