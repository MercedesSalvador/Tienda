package curso.java.tienda.model;

import java.util.ArrayList;


public class ProductoDAO {
	
	public ArrayList<Producto> getProductos(){
		ArrayList<Producto> listado = new ArrayList<Producto>();
		Producto producto1 = new Producto("Tractor de juguete John Deere","Medidas(cm): 38,5X16,5X17x7",40.50,50);
		listado.add(producto1);
		Producto producto2 = new Producto("Cosechadora De Juguete John Deere T670i ","Medidas(cm): 60,3X47,3X23,7",60.20,40);
		listado.add(producto2);
		return listado;
	}

}
