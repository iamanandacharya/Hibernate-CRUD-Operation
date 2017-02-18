package payroll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import payroll.dao.Dao;
import payroll.daolempl.Daolempl;

import payroll.vo.EmpDeductionVo;

/**
 * Servlet implementation class AddEmpDeduction
 */
@WebServlet("/AddEmpDeduction")
public class AddEmpDeduction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpDeduction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao ObjDAO = new Daolempl();
		String ProfTax= request.getParameter("ProfTax");
		String with_hold= request.getParameter("with_hold");
		String IncomeTax= request.getParameter("IncomeTax");
		String other_deduction= request.getParameter("other_deduction");
		String TotalDeduction= request.getParameter("TotalDeduction");
		String pf= request.getParameter("pf");
		String Month= request.getParameter("Month");
		String year= request.getParameter("year");
		String ModifiedDate= request.getParameter("ModifiedDate");
		String EmpCode= request.getParameter("emp_code");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("ProfTax", ProfTax);
		session.setAttribute("with_hold", with_hold);
		session.setAttribute("IncomeTax", IncomeTax);
		session.setAttribute("other_deduction", other_deduction);
		session.setAttribute("TotalDeduction", TotalDeduction);
		session.setAttribute("pf", pf);
		session.setAttribute("Month", Month);
		
		session.setAttribute("ModifiedDate", ModifiedDate);
		session.setAttribute("year", year);
		
		session.setAttribute("EmpCode", EmpCode);
		try {
			//this method and object call direct controller class(Logindata.java) 
			//List<EmpListVO> emplistss = LoginData.addEmpDatas(EmpName,Presentadd,City, Pincode, Permanantaddrss, Phnum, Mobnum,  Bloodgroup, Nationality ,Languageknown ,pancardNum, Emptype, Empgrade, Empcode, Empsignature);
			//session.setAttribute("emplists", emplistss);
			//this mathod and object implements in interface and classes and than call controller class (Logindata.java)
			List<EmpDeductionVo> empDeduLists = ObjDAO.addEmpDeduData(ProfTax,with_hold,IncomeTax,other_deduction,TotalDeduction, pf, Month, ModifiedDate,year,  EmpCode);
			session.setAttribute("empDeduLists", empDeduLists);
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<script type=text/javascript>");
		  	out.println("alert('Data Sent Successfully')");
		  	out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("/EmpDedDetails.jsp");
			rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
	}
	}
