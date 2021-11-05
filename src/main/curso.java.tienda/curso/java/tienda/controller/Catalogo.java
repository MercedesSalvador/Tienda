package curso.java.tienda.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.model.Producto;
import curso.java.tienda.model.ProductoDAO;


/**
 * Servlet implementation class catalogo
 */
@WebServlet("/catalogo")
public class Catalogo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalogo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException {
	}
    
  /*  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
	}*/
    	
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

    	ArrayList<Producto> listado = new ProductoDAO().getProductos();
		
		request.setAttribute("listadoProductos", listado);
		
		//response.sendRedirect("/jsp/catalogo/lista.jsp");
		
		request.getRequestDispatcher("/jsp/catalogo/lista.jsp").forward(request, response);
		//processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/
	


}
