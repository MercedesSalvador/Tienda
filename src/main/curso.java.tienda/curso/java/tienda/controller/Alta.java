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
 * Servlet implementation class Alta
 */
@WebServlet("/alta")
public class Alta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario> listaUsuarios = new UsuarioDAO().getUsuarios();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Alta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/jsp/login/alta.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		
		Usuario usuario = new Usuario(email,clave,nombre,apellido1,apellido2);
		
		if(UsuarioDAO.existeUsuario(usuario)) {
			request.setAttribute("usuario", usuario);
			//listaUsuarios.add(new Usuario(email, clave,nombre, apellido1, apellido2));
			request.getRequestDispatcher("/jsp/login/saludo.jsp").forward(request, response);
		}
		else {
			String mensaje = "El usuario ya existe";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("/jsp/login/alta.jsp").forward(request, response);
			//response.sendRedirect(request.getContextPath() + "/jsp/login/alta.jsp");
		}
	}
}


