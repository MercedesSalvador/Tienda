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
 * Servlet implementation class ListaUsuarios
 */
@WebServlet("/usuario")
public class ListaUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Usuario> listaUsuarios = new UsuarioDAO().getUsuarios();
		
		request.setAttribute("listadoUsuarios", listaUsuarios);
		
		//response.sendRedirect("/jsp/usua/lista.jsp");
		
		request.getRequestDispatcher("/jsp/usuario/lista.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect(request.getContextPath() + "/jsp/login/lista.jsp");
	}

}
