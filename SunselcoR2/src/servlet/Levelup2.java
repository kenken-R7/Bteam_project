package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;
import model.dao.ConnectionManager;

/**
 * Servlet implementation class Levelup2
 */
@WebServlet("/Levelup2")
public class Levelup2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Levelup2() {
        super();
    }
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		HttpSession session=request.getSession();
   		UserBean registerUser=(UserBean)session.getAttribute("user");

   		//データベースに接続するンゴ
   				try(Connection conn=ConnectionManager.getConnection()){
   				//UPDATEするんご

   					String sql="UPDATE accounttable SET level=level+1 WHERE id==? ";
   					PreparedStatement pStmt=conn.prepareStatement(sql);
   					pStmt.setString(1, registerUser.getId());
   					RequestDispatcher dispatcher=request.getRequestDispatcher("/GameProgress");
   					dispatcher.forward(request, response);
   				}catch (SQLException | ClassNotFoundException e) {
   					e.printStackTrace();
   				}
   			}
   	}




