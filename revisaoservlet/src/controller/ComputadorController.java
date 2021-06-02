package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComputadorDAO;
import model.Computador;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome, descricao, ip;
		int sala;
		char bloco;

		nome = request.getParameter("nomeComputador");
		descricao = request.getParameter("descricaoComputador");
		ip = request.getParameter("ipComputador");
		sala = Integer.parseInt(request.getParameter("salaComputador"));
		bloco = request.getParameter("blocoComputador").charAt(0);

		// add no banco de dados
		String opcao = request.getParameter("opcao");
		// criat objeto do computador
		Computador computador = new Computador(nome, descricao, ip, sala, bloco);

		ComputadorDAO dao;
		try {
			dao = new ComputadorDAO();
			if (opcao.equals("opcao")) {
				try {
					boolean inserir = dao.inserir(computador);
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}

		// usando a view
		RequestDispatcher ir = request.getRequestDispatcher("view/listacomputador.jsp");

		// usando a model e enviando a requisição para view
		request.setAttribute("computador", computador);

		ir.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}