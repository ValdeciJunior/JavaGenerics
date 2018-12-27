package grafico;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> lista = new ArrayList<Shape>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
		List<?> ls = lista;
	}

}
