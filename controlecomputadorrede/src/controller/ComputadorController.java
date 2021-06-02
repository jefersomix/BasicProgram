package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComputadorController
 */
@WebServlet("/ComputadorController")
public class ComputadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ComputadorController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome,ip,descricao,bloco;
		int sala;
		double memoria;
		
		nome=request.getParameter("nomeComputador");
		ip = request.getParameter("ipComputador");
		descricao=request.getParameter("descricaoComputador");
		sala=Integer.parseInt(request.getParameter("salaComputador"));
		bloco=request.getParameter("blocoComputador");
		memoria= Double.parseDouble(request.getParameter("memoriaComputador"));
		
		PrintWriter imprimir = response.getWriter();
		
		imprimir.print("<br>nome: "+nome);
		imprimir.print("<br>ip: "+ip);
		imprimir.print("<br>sala: "+sala);
		imprimir.print("<br>bloco: "+bloco);
		imprimir.print("<br>memoria RAM: "+memoria);
		imprimir.print("<br>descricao: "+descricao);
		
		RequestDispatcher ir = request.getRequestDispatcher("view/mostrarcomputador.jsp");
		ir.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
