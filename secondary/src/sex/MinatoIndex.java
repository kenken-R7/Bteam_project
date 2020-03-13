package sex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MinatoIndex
 */
@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MinatoIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application=this.getServletContext();
		SiteEV siteEV=(SiteEV)application.getAttribute("siteEV");
		
		
		if(siteEV==null) {
			siteEV=new SiteEV();
		}
		
		request.setCharacterEncoding("UTF-8");
		String action=request.getParameter("action");
		
		SiteEVLogic siteEVLogic=new SiteEVLogic();
		if(action!=null&&action.equals("like")) {
			siteEVLogic.like(siteEV);
		}else if(action!=null&&action.equals("dislike")) {
			siteEVLogic.dislike(siteEV);
		}
		application.setAttribute("siteEV", siteEV);
		RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/minatoIndex.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
