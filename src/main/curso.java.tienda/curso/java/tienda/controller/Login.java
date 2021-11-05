package curso.java.tienda.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.model.Usuario;
import curso.java.tienda.model.UsuarioDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario> listaUsuarios = new UsuarioDAO().getUsuarios();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * protected void processRequest(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * String nombre = request.getParameter("nombre"); String clave =
	 * request.getParameter("clave");
	 * 
	 * Usuario usuario = new Usuario();
	 * 
	 * if(UsuarioDAO.comprobarLogin(usuario)) {
	 * //response.sendRedirect("Login.html");
	 * request.getRequestDispatcher("/jsp/login/saludo.jsp").forward(request,
	 * response); } else {
	 * request.getRequestDispatcher("/jsp/login/login.html").forward(request,
	 * response); } }
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);
		response.sendRedirect(request.getContextPath() + "/jsp/login/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String clave = request.getParameter("clave");

		Usuario usuario = new Usuario(clave,nombre);
		if (!nombre.equals("") && !clave.equals("")) {
			if (UsuarioDAO.comprobarLogin(usuario)) {
				request.setAttribute("usuario", usuario);
				// response.sendRedirect("Login.html");
				request.getRequestDispatcher("/jsp/login/saludo.jsp").forward(request, response);
			} else {
				String mensaje = "Nombre o contraseña incorrectos";
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("/jsp/login/login.jsp").forward(request, response);
				//response.sendRedirect(request.getContextPath() + "/jsp/login/login.jsp");
			}
		}

	}
}
