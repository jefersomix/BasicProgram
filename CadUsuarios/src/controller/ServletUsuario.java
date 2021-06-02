package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email, nome, senha, rsenha, perfil, opcao;

		opcao = request.getParameter("opcao");

		if (opcao.equals("Adicionar")) {
			email = request.getParameter("email");
			nome = request.getParameter("nome");
			senha = request.getParameter("senha");
			rsenha = request.getParameter("rsenha");
			perfil = request.getParameter("perfil");
			Usuario usuario = new Usuario(email, nome, senha, perfil);
			try {
				UsuarioDAO dao = new UsuarioDAO();
				dao.adicionar(usuario);
				response.getWriter().append("gravado com sucesso ").append(request.getContextPath());

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else if(opcao.equals("Excluir")) {
			email = request.getParameter("email");
			Usuario usuario = new Usuario();
			usuario.setEmail(email);
			
			try {
				UsuarioDAO dao = new UsuarioDAO();
				dao.excluir(usuario);
				response.getWriter().append("excluido com sucesso ").append(request.getContextPath());
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
		}

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
