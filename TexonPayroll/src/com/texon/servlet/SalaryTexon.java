package com.texon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.texon.Dao.Dao;
import com.texon.daolmpl.DaoLmpl;
import com.texon.vo.EmpListVO;
import com.texon.vo.SalaryVO;

/**
 * Servlet implementation class SalaryTexon
 */
@WebServlet("/SalaryTexon")
public class SalaryTexon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dao ObjDAO = new DaoLmpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalaryTexon() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		System.out.println("Name "+ name);
		List<SalaryVO> salList = ObjDAO.salaryAllUserView(name);
		 String retVals = gson.toJson(salList);
		 pw.append(retVals);
	}

}