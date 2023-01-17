package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Kadai;

/**
 * Servlet implementation class RegisterConfirmServlet
 */
@WebServlet("/KadaiConfirmServlet")
public class KadaiConfimServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KadaiConfimServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
		
        String mail = request.getParameter("mail");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		int grade = Integer.parseInt(request.getParameter("grade"));
		String division = request.getParameter("division");
		
		
		Kadai kadai = new Kadai(-1, mail, pw, name, grade, division, null, null);
	
		
		// セッションスコープのインスタンス取得
		HttpSession session = request.getSession();
		
		// セッションスコープに値の保存
		// 第1引数：キー
		// 第2引数：保存する値
		session.setAttribute("input_data", kadai);
		
		String view = "WEB-INF/view/sample-confirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}